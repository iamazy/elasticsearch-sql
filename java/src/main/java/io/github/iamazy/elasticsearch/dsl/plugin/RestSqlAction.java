package io.github.iamazy.elasticsearch.dsl.plugin;

import com.carrotsearch.hppc.cursors.ObjectObjectCursor;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.common.collect.ImmutableOpenMap;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.rest.*;

import java.io.IOException;


/**
 * @author iamazy
 * @date 2019/4/23
 * @descrition
 **/
public class RestSqlAction extends BaseRestHandler {

    RestSqlAction(Settings settings, RestController restController) {
        super(settings);
        restController.registerHandler(RestRequest.Method.POST, "/_isql/_explain", this);
        restController.registerHandler(RestRequest.Method.GET, "/_isql/_explain", this);
        restController.registerHandler(RestRequest.Method.POST, "/_isql", this);
        restController.registerHandler(RestRequest.Method.GET, "/_isql", this);
    }

    @Override
    public String getName() {
        return "isql";
    }

    @Override
    protected RestChannelConsumer prepareRequest(RestRequest restRequest, NodeClient nodeClient) {
        try (XContentParser parser = restRequest.contentOrSourceParamParser()) {
            parser.mapStrings().forEach((k, v) -> restRequest.params().putIfAbsent(k, v));
        } catch (IOException e) {
            return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "please use json format params, like: {\"sql\":\"select * from test\"}"));
        }
        try {
            String sql = restRequest.param("sql");
            if (StringUtils.isBlank(sql)) {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.BAD_REQUEST, XContentType.JSON.mediaType(), "{\"error\":\"sql语句不能为空!!!\"}"));
            }
            ElasticSql2DslParser sql2DslParser = new ElasticSql2DslParser();
            ElasticSqlParseResult parseResult = sql2DslParser.parse(sql);
            XContentBuilder builder = XContentFactory.jsonBuilder().prettyPrint();
            if (restRequest.path().endsWith("/_explain")) {
                return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(parseResult.toRequest().source())));
            }
            else {
                if (parseResult.toFieldMapping() != null) {
                    return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.admin().indices().getFieldMappings(parseResult.toFieldMapping()).actionGet())));
                } else if (parseResult.toMapping()!=null) {
                    ImmutableOpenMap<String, MappingMetaData> objectObjectCursors = nodeClient.admin().indices().getMappings(parseResult.toMapping()).actionGet().mappings().get(parseResult.getIndices().get(0));
                    for (ObjectObjectCursor<String, MappingMetaData> objectObjectCursor : objectObjectCursors) {
                        return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(objectObjectCursor.value.getSourceAsMap())));
                    }
                    throw new ElasticSql2DslException("sql语句解析失败!!!");
                } else {
                    return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, builder.value(nodeClient.search(parseResult.toRequest()).actionGet())));
                }
            }
        } catch (Exception e) {
            return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.INTERNAL_SERVER_ERROR, XContentType.JSON.mediaType(), "{\"error\":\"" + e.getMessage() + "\"}"));
        }
    }


}
