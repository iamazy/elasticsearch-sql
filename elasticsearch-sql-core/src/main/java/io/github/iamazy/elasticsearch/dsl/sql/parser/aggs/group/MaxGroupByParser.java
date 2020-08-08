package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * @author iamazy
 * @date 2019/9/4
 **/
@SuppressWarnings("unstable")
public class MaxGroupByParser extends GroupByParser {

    public MaxGroupByParser(){
        this.funcName="max";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        return AggregationBuilders.max("max_"+field).field(field);
    }
}
