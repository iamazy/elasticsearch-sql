package io.github.iamazy.elasticsearch.dsl.sql.parser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlBoolOperator;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionType;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.SqlCondition;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.BinaryQueryParser;
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


    private final BinaryQueryParser binaryQueryParser;

    private Set<String> highlighter;

    public BoolExpressionParser() {
        highlighter = new HashSet<>(0);
        binaryQueryParser = new BinaryQueryParser();
    }

    public QueryBuilder parseBoolQueryExpr(ElasticsearchParser.ExpressionContext expressionContext) {
        SqlCondition sqlCondition = recursiveParseBoolQueryExpr(expressionContext);
        SqlBoolOperator operator = sqlCondition.getOperator();
        if (SqlConditionType.Atomic == sqlCondition.getConditionType()) {
            operator = SqlBoolOperator.AND;
        }
        if(sqlCondition.getQueryList().size()>1) {
            return mergeAtomicQuery(sqlCondition.getQueryList(), operator);
        }else{
            return sqlCondition.getQueryList().get(0).getQueryBuilder();
        }
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
            if(binaryContext.operator!=null) {
                int operatorType = binaryContext.operator.getType();
                SqlBoolOperator boolOperator;
                if (operatorType == ElasticsearchParser.AND || operatorType == ElasticsearchParser.BOOLAND) {
                    boolOperator = SqlBoolOperator.AND;
                } else if (operatorType == ElasticsearchParser.OR || operatorType == ElasticsearchParser.BOOLOR) {
                    boolOperator = SqlBoolOperator.OR;
                } else {
                    return new SqlCondition(binaryQueryParser.parseExpressionContext(expressionContext), SqlConditionType.Atomic);
                }
                SqlCondition leftCondition = recursiveParseBoolQueryExpr(binaryContext.leftExpr);
                SqlCondition rightCondition = recursiveParseBoolQueryExpr(binaryContext.rightExpr);

                List<AtomicQuery> queryList = Lists.newArrayList();
                combineQueryBuilder(queryList, leftCondition, boolOperator);
                combineQueryBuilder(queryList, rightCondition, boolOperator);
                return new SqlCondition(queryList, boolOperator);
            }else{
                return new SqlCondition(binaryQueryParser.parseExpressionContext(expressionContext), SqlConditionType.Atomic);
            }
        }
        return new SqlCondition(binaryQueryParser.parseExpressionContext(expressionContext), SqlConditionType.Atomic);
    }


    private BoolQueryBuilder mergeAtomicQuery(List<AtomicQuery> queryList, SqlBoolOperator operator) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        ListMultimap<AtomicQuery, QueryBuilder> listMultimap = ArrayListMultimap.create();
        for (AtomicQuery atomicQuery : queryList) {
            if (CollectionUtils.isNotEmpty(atomicQuery.getHighlighter())) {
                highlighter.addAll(atomicQuery.getHighlighter());
            }
            //only [and] operator can merge bool query builder
            if (operator == SqlBoolOperator.AND) {
                if (atomicQuery.getQueryBuilder() instanceof BoolQueryBuilder) {
                    BoolQueryBuilder boolQuery = (BoolQueryBuilder) atomicQuery.getQueryBuilder();
                    if (CollectionUtils.isNotEmpty(boolQuery.must())) {
                        boolQueryBuilder.must().addAll(boolQuery.must());
                    }
                    if (CollectionUtils.isNotEmpty(boolQuery.mustNot())) {
                        boolQueryBuilder.mustNot().addAll(boolQuery.mustNot());
                    }
                    if (CollectionUtils.isNotEmpty(boolQuery.should())) {
                        boolQueryBuilder.should().addAll(boolQuery.should());
                    }
                } else {
                    boolQueryBuilder.must(atomicQuery.getQueryBuilder());
                }
            } else if (operator == SqlBoolOperator.OR) {
                boolQueryBuilder.should(atomicQuery.getQueryBuilder());
            } else {
                listMultimap.put(atomicQuery, atomicQuery.getQueryBuilder());
            }
        }
        return boolQueryBuilder.minimumShouldMatch(1);
    }
}
