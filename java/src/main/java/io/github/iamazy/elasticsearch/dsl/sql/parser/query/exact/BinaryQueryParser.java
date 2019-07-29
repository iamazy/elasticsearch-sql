package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import org.elasticsearch.index.query.*;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class BinaryQueryParser extends AbstractExactQueryParser {

    public AtomicQuery parseBinaryQuery(ElasticsearchParser.BinaryContext binaryContext) {
        int operatorTokenIndex = binaryContext.operator.getTokenIndex();
        //EQ NEQ AEQ
        // Will any one query by `not approximately equal` ?  no !!!
        if (operatorTokenIndex == ElasticsearchParser.EQ || operatorTokenIndex == ElasticsearchParser.NE || operatorTokenIndex == ElasticsearchParser.AEQ ) {
            String targetVal = binaryContext.rightExpr.getText();
            SqlConditionOperator operator ;
            switch (operatorTokenIndex){
                case ElasticsearchParser.NE:{
                    operator = SqlConditionOperator.NotEqual;
                }
                case ElasticsearchParser.AEQ:{
                    operator = SqlConditionOperator.ApproximatelyEqual;
                }
                default:
                case ElasticsearchParser.EQ:{
                    operator = SqlConditionOperator.Equality;
                }
            }
            return parseCondition(binaryContext.leftExpr, operator, new Object[]{targetVal}, (fieldName, operator1, rightParams) -> {
                switch (operator1){
                    case NotEqual:{
                        return QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(fieldName, rightParams[0]));
                    }
                    case ApproximatelyEqual:{
                        return QueryBuilders.matchQuery(fieldName,rightParams[0]);
                    }
                    default:
                    case Equality:{
                        return QueryBuilders.termQuery(fieldName, rightParams[0]);
                    }
                }
            });
        }
        // GT GTE LT LTE
        else if (operatorTokenIndex == ElasticsearchParser.GT ||
                operatorTokenIndex == ElasticsearchParser.GTE ||
                operatorTokenIndex == ElasticsearchParser.LT ||
                operatorTokenIndex == ElasticsearchParser.LTE) {
            SqlConditionOperator operator;
            switch (operatorTokenIndex) {
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
        //IS | IS NOT
        else if (binaryContext.isClause() != null) {
            ElasticsearchParser.IsClauseContext isClauseContext = binaryContext.isClause();
            SqlConditionOperator operator = isClauseContext.not == null ? SqlConditionOperator.IsNull : SqlConditionOperator.IsNotNull;
            return parseCondition(binaryContext.leftExpr, operator, null, (fieldName, operator1, rightParams) -> {
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
        //LIKE | NOT LIKE
        else if (binaryContext.likeClause() != null) {
            ElasticsearchParser.LikeClauseContext likeClauseContext = binaryContext.likeClause();
            SqlConditionOperator operator = likeClauseContext.not ==null?SqlConditionOperator.Like:SqlConditionOperator.NotLike;
            return parseCondition(binaryContext.leftExpr,operator,null,(fieldName, operator1, rightParams) -> {
                String pattern = binaryContext.rightExpr.getText();
                if(pattern.contains("%")){
                    pattern=pattern.replaceAll("%","*");
                }
                if(pattern.contains("_")){
                    pattern=pattern.replaceAll("_","?");
                }
                RegexpQueryBuilder regexpQueryBuilder= QueryBuilders.regexpQuery(fieldName,pattern);
                switch (operator1){
                    case Like:{
                        return regexpQueryBuilder;
                    }
                    default:
                    case NotLike:{
                        return QueryBuilders.boolQuery().mustNot(regexpQueryBuilder);
                    }
                }
            });
        }
        throw new ElasticSql2DslException("[syntax error] not supported yet");
    }
}
