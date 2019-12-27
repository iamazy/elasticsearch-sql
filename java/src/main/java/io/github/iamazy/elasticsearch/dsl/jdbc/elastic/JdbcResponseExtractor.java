package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.composite.ParsedComposite;
import org.elasticsearch.search.aggregations.bucket.nested.Nested;
import org.elasticsearch.search.aggregations.bucket.nested.ParsedNested;
import org.elasticsearch.search.aggregations.bucket.range.ParsedRange;
import org.elasticsearch.search.aggregations.bucket.range.Range;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.metrics.*;

import java.util.*;

/**
 * @author iamazy
 * @date 2019/12/23
 * @descrition
 **/
public class JdbcResponseExtractor {

    private void parseTermsAggregation(Aggregation aggregation, Map<String, Object> aggMap, String parent) {
        Terms buckets = (Terms) aggregation;
        Map<String, Object> tmpSubAgg = new LinkedHashMap<>(0);
        Map<String, Object> subAggMap = new LinkedHashMap<>(0);
        int total = 0;
        for (Terms.Bucket bucket : buckets.getBuckets()) {
            total += bucket.getDocCount();
            if (StringUtils.isNotBlank(bucket.getKeyAsString())) {
                if (bucket.getAggregations() != null && bucket.getAggregations().asList().size() > 0) {
                    parseAggregations(bucket.getAggregations(), subAggMap, bucket.getKeyAsString());
                    if (parent != null) {
                        aggMap.put(parent, subAggMap);
                    } else {
                        aggMap.put(buckets.getName(), subAggMap);
                    }
                } else {
                    tmpSubAgg.put(bucket.getKeyAsString(), bucket.getDocCount());
                }
            }
        }
        if (MapUtils.isNotEmpty(tmpSubAgg)) {
            tmpSubAgg.put("total", total);
            if (parent != null) {
                aggMap.put(parent, tmpSubAgg);
            } else {
                aggMap.put(buckets.getName(), tmpSubAgg);
            }
        } else {
            if (!subAggMap.containsKey("total")) {
                subAggMap.put("total", total);
            }
        }
    }

    private void parseCompositeAggregation(Aggregation aggregation, Map<String, Object> aggMap, String parent) {
        ParsedComposite composite = (ParsedComposite) aggregation;
        Map<String, Object> tmpSubAgg = new LinkedHashMap<>(0);
        for (ParsedComposite.ParsedBucket bucket : composite.getBuckets()) {
            if (StringUtils.isNotBlank(bucket.getKeyAsString())) {
                //FIXME 目前不支持多字段分页聚类
                String field = null;
                Object value = null;
                for (Map.Entry<String, Object> entry : bucket.getKey().entrySet()) {
                    field = entry.getKey();
                    tmpSubAgg.put("field", field);
                    value = entry.getValue();
                }
                //过滤blank field的情况
                if (value != null && StringUtils.isNotBlank(field)) {
                    tmpSubAgg.put(value.toString(), bucket.getDocCount());
                }
            }
        }
        if (MapUtils.isNotEmpty(tmpSubAgg)) {
            if (parent != null) {
                aggMap.put(parent, tmpSubAgg);
            } else {
                String field = tmpSubAgg.get("field").toString();
                tmpSubAgg.remove("field");
                aggMap.put(field, tmpSubAgg);
            }
        }
    }

    private void parseTopHitsAggregation(Aggregation aggregation, Map<String, Object> aggMap) {
        TopHits topHits = (TopHits) aggregation;
        SearchHit[] hits = topHits.getHits().getHits();
        List<Map<String, Object>> topHitList = new ArrayList<>(0);
        for (SearchHit hit : hits) {
            topHitList.add(hit.getSourceAsMap());
        }
        aggMap.put(aggregation.getName(), topHitList);
    }

    private void parseRangeAggregation(Aggregation aggregation, Map<String, Object> aggMap) {
        Range range = (Range) aggregation;
        List<Map<String, Object>> rangeList = new ArrayList<>(0);
        for (Range.Bucket bucket : range.getBuckets()) {
            Map<String, Object> rangeItem = new HashMap<>(0);
            rangeItem.put(bucket.getKeyAsString(), bucket.getDocCount());
            rangeList.add(rangeItem);
        }
        aggMap.put(range.getName(), rangeList);
    }

