package io.github.iamazy.elasticsearch.dsl.sql.parser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlBoolOperator;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionType;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.SqlCondition;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.BetweenAndQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.BinaryQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.InListQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo.GeoQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.join.HasChildQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.join.HasParentQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.join.JoinQueryParser;
import org.apache.commons.collections4.CollectionUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class BoolExpressionParser {


    private final BetweenAndQueryParser betweenAndQueryParser;
    private final BinaryQueryParser binaryQueryParser;
    private final InListQueryParser inListQueryParser;
    private final JoinQueryParser joinQueryParser;
    private final GeoQueryParser geoQueryParser;

    private Set<String> highlighter;

    public BoolExpressionParser() {
        highlighter = new HashSet<>(0);
        betweenAndQueryParser = new BetweenAndQueryParser();
        binaryQueryParser=new BinaryQueryParser();
        inListQueryParser=new InListQueryParser();
        joinQueryParser=new JoinQueryParser();
        geoQueryParser=new GeoQueryParser();
    }

    public BoolQueryBuilder parseBoolQueryExpr(ElasticsearchParser.ExpressionContext expressionContext){
        SqlCondition sqlCondition=recursiveParseBoolQueryExpr(expressionContext);
        SqlBoolOperator operator=sqlCondition.getOperator();
        if(SqlConditionType.Atomic==sqlCondition.getConditionType()){
            operator=SqlBoolOperator.AND;
        }
        return mergeAtomicQuery(sqlCondition.getQueryList(),operator);
    }

    private void combineQueryBuilder(List<AtomicQuery> combiner, SqlCondition sqlCondition, SqlBoolOperator boolOperator) {
        if (SqlConditionType.Atomic == sqlCondition.getConditionType() || sqlCondition.getOperator() == boolOperator) {
            combiner.addAll(sqlCondition.getQueryList());
        } else {
            BoolQueryBuilder boolQueryBuilder = mergeAtomicQuery(sqlCondition.getQueryList(), sqlCondition.getOperator());
            combiner.add(new AtomicQuery(boolQueryBuilder));
        }
    }

    private SqlCondition recursiveParseBoolQueryExpr(ElasticsearchParser.ExpressionContext expressionContext) {
        if (expressionContext instanceof ElasticsearchParser.BinaryContext) {
            ElasticsearchParser.BinaryContext binaryContext = (ElasticsearchParser.BinaryContext) expressionContext;
            int operatorType = binaryContext.operator.getType();
            SqlBoolOperator boolOperator;
            if (operatorType == ElasticsearchParser.AND || operatorType == ElasticsearchParser.BOOLAND) {
                boolOperator = SqlBoolOperator.AND;
            } else if (operatorType == ElasticsearchParser.OR || operatorType == ElasticsearchParser.BOOLOR) {
                boolOperator = SqlBoolOperator.OR;
            } else {
//                throw new ElasticSql2DslException("not supported operator:" + binaryContext.operator.getText());
                return new SqlCondition(parseQueryCondition(expressionContext),SqlConditionType.Atomic);
            }
            SqlCondition leftCondition = recursiveParseBoolQueryExpr(binaryContext.leftExpr);
            SqlCondition rightCondition = recursiveParseBoolQueryExpr(binaryContext.rightExpr);

            List<AtomicQuery> queryList = Lists.newArrayList();
            combineQueryBuilder(queryList, leftCondition, boolOperator);
            combineQueryBuilder(queryList, rightCondition, boolOperator);
            return new SqlCondition(queryList, boolOperator);
        }
        return new SqlCondition(parseQueryCondition(expressionContext),SqlConditionType.Atomic);
    }

    private AtomicQuery parseQueryCondition(ElasticsearchParser.ExpressionContext expressionContext) {

        if (expressionContext instanceof ElasticsearchParser.BinaryContext) {
            return binaryQueryParser.parseBinaryQuery((ElasticsearchParser.BinaryContext) expressionContext);
        } else if (expressionContext instanceof ElasticsearchParser.BetweenAndContext) {
            return betweenAndQueryParser.parseBetweenAndQuery((ElasticsearchParser.BetweenAndContext) expressionContext);
        } else if (expressionContext instanceof ElasticsearchParser.LrExprContext) {
            ElasticsearchParser.LrExprContext lrExprContext = (ElasticsearchParser.LrExprContext) expressionContext;
            return parseQueryCondition(lrExprContext.expression());
        }else if(expressionContext instanceof ElasticsearchParser.GeoContext){
            ElasticsearchParser.GeoContext geoContext=(ElasticsearchParser.GeoContext)expressionContext;
            return geoQueryParser.parse(geoContext);
        }else if(expressionContext instanceof ElasticsearchParser.InContext){
            ElasticsearchParser.InContext inContext=(ElasticsearchParser.InContext)expressionContext;
            return inListQueryParser.parseInListQuery(inContext);
        }else if(expressionContext instanceof ElasticsearchParser.JoinContext){
            return joinQueryParser.parse((ElasticsearchParser.JoinContext) expressionContext);
        }
        else {
            throw new ElasticSql2DslException("not support yet");
        }
    }


    private BoolQueryBuilder mergeAtomicQuery(List<AtomicQuery> queryList, SqlBoolOperator operator) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        ListMultimap<AtomicQuery, QueryBuilder> listMultimap = ArrayListMultimap.create();
        for (AtomicQuery atomicQuery : queryList) {
            if (CollectionUtils.isNotEmpty(atomicQuery.getHighlighter()) && !atomicQuery.isNestedQuery()) {
                highlighter.addAll(atomicQuery.getHighlighter());
            }
            if (!atomicQuery.isNestedQuery()) {
                //only [and] operator can merge bool query builder
                if (operator == SqlBoolOperator.AND) {
                    if(atomicQuery.getQueryBuilder() instanceof BoolQueryBuilder){
                        BoolQueryBuilder boolQuery= (BoolQueryBuilder) atomicQuery.getQueryBuilder();
                        if(CollectionUtils.isNotEmpty(boolQuery.must())){
                            boolQueryBuilder.must().addAll(boolQuery.must());
                        }
                        if(CollectionUtils.isNotEmpty(boolQuery.mustNot())){
                            boolQueryBuilder.mustNot().addAll(boolQuery.mustNot());
                        }
                        if(CollectionUtils.isNotEmpty(boolQuery.should())){
                            boolQueryBuilder.should().addAll(boolQuery.should());
                        }
                    }else{
                        boolQueryBuilder.must(atomicQuery.getQueryBuilder());
                    }
                } else if (operator == SqlBoolOperator.OR) {
                    boolQueryBuilder.should(atomicQuery.getQueryBuilder());
                }
            } else {
                listMultimap.put(atomicQuery, atomicQuery.getQueryBuilder());
            }
        }

        //TODO: merge Nested Query
        return boolQueryBuilder.minimumShouldMatch(1);
    }
}
