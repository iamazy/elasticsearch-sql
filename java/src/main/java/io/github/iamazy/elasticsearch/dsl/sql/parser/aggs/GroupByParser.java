package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;

import org.elasticsearch.search.aggregations.AggregationBuilder;

/**
 * @author iamazy
 * @date 2019/9/3
 * @descrition
 **/
public interface GroupByParser {
    AggregationBuilder parseGroupByClauseContext(String field, Object ...params);
}
