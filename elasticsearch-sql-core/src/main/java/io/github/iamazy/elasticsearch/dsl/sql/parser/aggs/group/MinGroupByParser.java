package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * @author iamazy
 * @date 2019/9/4
 **/
@SuppressWarnings("unstable")
public class MinGroupByParser extends GroupByParser {

    public MinGroupByParser(){
        this.funcName="min";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        return AggregationBuilders.min("min_"+field).field(field);
    }
}
