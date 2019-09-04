package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;


import lombok.Getter;
import lombok.Setter;
import org.elasticsearch.search.aggregations.AggregationBuilder;

/**
 * @author iamazy
 * @date 2019/9/3
 * @descrition
 **/
public abstract class GroupByParser {
    @Getter
    @Setter
    public String funcName;
    public abstract AggregationBuilder parse(String field, Object ...params);
}
