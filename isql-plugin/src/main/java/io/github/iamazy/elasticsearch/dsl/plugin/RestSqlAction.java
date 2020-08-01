package io.github.iamazy.elasticsearch.dsl.plugin;

import com.carrotsearch.hppc.cursors.ObjectObjectCursor;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.common.collect.ImmutableOpenMap;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.index.reindex.ReindexAction;
import org.elasticsearch.index.reindex.UpdateByQueryAction;

import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.BytesRestResponse;
import org.elasticsearch.rest.RestHandler;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.tasks.LoggingTaskListener;
import org.elasticsearch.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author iamazy
 * @date 2019/4/23
 * @descrition
 **/
public class RestSqlAction extends BaseRestHandler {

    private final ElasticSql2DslParser sql2DslParser;

    RestSqlAction() {
        this.sql2DslParser = new ElasticSql2DslParser();
    }

    @Override
    public String getName() {
        return "isql";
    }

    @Override
    public List<RestHandler.Route> routes() {
        List<RestHandler.Route> routes = new ArrayList<>(4);
        routes.add(new Route(RestRequest.Method.POST, "/_isql/_explain"));
        routes.add(new Route(RestRequest.Method.POST, "/_isql/_explain"));
        routes.add(new Route(RestRequest.Method.POST, "/_isql"));
        routes.add(new Route(RestRequest.Method.POST, "/_isql"));
        return routes;
    }

    @Override
    protected RestChannelConsumer prepareRequest(RestRequest restRequest, NodeClient nodeClient) {
        try (XContentParser parser = restRequest.contentOrSourceParamParser()) {
            parser.mapStrings().forEach((k, v) -> restRequest.params().putIfAbsent(k, v));
        } catch (IOException e) {
            return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "please use json format params, like: {\"sql\":\"select * from student\"}"));
        }
        try {
            String sql = restRequest.param("sql");
            if (StringUtils.isBlank(sql)) {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "{\n\t\"error\":\"sql can not be empty!!!\"\n}"));
            }
            ElasticSqlParseResult parseResult = sql2DslParser.parse(sql);
            XContentBuilder builder = XContentFactory.jsonBuilder().prettyPrint();
            if (restRequest.path().endsWith("/_explain")) {
                return explain(parseResult, builder);
            } else {
                return execute(parseResult, builder, nodeClient);
            }
        } catch (Exception e) {
            return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.INTERNAL_SERVER_ERROR, XContentType.JSON.mediaType(), "{\n\t\"error\":\"" + e.getMessage() + "\"\n}"));
        }
    }


    private RestChannelConsumer explain(ElasticSqlParseResult parseResult, XContentBuilder builder) {
        if (parseResult.getSqlOperation() == SqlOperation.SELECT) {
            return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(parseResult.getSearchRequest().source())));
        }
        return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "{\n\t\"error\":\"not support explaining desc,delete,update syntax yet!!!\"\n}"));
    }

    private RestChannelConsumer execute(ElasticSqlParseResult parseResult, XContentBuilder builder, NodeClient nodeClient) {
        switch (parseResult.getSqlOperation()) {
            case DESC: {
                if (parseResult.getFieldMappingsRequest() != null) {
                    return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.admin().indices().getFieldMappings(parseResult.getFieldMappingsRequest()).actionGet())));
                } else if (parseResult.getMappingsRequest() != null) {
                    ImmutableOpenMap<String, MappingMetadata> objectObjectCursors = nodeClient.admin().indices().getMappings(parseResult.getMappingsRequest()).actionGet().mappings().get(parseResult.getMappingsRequest().indices()[0]);
                    for (ObjectObjectCursor<String, MappingMetadata> objectObjectCursor : objectObjectCursors) {
                        return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(objectObjectCursor.value.getSourceAsMap())));
                    }
                    return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "{\n\t\"error\":\"sql parse failed!!!\"\n}"));
                }
            }
            case REINDEX: {
                return sendTask(nodeClient.getLocalNodeId(), nodeClient.executeLocally(ReindexAction.INSTANCE, parseResult.getReindexRequest(), LoggingTaskListener.instance()));
            }
            case DELETE_BY_QUERY: {
                BulkByScrollResponse bulkByScrollResponse = nodeClient.execute(DeleteByQueryAction.INSTANCE, parseResult.getDeleteByQueryRequest()).actionGet();
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, XContentType.JSON.mediaType(), "{\n\t\"delete doc count\": " + bulkByScrollResponse.getDeleted() + "\n}"));
            }
            case DELETE: {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.delete(parseResult.getDeleteRequest()).actionGet())));
            }
            case INSERT: {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.index(parseResult.getIndexRequest()).actionGet())));
            }
            case UPDATE: {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.update(parseResult.getUpdateRequest()).actionGet())));
            }
            case UPDATE_BY_QUERY: {
                BulkByScrollResponse bulkByScrollResponse = nodeClient.execute(UpdateByQueryAction.INSTANCE, parseResult.getUpdateByQueryRequest()).actionGet();
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, XContentType.JSON.mediaType(), "{\n\t\"update doc count\": " + bulkByScrollResponse.getUpdated() + "\n}"));
            }
            default:
            case SELECT: {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.search(parseResult.getSearchRequest()).actionGet())));
            }
        }
    }

    private RestChannelConsumer sendTask(String localNodeId, Task task) {
        return channel -> {
            try (XContentBuilder builder = channel.newBuilder()) {
                builder.startObject();
                builder.field("task", localNodeId + ":" + task.getId());
                builder.endObject();
                channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder));
            }
        };
    }
}


