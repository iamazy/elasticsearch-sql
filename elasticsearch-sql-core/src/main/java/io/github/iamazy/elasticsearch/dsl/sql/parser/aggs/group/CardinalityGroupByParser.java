package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.group;

import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.metrics.CardinalityAggregationParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

/**
 * COUNT(DISTINCT field)
 */
@SuppressWarnings("unstable")
public class CardinalityGroupByParser extends GroupByParser {

    public CardinalityGroupByParser() {
        this.funcName = CardinalityAggregationParser.AGG_CARDINALITY_METHOD;
    }

    @Override
    public AggregationBuilder parse(String field, Object... params) {
        return AggregationBuilders.cardinality("cardinality_" + field).field(field);
    }
}
