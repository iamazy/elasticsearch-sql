package io.github.iamazy.elasticsearch.dsl.sql.model;

import org.elasticsearch.search.aggregations.AggregationBuilder;

/**
 * @author iamazy
 * @date 2019-08-05
 **/
public class AggregateQuery {

    private AggregationBuilder aggregationBuilder;

    public AggregationBuilder getAggregationBuilder() {
        return aggregationBuilder;
    }

    public void setAggregationBuilder(AggregationBuilder aggregationBuilder) {
        this.aggregationBuilder = aggregationBuilder;
    }
}
