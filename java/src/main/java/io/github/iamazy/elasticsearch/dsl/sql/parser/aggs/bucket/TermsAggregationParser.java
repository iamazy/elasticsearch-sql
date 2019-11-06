package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.bucket;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AggregateQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.AggregationParser;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.BucketOrder;



/**
 * @author iamazy
 * @date 2019-08-03
 * @descrition
 **/
public class TermsAggregationParser implements AggregationParser {

    private final static String AGG_TERMS_METHOD = "terms";


    @Override
    public void parseAggregateItemClauseContext(AggregateQuery aggregateQuery, ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext) {
        if (StringUtils.equalsIgnoreCase(aggregateItemClauseContext.ID().getText(), AGG_TERMS_METHOD)) {
            try {
                String field = aggregateItemClauseContext.collection().identity(0).getText();
                int size = 10;
                if (aggregateItemClauseContext.collection().identity().size() > 1) {
                    size = Integer.parseInt(aggregateItemClauseContext.collection().identity(1).getText());
                }
                aggregateQuery.setAggregationBuilder(AggregationBuilders.terms(field + "_terms").field(field).size(size)
                        .minDocCount(1).shardMinDocCount(1).shardSize(size << 1).order(BucketOrder.count(false)));
            }catch (IllegalArgumentException e){
                throw new ElasticSql2DslException(e);
            }
        }
    }
}
