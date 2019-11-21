package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * @author iamazy
 * @date 2019/9/3
 * @descrition
 **/
@SuppressWarnings("unstable")
public class CountGroupByParser extends GroupByParser {

    public CountGroupByParser(){
        this.funcName="count";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        if(params.length==1&&params[0].equals(true)){
            return AggregationBuilders.cardinality("distinct_"+field).field(field);
        }
        return AggregationBuilders.terms("count_"+field).field(field);
    }
}
