package io.github.iamazy.elasticsearch.dsl.sql.parser.delete;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.DeleteByQueryRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/12/14
 **/
public class DeleteQueryParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().deleteOperation() != null) {
            if (dslContext.getSqlContext().deleteOperation().identifyClause() == null) {
                parseDeleteByQuery(dslContext);
            } else {
                parseDelete(dslContext);
            }
        }
    }

    private void parseDelete(ElasticDslContext dslContext) {
        dslContext.getParseResult().setSqlOperation(SqlOperation.DELETE);
        ElasticsearchParser.DeleteOperationContext deleteOperationContext = dslContext.getSqlContext().deleteOperation();
        DeleteRequest deleteRequest = new DeleteRequest(deleteOperationContext.tableRef(0).indexName.getText());
        deleteRequest.id(StringManager.removeStringSymbol(deleteOperationContext.identifyClause().id.getText()));
        if (deleteOperationContext.routingClause() != null) {
            deleteRequest.routing(StringManager.removeStringSymbol(deleteOperationContext.routingClause().STRING(0).getText()));
        }
        dslContext.getParseResult().setDeleteRequest(deleteRequest);
    }


    private void parseDeleteByQuery(ElasticDslContext dslContext) {
        dslContext.getParseResult().setSqlOperation(SqlOperation.DELETE_BY_QUERY);
        ElasticsearchParser.DeleteOperationContext deleteOperationContext = dslContext.getSqlContext().deleteOperation();
        List<String> indices = new ArrayList<>(0);
        for (ElasticsearchParser.TableRefContext tableRefContext : deleteOperationContext.tableRef()) {
            indices.add(tableRefContext.indexName.getText());
        }
        DeleteByQueryRequest deleteByQueryRequest = new DeleteByQueryRequest(indices.toArray(new String[0]));
        BoolExpressionParser boolExpressionParser = new BoolExpressionParser();
        if (deleteOperationContext.whereClause() != null) {
            deleteByQueryRequest.setQuery(boolExpressionParser.parseBoolQueryExpr(deleteOperationContext.whereClause().expression()));
        } else {
            deleteByQueryRequest.setQuery(QueryBuilders.matchAllQuery());
        }
        if (deleteOperationContext.routingClause() != null) {
            deleteByQueryRequest.setRouting(StringManager.removeStringSymbol(deleteOperationContext.routingClause().STRING(0).getText()));
        }
        if (deleteOperationContext.batchClause() != null) {
            deleteByQueryRequest.setBatchSize(Integer.parseInt(deleteOperationContext.batchClause().size.getText()));
        }
        if (deleteOperationContext.limitClause() != null) {
            deleteByQueryRequest.setMaxDocs(Integer.parseInt(deleteOperationContext.limitClause().size.getText()));
        }
        dslContext.getParseResult().setDeleteByQueryRequest(deleteByQueryRequest);
    }
}
