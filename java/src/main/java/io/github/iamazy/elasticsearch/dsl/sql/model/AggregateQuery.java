package io.github.iamazy.elasticsearch.dsl.sql.model;

import lombok.Data;
import org.elasticsearch.search.aggregations.AggregationBuilder;

/**
 * @author iamazy
 * @date 2019-08-05
 * @descrition
 **/
@Data
public class AggregateQuery {

    private AggregationBuilder aggregationBuilder;


}
