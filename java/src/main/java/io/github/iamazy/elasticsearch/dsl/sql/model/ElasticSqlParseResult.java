package io.github.iamazy.elasticsearch.dsl.sql.model;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.elastic.HighlightBuilders;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.admin.indices.mapping.get.GetFieldMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;
import org.elasticsearch.search.Scroll;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSqlParseResult {

    private static Logger log= LoggerFactory.getLogger(ElasticSqlParseResult.class);

    private int from = 0;
    private int size = 15;
    private String scrollExpire;
    private String scrollId;

    private List<String> indices;
    private String type = "_doc";
    private String queryAs;
    /**
     * 需要高亮显示的字段
     */
    private Set<String> highlighter=new HashSet<>(0);
    private List<String> routingBy;
    private List<String> queryFieldList;
    private transient BoolQueryBuilder whereCondition;
    private transient BoolQueryBuilder matchCondition;
    private transient List<SortBuilder> orderBy;
    private transient List<AggregationBuilder> groupBy;
    private transient SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

    private GetMappingsRequest mappingsRequest;
    private GetFieldMappingsRequest fieldMappingsRequest;

    public DeleteByQueryRequest toDelRequest() {
        DeleteByQueryRequest deleteByQueryRequest = new DeleteByQueryRequest(toRequest().indices());
        deleteByQueryRequest.setQuery(searchSourceBuilder.query());
        if (StringUtils.isNotBlank(type)) {
            deleteByQueryRequest.types(type);
        }
        if (CollectionUtils.isNotEmpty(routingBy)) {
            deleteByQueryRequest.setRouting(routingBy.get(0));
        }

        if (size < 0) {
            deleteByQueryRequest.setSize(15);
        } else {
            deleteByQueryRequest.setSize(size);
        }
        return deleteByQueryRequest;
    }

    public GetFieldMappingsRequest toFieldMapping(){
        return fieldMappingsRequest;
    }

    public GetMappingsRequest toMapping(){
        return mappingsRequest;
    }

    public SearchResponse toResponse(RestHighLevelClient restHighLevelClient, RequestOptions requestOptions) throws IOException {
        if (StringUtils.isNotBlank(scrollExpire) && StringUtils.isBlank(scrollId)) {
            return restHighLevelClient.search(toRequest(), requestOptions);
        } else if (StringUtils.isNotBlank(scrollExpire) && StringUtils.isNotBlank(scrollId)) {
            SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
            scrollRequest.scroll(toRequest().scroll());
            return restHighLevelClient.scroll(scrollRequest, requestOptions);
        } else if (StringUtils.isBlank(scrollExpire)) {
            return restHighLevelClient.search(toRequest(), requestOptions);
        }
        throw new ElasticSql2DslException("[syntax error] response error,please check your sql");
    }

    public SearchRequest toRequest() {
        SearchRequest searchRequest = new SearchRequest();
        List<String> indexList=indices.parallelStream().map(index->index.replace("`","")).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(indexList)) {
            searchRequest.indices(indexList.toArray(new String[0]));
        }
        if (StringUtils.isNotBlank(type)) {
            searchRequest.types(type);
        }


        if (from < 0) {
            log.debug("[from] is gte zero, assign 0 to [from(int)] as default value!!!");
            //这里不会修改from的值
            searchSourceBuilder.from(0);
        } else {
            searchSourceBuilder.from(from);
        }
        if (size < 0) {
            log.debug("[size] is gte zero, assign 15 to [size(int)] as default value!!!");
            searchSourceBuilder.size(15);
        } else {
            searchSourceBuilder.size(size);
        }


        if(CollectionUtils.isNotEmpty(highlighter)) {
            HighlightBuilder highlightBuilder = HighlightBuilders.highlighter(highlighter);
            searchSourceBuilder.highlighter(highlightBuilder);
        }

        if (whereCondition != null && whereCondition.hasClauses()) {
            if (matchCondition != null && matchCondition.hasClauses()) {
                //filter不进行打分
                searchSourceBuilder.query(matchCondition.filter(whereCondition));
            } else {
                searchSourceBuilder.query(QueryBuilders.boolQuery().filter(whereCondition));
            }
        } else {
            if (matchCondition != null && matchCondition.hasClauses()) {
                searchSourceBuilder.query(matchCondition);
            } else {
                searchSourceBuilder.query(QueryBuilders.matchAllQuery());
            }
        }

        if (CollectionUtils.isNotEmpty(orderBy)) {
            for (SortBuilder sortBuilder : orderBy) {
                searchSourceBuilder.sort(sortBuilder);
            }
        }

        if (CollectionUtils.isNotEmpty(queryFieldList)) {
            List<String> includes=new ArrayList<>(0);
            List<String> excludes=new ArrayList<>(0);
            for(String field:queryFieldList) {
                if(field.startsWith(CoreConstants.UP_ARROW)){
                    excludes.add(field.substring(1));
                }
                else if(field.startsWith("`^")){
                    excludes.add(field.replaceAll(CoreConstants.GRAVE_ACCENT,StringUtils.EMPTY).substring(1));
                }
                else{
                    includes.add(field.replaceAll(CoreConstants.GRAVE_ACCENT,StringUtils.EMPTY));
                }
            }
            searchSourceBuilder.fetchSource(includes.toArray(new String[0]), excludes.toArray(new String[0]));
        }

        if (CollectionUtils.isNotEmpty(routingBy)) {
            searchRequest.routing(routingBy.toArray(new String[0]));
        }

        if (CollectionUtils.isNotEmpty(groupBy)) {
            for (AggregationBuilder aggItem : groupBy) {
                searchSourceBuilder.aggregation(aggItem);
            }
        }

        if (StringUtils.isNotBlank(scrollExpire)) {
            final Scroll scroll = new Scroll(TimeValue.parseTimeValue(scrollExpire, StringUtils.EMPTY));
            searchRequest.scroll(scroll);
        }

        return searchRequest.source(searchSourceBuilder);
    }

    public String toDsl(SearchRequest searchRequest) {
        return searchRequest.source().toString();
    }

    public String toPrettyDsl(SearchRequest searchRequest) {
        try {
            Object o = CoreConstants.OBJECT_MAPPER.readValue(toDsl(searchRequest), Object.class);
            return CoreConstants.OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        } catch (IOException e) {
            throw new RuntimeException("Elasticsearch Dsl解析出错!!!");
        }
    }

    @Override
    public String toString() {
        String ptn = "index:%s,type:%s,query_as:%s,from:%s,size:%s,routing:%s,dsl:%s";
        return String.format(
                ptn, indices, type, queryAs, from, size,
                (routingBy != null ? routingBy.toString() : "[]"), toDsl(toRequest())
        );
    }

}