    private void parseGeoBoundAggregation(Aggregation aggregation, Map<String, Object> aggMap) {
        GeoBounds geoBounds = (GeoBounds) aggregation;
        Map<String, Object> coordinate = new LinkedHashMap<>(0);
        FlatMapUtils.flatPut("leftTop.lat", geoBounds.topLeft().lat(), coordinate);
        FlatMapUtils.flatPut("leftTop.lon", geoBounds.topLeft().lon(), coordinate);
        FlatMapUtils.flatPut("rightBottom.lat", geoBounds.bottomRight().lat(), coordinate);
        FlatMapUtils.flatPut("rightBottom.lon", geoBounds.bottomRight().lon(), coordinate);
        aggMap.put(aggregation.getName(), coordinate);
    }

    private void parseNestedAggregation(Aggregation aggregation, Map<String, Object> aggMap) {
        Nested nested = (Nested) aggregation;
        if (nested.getAggregations() != null && nested.getAggregations().asList().size() > 0) {
            parseAggregations(nested.getAggregations(), aggMap, null);
        }
    }

    private void parseCardinalityAggregation(Aggregation aggregation, Map<String, Object> aggMap) {
        Cardinality cardinality = (Cardinality) aggregation;
        aggMap.put(cardinality.getName(), cardinality.getValue());
    }

    private void parseAggregations(Aggregations aggregations, Map<String, Object> aggMap, String parent) {
        for (Aggregation aggregation : aggregations) {
            if (aggregation instanceof ParsedNested) {
                parseNestedAggregation(aggregation, aggMap);
            } else if (aggregation instanceof ParsedComposite) {
                parseCompositeAggregation(aggregation, aggMap, parent);
            } else if (aggregation instanceof ParsedTerms) {
                parseTermsAggregation(aggregation, aggMap, parent);
            } else if (aggregation instanceof ParsedTopHits) {
                parseTopHitsAggregation(aggregation, aggMap);
            } else if (aggregation instanceof ParsedCardinality) {
                parseCardinalityAggregation(aggregation, aggMap);
            } else if (aggregation instanceof ParsedRange) {
                parseRangeAggregation(aggregation, aggMap);
            } else if (aggregation instanceof ParsedGeoBounds) {
                parseGeoBoundAggregation(aggregation, aggMap);
            }
        }
    }

    public JdbcSearchResponse parseSearchResponse(SearchResponse response,Map<String,String> aliasMap) {
        JdbcSearchResponse jdbcSearchResponse = new JdbcSearchResponse();
        jdbcSearchResponse.setSize(response.getHits().getHits().length);
        jdbcSearchResponse.setTook(response.getTook().getMillis());
        if (response.getHits().getTotalHits() != null) {
            jdbcSearchResponse.setTotal(response.getHits().getTotalHits().value);
        }
        SearchHit[] searchHits = response.getHits().getHits();
        if (searchHits != null && searchHits.length > 0) {
            List<Map<String, Object>> result = new ArrayList<>(searchHits.length);
            for (SearchHit hit : response.getHits().getHits()) {
                hit.getSourceAsMap().put("_id", hit.getId());
                if (hit.field("_routing") != null) {
                    hit.getSourceAsMap().put("_routing", hit.field("_routing").getValue());
                }
                result.add(hit.getSourceAsMap());
            }
            jdbcSearchResponse.setResult(result);
            jdbcSearchResponse.setAliasMap(aliasMap);
        }
        return jdbcSearchResponse;
    }

    public JdbcSearchResponse parseScrollSearchResponse(SearchResponse response,Map<String,String> aliasMap) {
        JdbcSearchResponse searchResponse = parseSearchResponse(response,aliasMap);
        String scrollId = response.getScrollId();
        return new JdbcScrollSearchResponse(searchResponse, scrollId);
    }
}
