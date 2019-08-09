package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;

import com.google.common.collect.ImmutableSet;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AggregateQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.bucket.TermsAggregationParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.metrics.*;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.pipeline.DerivativeAggregationParser;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019-08-03
 * @descrition
 **/
public class AggregateByQueryParser implements QueryParser {

    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().selectOperation().aggregateByClause() != null) {
            ElasticsearchParser.AggregateByClauseContext aggregateByClauseContext = dslContext.getSqlContext().selectOperation().aggregateByClause();
            dslContext.getParseResult().getGroupBy().addAll(parseAggregationClauseContext(aggregateByClauseContext.aggregationClause()));
        }
    }


    private List<AggregationBuilder> parseAggregationClauseContext(ElasticsearchParser.AggregationClauseContext aggregationClauseContext) {
        List<AggregationBuilder> aggregationBuilders = new ArrayList<>(0);
        if (aggregationClauseContext.aggregateItemClause() != null) {
            ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext = aggregationClauseContext.aggregateItemClause();
            return parseAggregateItemClauseContext(aggregateItemClauseContext);
        } else if (aggregationClauseContext.nestedAggregationClause() != null) {
            aggregationBuilders.add(parseNestedAggregationClauseContext(aggregationClauseContext.nestedAggregationClause()));
            return aggregationBuilders;
        }
        return aggregationBuilders;
    }


    private List<AggregationBuilder> parseAggregateItemClauseContext(ElasticsearchParser.AggregateItemClauseContext aggregateItemClauseContext) {
        List<AggregationBuilder> aggregationBuilders = new ArrayList<>(0);
        AggregateQuery aggregateQuery=new AggregateQuery();
        for (AggregationParser aggregationParser : buildAggregationChain()) {
            aggregationParser.parseAggregateItemClauseContext(aggregateQuery, aggregateItemClauseContext);
        }
        if(aggregateQuery.getAggregationBuilder()==null){
            throw new ElasticSql2DslException("maybe contains a aggregation which is not support yet");
        }
        if (aggregateItemClauseContext.subAggregationClause().size() > 0) {
            Object o = parseSubAggregationClauseContext(aggregateQuery.getAggregationBuilder(), aggregateItemClauseContext.subAggregationClause());
            if (o instanceof List) {
                List<AggregationBuilder> subAggs = (List<AggregationBuilder>) o;
                for (AggregationBuilder agg : subAggs) {
                    aggregateQuery.getAggregationBuilder().subAggregation(agg);
                }
            }
        }
        aggregationBuilders.add(aggregateQuery.getAggregationBuilder());
        if (aggregateItemClauseContext.aggregationClause().size() > 0) {
            for (ElasticsearchParser.AggregationClauseContext aggregationClauseContext : aggregateItemClauseContext.aggregationClause()) {
                if (aggregationClauseContext.aggregateItemClause() != null) {
                    aggregationBuilders.addAll(parseAggregateItemClauseContext(aggregationClauseContext.aggregateItemClause()));
                }
                if (aggregationClauseContext.nestedAggregationClause() != null) {
                    aggregationBuilders.add(parseNestedAggregationClauseContext(aggregationClauseContext.nestedAggregationClause()));
                }
            }
        }


        return aggregationBuilders;
    }

    private AggregationBuilder parseNestedAggregationClauseContext(ElasticsearchParser.NestedAggregationClauseContext nestedAggregationClauseContext) {
        String nestedPath = nestedAggregationClauseContext.nestedPath.getText();
        String nestedName = "nested_" + nestedPath;
        if (nestedAggregationClauseContext.aggregationClause().nestedAggregationClause() != null) {
            AggregationBuilder nestedAggregationBuilder = parseNestedAggregationClauseContext(nestedAggregationClauseContext.aggregationClause().nestedAggregationClause());
            return AggregationBuilders.nested(nestedName, nestedPath).subAggregation(nestedAggregationBuilder);
        } else if (nestedAggregationClauseContext.aggregationClause().aggregateItemClause() != null) {
            List<AggregationBuilder> aggregationBuilders = parseAggregateItemClauseContext(nestedAggregationClauseContext.aggregationClause().aggregateItemClause());
            AggregationBuilder nestAggregationBuilder = AggregationBuilders.nested(nestedName, nestedPath);
            for (AggregationBuilder agg : aggregationBuilders) {
                nestAggregationBuilder.subAggregation(agg);
            }
            return nestAggregationBuilder;
        }
        throw new ElasticSql2DslException("[syntax error] nested aggregation not support this query format of the sql");
    }

    private AggregationBuilder parseSubAggregationClauseContext(AggregationBuilder aggregationBuilder, List<ElasticsearchParser.SubAggregationClauseContext> subAggregationClauseContexts) {
        for (ElasticsearchParser.SubAggregationClauseContext subAggregationClauseContext : subAggregationClauseContexts) {
            if (subAggregationClauseContext.aggregationClause().aggregateItemClause() != null) {
                List<AggregationBuilder> aggregationItems = parseAggregateItemClauseContext(subAggregationClauseContext.aggregationClause().aggregateItemClause());
                for (AggregationBuilder aggItem : aggregationItems) {
                    aggregationBuilder.subAggregation(aggItem);
                }
                return aggregationBuilder;
            } else if (subAggregationClauseContext.aggregationClause().nestedAggregationClause() != null) {
                AggregationBuilder nestedAggregationBuilder = parseNestedAggregationClauseContext(subAggregationClauseContext.aggregationClause().nestedAggregationClause());
                return aggregationBuilder.subAggregation(nestedAggregationBuilder);
            }
        }
        throw new ElasticSql2DslException("not support yet");
    }

    private Set<AggregationParser> buildAggregationChain() {
        return ImmutableSet.of(
                new TermsAggregationParser(),
                new TopHitsAggregationParser(),
                new CardinalityAggregationParser(),
                new AvgAggregationParser(),
                new MaxAggregationParser(),
                new SumAggregationParser(),
                new MinAggregationParser(),
                new DerivativeAggregationParser()
        );
    }
}
