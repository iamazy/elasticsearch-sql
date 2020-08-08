package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * @author iamazy
 * @date 2019/9/3
 **/
@SuppressWarnings("unstable")
public class CountGroupByParser extends GroupByParser {

    public CountGroupByParser() {
        this.funcName = "count";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        return AggregationBuilders.cardinality("cardinality_" + field).field(field);
    }
}
