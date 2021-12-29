package io.github.iamazy.elasticsearch.dsl.sql.parser;

import cn.hutool.core.collection.CollUtil;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.metrics.CardinalityAggregationParser;

import java.util.List;

public class ParserUtil {

    public static String extractFunctionName(ElasticsearchParser.FunctionNameContext ctx) {
        if (ctx.params != null && ctx.params.DISTINCT() != null) {
            return CardinalityAggregationParser.AGG_CARDINALITY_METHOD;
        }
        return ctx.functionName.getText();
    }

    public static boolean containsAggregation(ElasticsearchParser.FieldListContext ctx) {
        List<ElasticsearchParser.NameOperandContext> contextList = ctx.nameOperand();
        if (CollUtil.isEmpty(contextList)) {
            return false;
        }
        for (ElasticsearchParser.NameOperandContext context : contextList) {
            if (context.fieldName instanceof ElasticsearchParser.FunctionNameContext) {
                String functionName = extractFunctionName((ElasticsearchParser.FunctionNameContext) context.fieldName);
                if (GroupByQueryParser.isSupportAggregation(functionName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
