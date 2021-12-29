package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
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
        // elasticsearch is value_count
        this.funcName = "count";
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        if (CoreConstants.STAR.equals(field)) {
            // convert count(*) to count(_id)
            return AggregationBuilders.count("count_id").field(CoreConstants.UNDERLINE_ID);
        }
        return AggregationBuilders.count("count_" + field).field(field);
    }
}
