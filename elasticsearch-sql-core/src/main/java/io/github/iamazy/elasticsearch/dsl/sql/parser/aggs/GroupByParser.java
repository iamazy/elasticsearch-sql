package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;


import org.elasticsearch.search.aggregations.AggregationBuilder;

/**
 * @author iamazy
 * @date 2019/9/3
 **/
public abstract class GroupByParser {
    protected String funcName;
    public abstract AggregationBuilder parse(String field, Object ...params);
}
