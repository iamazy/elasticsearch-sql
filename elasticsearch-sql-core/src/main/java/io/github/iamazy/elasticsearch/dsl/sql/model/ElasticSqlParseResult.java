package io.github.iamazy.elasticsearch.dsl.sql.model;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.elastic.HighlightBuilders;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.admin.indices.mapping.get.GetFieldMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;
import org.elasticsearch.index.reindex.ReindexRequest;
import org.elasticsearch.index.reindex.UpdateByQueryRequest;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.collapse.CollapseBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilder;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSqlParseResult {

    private int from = 0;
    private int size = 15;

    private List<String> indices=new ArrayList<>(0);
    private Map<String,String> aliasMap=new HashMap<>(0);

    private SqlOperation sqlOperation = SqlOperation.SELECT;
    private transient boolean trackTotalHits = false;

    private Set<String> highlighter = new HashSet<>(0);
    private List<String> routingBy = new ArrayList<>(0);
    private List<String> includeFields = new ArrayList<>(0);
    private List<String> excludeFields = new ArrayList<>(0);
    private transient QueryBuilder whereCondition = QueryBuilders.matchAllQuery();
    private transient String distinctName;
    private transient List<SortBuilder> orderBy = new ArrayList<>(0);
    private transient List<AggregationBuilder> groupBy = new ArrayList<>(0);
    private transient SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
    private transient SearchRequest searchRequest;
    private transient ReindexRequest reindexRequest;
    private transient IndexRequest indexRequest;
    private transient UpdateRequest updateRequest;
    private transient UpdateByQueryRequest updateByQueryRequest;
    private transient DeleteRequest deleteRequest;
    private transient DeleteByQueryRequest deleteByQueryRequest;

    private GetMappingsRequest mappingsRequest;
    private GetFieldMappingsRequest fieldMappingsRequest;


    //region Getter and Setter
    public void setSqlOperation(SqlOperation sqlOperation) {
        this.sqlOperation = sqlOperation;
    }

    public SqlOperation getSqlOperation() {
        return sqlOperation;
    }

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

    public List<String> getIndices() {
        return indices;
    }

    public Map<String, String> getAliasMap() {
        return aliasMap;
    }

    public boolean trackTotalHits() {
        return trackTotalHits;
    }

    public void trackTotalHits(boolean trackTotalHits) {
        this.trackTotalHits = trackTotalHits;
    }

    public Set<String> getHighlighter() {
        return highlighter;
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

    public void setWhereCondition(QueryBuilder whereCondition) {
        this.whereCondition = whereCondition;
    }

    public ReindexRequest getReindexRequest() {
        return reindexRequest;
    }

    public void setReindexRequest(ReindexRequest reindexRequest) {
        this.reindexRequest = reindexRequest;
    }

    public IndexRequest getIndexRequest() {
        return indexRequest;
    }

    public void setIndexRequest(IndexRequest indexRequest) {
        this.indexRequest = indexRequest;
    }

    public UpdateByQueryRequest getUpdateByQueryRequest() {
        return updateByQueryRequest;
    }

    public void setUpdateByQueryRequest(UpdateByQueryRequest updateByQueryRequest) {
        this.updateByQueryRequest = updateByQueryRequest;
    }

    public UpdateRequest getUpdateRequest() {
        return updateRequest;
    }

    public void setUpdateRequest(UpdateRequest updateRequest) {
        this.updateRequest = updateRequest;
    }

    public DeleteByQueryRequest getDeleteByQueryRequest() {
        return deleteByQueryRequest;
    }

    public void setDeleteByQueryRequest(DeleteByQueryRequest deleteByQueryRequest) {
        this.deleteByQueryRequest = deleteByQueryRequest;
    }

    public DeleteRequest getDeleteRequest() {
        return deleteRequest;
    }

    public void setDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }

    public SearchRequest getSearchRequest() {
        if(searchRequest==null){
            searchRequest=toRequest();
        }
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public List<SortBuilder> getOrderBy() {
        return orderBy;
    }

    public List<AggregationBuilder> getGroupBy() {
        return groupBy;
    }

    public String getDistinctName() {
        return distinctName;
    }

    public void setDistinctName(String distinctName) {
        this.distinctName = distinctName;
    }

    public GetMappingsRequest getMappingsRequest() {
        return mappingsRequest;
    }

    public void setMappingsRequest(GetMappingsRequest mappingsRequest) {
        this.mappingsRequest = mappingsRequest;
    }

    public GetFieldMappingsRequest getFieldMappingsRequest() {
        return fieldMappingsRequest;
    }

    public void setFieldMappingsRequest(GetFieldMappingsRequest fieldMappingsRequest) {
        this.fieldMappingsRequest = fieldMappingsRequest;
    }
    //endregion


    private SearchRequest toRequest() {
        SearchRequest searchRequest = new SearchRequest();
        List<String> indexList = indices.parallelStream().map(StringManager::removeStringSymbol).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(indexList)) {
            searchRequest.indices(indexList.toArray(new String[0]));
        } else {
            throw new ElasticSql2DslException("[syntax error] indices name must be set");
        }
        //这里不会修改from的值
        searchSourceBuilder.from(Math.max(from, 0));
        searchSourceBuilder.size(Math.max(size, 0));
        searchSourceBuilder.trackTotalHits(this.trackTotalHits);
        if (CollectionUtils.isNotEmpty(highlighter)) {
            HighlightBuilder highlightBuilder = HighlightBuilders.highlighter(highlighter);
            searchSourceBuilder.highlighter(highlightBuilder);
        }
        searchSourceBuilder.query(whereCondition);
        if (StringUtils.isNotBlank(distinctName)) {
            searchSourceBuilder.collapse(new CollapseBuilder(distinctName));
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

}
