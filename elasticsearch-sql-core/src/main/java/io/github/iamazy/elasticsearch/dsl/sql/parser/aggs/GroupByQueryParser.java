package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;


import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.ImmutableList;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group.*;
import org.elasticsearch.search.aggregations.AggregationBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019-08-06
 **/
@SuppressWarnings("unstable")
public class GroupByQueryParser{

    /**
     * funcName -> GroupByParser
     */
    private static final Map<String, GroupByParser> GROUP_BY_FUNCTION_MAP = CollUtil.toMap(buildGroupByParserChain(),
            new HashMap<>(), x -> x.funcName.toUpperCase());

    public AggregationBuilder parse(String funcName, String field, Object... params) {
        if (GROUP_BY_FUNCTION_MAP.containsKey(funcName.toUpperCase())) {
            return GROUP_BY_FUNCTION_MAP.get(funcName.toUpperCase()).parse(field, params);
        }
        throw new ElasticSql2DslException("not support groupBy function named:" + funcName);
    }

    public static boolean isSupportAggregation(String funcName) {
        return GROUP_BY_FUNCTION_MAP.containsKey(funcName.toUpperCase());
    }



    private static List<GroupByParser> buildGroupByParserChain(){
        return ImmutableList.of(
                new CountGroupByParser(),
                new CardinalityGroupByParser(),
                new AvgGroupByParser(),
                new MaxGroupByParser(),
                new MinGroupByParser(),
                new SumGroupByParser()
        );
    }
}
