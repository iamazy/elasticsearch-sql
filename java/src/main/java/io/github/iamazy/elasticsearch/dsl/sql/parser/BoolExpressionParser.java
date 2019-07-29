package io.github.iamazy.elasticsearch.dsl.sql.parser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlBoolOperator;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionType;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.SqlCondition;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.BetweenAndQueryParser;
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


    private final BetweenAndQueryParser betweenAndQueryParser;
    private final BinaryQueryParser binaryQueryParser;

    private Set<String> highlighter;

    public BoolExpressionParser() {
        highlighter = new HashSet<>(0);
        betweenAndQueryParser = new BetweenAndQueryParser();
        binaryQueryParser=new BinaryQueryParser();
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
        if (expressionContext instanceof ElasticsearchParser.BoolContext) {
            ElasticsearchParser.BoolContext boolContext = (ElasticsearchParser.BoolContext) expressionContext;
            String operator = boolContext.operator.getText().toLowerCase();
            SqlBoolOperator boolOperator;
            if (operator.equals("and") || operator.equals("&&")) {
                boolOperator = SqlBoolOperator.AND;
            } else if (operator.equals("or") || operator.equals("||")) {
                boolOperator = SqlBoolOperator.OR;
            } else {
                throw new RuntimeException("not supported operator:" + operator);
            }
            SqlCondition leftCondition = recursiveParseBoolQueryExpr(boolContext.leftExpr);
            SqlCondition rightCondition = recursiveParseBoolQueryExpr(boolContext.rightExpr);

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
        } else {
            throw new RuntimeException("not support yet");
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
                if (operator == SqlBoolOperator.AND) {
                    boolQueryBuilder.must(atomicQuery.getQueryBuilder());
                } else if (operator == SqlBoolOperator.OR) {
                    boolQueryBuilder.should(atomicQuery.getQueryBuilder());
                }
            } else {
                listMultimap.put(atomicQuery, atomicQuery.getQueryBuilder());
            }
        }

        //TODO: merge Nested Query
        return boolQueryBuilder;
    }
}
