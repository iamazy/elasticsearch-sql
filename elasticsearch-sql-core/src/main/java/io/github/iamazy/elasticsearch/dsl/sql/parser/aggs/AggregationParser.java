package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AggregateQuery;



/**
 * @author iamazy
 * @date 2019-08-03
 * @descrition
 **/
public interface AggregationParser {
    void parseAggregateItemClauseContext(AggregateQuery aggregateQuery, ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext);
}
