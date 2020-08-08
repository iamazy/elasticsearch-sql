package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.pipeline;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AggregateQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.AggregationParser;
import org.apache.commons.lang3.StringUtils;

/**
 * @author iamazy
 * @date 2019-08-05
 **/
public class DerivativeAggregationParser implements AggregationParser {

    private final static String AGG_DERIVATIVE_METHOD = "derivative";

    @Override
    public void parseAggregateItemClauseContext(AggregateQuery aggregateQuery, ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext) {
        if (StringUtils.equalsIgnoreCase(aggregateItemClauseContext.ID().getText(), AGG_DERIVATIVE_METHOD)) {
            //TODO
        }
    }
}
