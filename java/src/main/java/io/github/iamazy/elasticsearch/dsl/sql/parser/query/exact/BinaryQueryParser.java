package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext.FullTextQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext.LikeQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo.GeoQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.join.JoinQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.nested.NestedQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.score.ScoreQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.*;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class BinaryQueryParser extends AbstractExactQueryParser {

    private final GeoQueryParser geoQueryParser;
    private final JoinQueryParser joinQueryParser;
    private final LikeQueryParser likeQueryParser;
    private final InListQueryParser inListQueryParser;
    private final NestedQueryParser nestedQueryParser;
    private final FullTextQueryParser fullTextQueryParser;
    private final ScoreQueryParser scoreQueryParser;
    private final BetweenAndQueryParser betweenAndQueryParser;
    public BinaryQueryParser(){
        geoQueryParser=new GeoQueryParser();
        joinQueryParser=new JoinQueryParser();
        likeQueryParser=new LikeQueryParser();
        inListQueryParser=new InListQueryParser();
        nestedQueryParser=new NestedQueryParser();
        fullTextQueryParser=new FullTextQueryParser();
        scoreQueryParser=new ScoreQueryParser();
        betweenAndQueryParser=new BetweenAndQueryParser();
    }


    private AtomicQuery parseBinaryQuery(ElasticsearchParser.BinaryContext binaryContext) {
        if(binaryContext.operator!=null) {
            int operatorType = binaryContext.operator.getType();
            //EQ NEQ AEQ
            // Will any one query by `not approximately equal` ?  no !!!
            if (operatorType == ElasticsearchParser.EQ || operatorType == ElasticsearchParser.NE || operatorType == ElasticsearchParser.AEQ || operatorType == ElasticsearchParser.TEQ) {
                String targetVal = binaryContext.rightExpr.getText();
                SqlConditionOperator operator;
                switch (operatorType) {
                    case ElasticsearchParser.NE: {
                        operator = SqlConditionOperator.NotEqual;
                        break;
                    }
                    case ElasticsearchParser.AEQ: {
                        operator = SqlConditionOperator.ApproximatelyEqual;
                        break;
                    }
                    case ElasticsearchParser.TEQ: {
                        operator = SqlConditionOperator.MatchPrase;
                        break;
                    }
                    default:
                    case ElasticsearchParser.EQ: {
                        operator = SqlConditionOperator.Equality;
                        break;
                    }
                }
                return parseCondition(binaryContext.leftExpr, operator, new Object[]{targetVal}, (fieldName, operator1, rightParams) -> {
                    switch (operator1) {
                        case NotEqual: {
                            return QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(fieldName, rightParams[0]));
                        }
                        case ApproximatelyEqual: {
                            return QueryBuilders.matchQuery(fieldName, StringManager.removeStringSymbol(rightParams[0].toString()));
                        }
                        case MatchPrase: {
                            return QueryBuilders.matchPhraseQuery(fieldName, StringManager.removeStringSymbol(rightParams[0].toString()));
                        }
                        default:
                        case Equality: {
                            return QueryBuilders.termQuery(fieldName, StringManager.removeStringSymbol(rightParams[0].toString()));
                        }
                    }
                });
            }
            // AND OR && ||
            else if (operatorType == ElasticsearchParser.AND ||
                    operatorType == ElasticsearchParser.OR) {
                ElasticsearchParser.ExpressionContext leftExpr = binaryContext.leftExpr;
                ElasticsearchParser.ExpressionContext rightExpr = binaryContext.rightExpr;
                if (binaryContextMatch(leftExpr) && binaryContextMatch(rightExpr)) {
                    AtomicQuery leftQuery = parseExpressionContext(leftExpr);
                    AtomicQuery rightQuery = parseExpressionContext(rightExpr);

                    BoolQueryBuilder boolQueryBuilder;
                    if (operatorType == ElasticsearchParser.AND) {
                        boolQueryBuilder = QueryBuilders.boolQuery().must(leftQuery.getQueryBuilder())
                                .must(rightQuery.getQueryBuilder());
                    } else {
                        boolQueryBuilder = QueryBuilders.boolQuery().should(leftQuery.getQueryBuilder())
                                .should(rightQuery.getQueryBuilder());
                    }
                    return new AtomicQuery(boolQueryBuilder);
                } else {
                    throw new ElasticSql2DslException("expressions on  both sides of [and or && ||] must be binary context");
                }
            }
            // GT GTE LT LTE
            else if (operatorType == ElasticsearchParser.GT ||
                    operatorType == ElasticsearchParser.GTE ||
                    operatorType == ElasticsearchParser.LT ||
                    operatorType == ElasticsearchParser.LTE) {
                SqlConditionOperator operator;
                switch (operatorType) {
                    case ElasticsearchParser.GT: {
                        operator = SqlConditionOperator.GreaterThan;
                        break;
                    }
                    case ElasticsearchParser.GTE: {
                        operator = SqlConditionOperator.GreaterThanOrEqual;
                        break;
                    }
                    case ElasticsearchParser.LT: {
                        operator = SqlConditionOperator.LessThan;
                        break;
                    }
                    default:
                    case ElasticsearchParser.LTE: {
                        operator = SqlConditionOperator.LessThanOrEqual;
                        break;
                    }
                }
                String targetVal = binaryContext.rightExpr.getText();
                return parseCondition(binaryContext.leftExpr, operator, new Object[]{targetVal}, (fieldName, operator1, rightParams) -> {
                    RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery(fieldName);
                    switch (operator1) {
                        case GreaterThan: {
                            return rangeQuery.gt(rightParams[0]);
                        }
                        case GreaterThanOrEqual: {
                            return rangeQuery.gte(rightParams[0]);
                        }
                        case LessThan: {
                            return rangeQuery.lt(rightParams[0]);
                        }
                        default:
                        case LessThanOrEqual: {
                            return rangeQuery.lte(rightParams[1]);
                        }
                    }
                });
            }
        }
        //IS | IS NOT
        else if (binaryContext.isClause() != null) {
            ElasticsearchParser.IsClauseContext isClauseContext = binaryContext.isClause();
            return parseIsContext(isClauseContext);
        }
        //LIKE | NOT LIKE
        else if (binaryContext.likeClause() != null) {
            ElasticsearchParser.LikeClauseContext likeClauseContext = binaryContext.likeClause();
            return likeQueryParser.parse(likeClauseContext);
        }
        throw new ElasticSql2DslException("[syntax error] not supported yet");
    }


    private AtomicQuery parseIsContext(ElasticsearchParser.IsClauseContext isContext){
        SqlConditionOperator operator = isContext.not == null ? SqlConditionOperator.IsNull : SqlConditionOperator.IsNotNull;
        return parseCondition(isContext.field, operator, null, (fieldName, operator1, rightParams) -> {
            ExistsQueryBuilder existsQueryBuilder = QueryBuilders.existsQuery(fieldName);
            switch (operator1) {
                case IsNull: {
                    return QueryBuilders.boolQuery().mustNot(existsQueryBuilder);
                }
                default:
                case IsNotNull: {
                    return existsQueryBuilder;
                }
            }
        });
    }

    public AtomicQuery parseExpressionContext(ElasticsearchParser.ExpressionContext expressionContext){
        if (expressionContext instanceof ElasticsearchParser.BinaryContext) {
            ElasticsearchParser.BinaryContext leftBinary = (ElasticsearchParser.BinaryContext) expressionContext;
            return parseBinaryQuery(leftBinary);
        } else if(expressionContext instanceof ElasticsearchParser.LrExprContext){
            ElasticsearchParser.LrExprContext leftLrExpr = (ElasticsearchParser.LrExprContext) expressionContext;
            return parseExpressionContext(leftLrExpr.expression());
        }else if(expressionContext instanceof ElasticsearchParser.GeoContext){
            ElasticsearchParser.GeoContext geoContext=(ElasticsearchParser.GeoContext)expressionContext;
            return geoQueryParser.parse(geoContext);
        }else if(expressionContext instanceof ElasticsearchParser.JoinContext){
            return joinQueryParser.parse((ElasticsearchParser.JoinContext) expressionContext);
        }else if(expressionContext instanceof ElasticsearchParser.InContext){
            return inListQueryParser.parse((ElasticsearchParser.InContext) expressionContext);
        }else if(expressionContext instanceof ElasticsearchParser.NestedContext){
            return nestedQueryParser.parse((ElasticsearchParser.NestedContext) expressionContext);
        }else if(expressionContext instanceof ElasticsearchParser.FullTextContext){
            return fullTextQueryParser.parse((ElasticsearchParser.FullTextContext) expressionContext);
        }else if(expressionContext instanceof ElasticsearchParser.BetweenAndContext){
            return betweenAndQueryParser.parse((ElasticsearchParser.BetweenAndContext) expressionContext);
        }else if(expressionContext instanceof ElasticsearchParser.ScoreContext){
            return scoreQueryParser.parse((ElasticsearchParser.ScoreContext) expressionContext);
        }
        else{
            throw new ElasticSql2DslException("not support yet");
        }
    }

    private boolean binaryContextMatch(ElasticsearchParser.ExpressionContext expressionContext){
        if(expressionContext instanceof ElasticsearchParser.BinaryContext){
            return true;
        }
        if(expressionContext instanceof ElasticsearchParser.LrExprContext){
            return true;
        }
        if(expressionContext instanceof ElasticsearchParser.GeoContext){
            return true;
        }
        if(expressionContext instanceof ElasticsearchParser.NestedContext){
            return true;
        }
        if(expressionContext instanceof ElasticsearchParser.FullTextContext){
            return true;
        }
        return expressionContext instanceof ElasticsearchParser.JoinContext;
    }
}
