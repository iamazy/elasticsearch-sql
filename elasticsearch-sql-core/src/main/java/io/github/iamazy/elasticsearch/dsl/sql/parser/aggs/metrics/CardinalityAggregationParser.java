package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.metrics;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AggregateQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.AggregationParser;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.search.aggregations.AggregationBuilders;


/**
 * @author iamazy
 * @date 2019-08-05
 **/
public class CardinalityAggregationParser implements AggregationParser {

    private static final String AGG_CARDINALITY_METHOD = "cardinality";

    @Override
    public void parseAggregateItemClauseContext(AggregateQuery aggregateQuery, ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext) {
        if (StringUtils.equalsIgnoreCase(aggregateItemClauseContext.ID().getText(), AGG_CARDINALITY_METHOD)) {
            try {
                String field = aggregateItemClauseContext.collection().identity(0).getText();
                aggregateQuery.setAggregationBuilder(AggregationBuilders.cardinality(field+"_"+AGG_CARDINALITY_METHOD).field(field));
            }catch (IllegalArgumentException e){
                throw new ElasticSql2DslException(e);
            }
        }
    }
}
