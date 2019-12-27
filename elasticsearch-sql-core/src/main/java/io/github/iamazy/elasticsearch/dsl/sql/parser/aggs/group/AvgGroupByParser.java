package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * @author iamazy
 * @date 2019/9/4
 * @descrition
 **/
@SuppressWarnings("unstable")
public class AvgGroupByParser extends GroupByParser {

    public AvgGroupByParser(){
        this.funcName="avg";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        return AggregationBuilders.avg("avg_"+field).field(field);
    }
}
