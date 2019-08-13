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
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;
import org.elasticsearch.search.Scroll;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.collapse.CollapseBuilder;
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

    private static Logger log = LoggerFactory.getLogger(ElasticSqlParseResult.class);

    private int from = 0;
    private int size = 15;
    private String scrollExpire;
    private String scrollId;

    private List<String> indices;
    private String type = "_doc";
    /**
     * 需要高亮显示的字段
     */
    private Set<String> highlighter = new HashSet<>(0);
    private List<String> routingBy=new ArrayList<>(0);
    private List<String> includeFields=new ArrayList<>(0);
    private List<String> excludeFields=new ArrayList<>(0);
    private transient QueryBuilder whereCondition;
    private transient QueryBuilder matchCondition;
    private transient CollapseBuilder collapseBuilder;
    private transient List<SortBuilder> orderBy=new ArrayList<>(0);
    private transient List<AggregationBuilder> groupBy=new ArrayList<>(0);
    private transient SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

    private GetMappingsRequest mappingsRequest;
    private GetFieldMappingsRequest fieldMappingsRequest;


    //region Getter and Setter
    public int getFrom() {
        return from;
    }

    public ElasticSqlParseResult setFrom(int from) {
        this.from = from;
        return this;
    }

    public int getSize() {
        return size;
    }

    public ElasticSqlParseResult setSize(int size) {
        this.size = size;
        return this;
    }

    public String getScrollExpire() {
        return scrollExpire;
    }

    public ElasticSqlParseResult setScrollExpire(String scrollExpire) {
        this.scrollExpire = scrollExpire;
        return this;
    }

    public String getScrollId() {
        return scrollId;
    }

    public ElasticSqlParseResult setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    public List<String> getIndices() {
        return indices;
    }

    public ElasticSqlParseResult setIndices(List<String> indices) {
        this.indices = indices;
        return this;
    }

    public String getType() {
        return type;
    }

    public ElasticSqlParseResult setType(String type) {
        this.type = type;
        return this;
    }

    public Set<String> getHighlighter() {
        return highlighter;
    }

    public ElasticSqlParseResult setHighlighter(Set<String> highlighter) {
        this.highlighter = highlighter;
        return this;
    }

    public List<String> getRoutingBy() {
        return routingBy;
    }

    public List<String> getIncludeFields() {
        return includeFields;
    }

    public List<String> getExcludeFields() {
        return excludeFields;
    }

    public QueryBuilder getWhereCondition() {
        return whereCondition;
    }

    public ElasticSqlParseResult setWhereCondition(QueryBuilder whereCondition) {
        this.whereCondition = whereCondition;
        return this;
    }

    public QueryBuilder getMatchCondition() {
        return matchCondition;
    }

    public ElasticSqlParseResult setMatchCondition(QueryBuilder matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    public List<SortBuilder> getOrderBy() {
        return orderBy;
    }

    public List<AggregationBuilder> getGroupBy() {
        return groupBy;
    }

    public void setCollapseBuilder(CollapseBuilder collapseBuilder) {
        this.collapseBuilder = collapseBuilder;
    }

    public CollapseBuilder getCollapseBuilder() {
        return collapseBuilder;
    }

    public SearchSourceBuilder getSearchSourceBuilder() {
        return searchSourceBuilder;
    }

    public ElasticSqlParseResult setSearchSourceBuilder(SearchSourceBuilder searchSourceBuilder) {
        this.searchSourceBuilder = searchSourceBuilder;
        return this;
    }

    public GetMappingsRequest getMappingsRequest() {
        return mappingsRequest;
    }

    public ElasticSqlParseResult setMappingsRequest(GetMappingsRequest mappingsRequest) {
        this.mappingsRequest = mappingsRequest;
        return this;
    }

    public GetFieldMappingsRequest getFieldMappingsRequest() {
        return fieldMappingsRequest;
    }

    public ElasticSqlParseResult setFieldMappingsRequest(GetFieldMappingsRequest fieldMappingsRequest) {
        this.fieldMappingsRequest = fieldMappingsRequest;
        return this;
    }

    //endregion

    public DeleteByQueryRequest toDelRequest() {
        DeleteByQueryRequest deleteByQueryRequest = new DeleteByQueryRequest(toRequest().indices());
        if (StringUtils.isNotBlank(type)) {
            deleteByQueryRequest.types(type);
        }
        deleteByQueryRequest.setQuery(searchSourceBuilder.query());
        if(CollectionUtils.isNotEmpty(routingBy)){
            deleteByQueryRequest.setRouting(routingBy.get(0));
        }
        if (size < 0) {
            deleteByQueryRequest.setSize(15);
        } else {
            deleteByQueryRequest.setSize(size);
        }
        return deleteByQueryRequest;
    }

    public GetFieldMappingsRequest toFieldMapping() {
        return fieldMappingsRequest;
    }

    public GetMappingsRequest toMapping() {
        return mappingsRequest;
    }

    public SearchResponse toResponse(RestHighLevelClient restHighLevelClient) throws IOException{
        if (StringUtils.isNotBlank(scrollExpire) && StringUtils.isBlank(scrollId)) {
            return restHighLevelClient.search(toRequest());
        } else if (StringUtils.isNotBlank(scrollExpire) && StringUtils.isNotBlank(scrollId)) {
            SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
            scrollRequest.scroll(toRequest().scroll());
            return restHighLevelClient.searchScroll(scrollRequest);
        } else if (StringUtils.isBlank(scrollExpire)) {
            return restHighLevelClient.search(toRequest());
        }
        throw new ElasticSql2DslException("[syntax error] response error,please check your sql");
    }

    public SearchRequest toRequest() {
        SearchRequest searchRequest = new SearchRequest();
        List<String> indexList = indices.parallelStream().map(index -> index.replace("`", "")).collect(Collectors.toList());
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


        if (CollectionUtils.isNotEmpty(highlighter)) {
            HighlightBuilder highlightBuilder = HighlightBuilders.highlighter(highlighter);
            searchSourceBuilder.highlighter(highlightBuilder);
        }

        if (whereCondition != null) {
            searchSourceBuilder.query(whereCondition);
        } else {
            searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        }

        if(collapseBuilder!=null){
            searchSourceBuilder.collapse(collapseBuilder);
        }
        if (CollectionUtils.isNotEmpty(orderBy)) {
            for (SortBuilder sortBuilder : orderBy) {
                searchSourceBuilder.sort(sortBuilder);
            }
        }

        searchSourceBuilder.fetchSource(includeFields.toArray(new String[0]), excludeFields.toArray(new String[0]));

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
        String ptn = "index:%s,type:%s,from:%s,size:%s,routing:%s,dsl:%s";
        return String.format(
                ptn, indices, type, from, size,
                (routingBy != null ? routingBy.toString() : "[]"), toDsl(toRequest())
        );
    }

}
