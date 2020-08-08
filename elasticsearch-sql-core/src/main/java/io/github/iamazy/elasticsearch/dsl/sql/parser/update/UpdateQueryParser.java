package io.github.iamazy.elasticsearch.dsl.sql.parser.update;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.UpdateByQueryRequest;
import org.elasticsearch.script.Script;
import org.elasticsearch.script.ScriptType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/12/14
 **/
public class UpdateQueryParser implements QueryParser {

    private static final String UPDATE_PREFIX = "ctx._source.";
    private static final String PARAM_PREFIX = "param";

    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().updateOperation() != null) {
            if (dslContext.getSqlContext().updateOperation().identifyClause() == null) {
                parseUpdateByQuery(dslContext);
            } else {
                parseUpdate(dslContext);
            }
        }
    }

    private void parseUpdate(ElasticDslContext dslContext) {
        dslContext.getParseResult().setSqlOperation(SqlOperation.UPDATE);
        ElasticsearchParser.UpdateOperationContext updateOperationContext = dslContext.getSqlContext().updateOperation();
        String indexName = updateOperationContext.tableRef().indexName.getText();
        String id = StringManager.removeStringSymbol(updateOperationContext.identifyClause().id.getText());
        UpdateRequest updateRequest = new UpdateRequest(indexName, id);
        int size = updateOperationContext.ID().size();
        Map<String, Object> doc = new HashMap<>(0);
        for (int i = 0; i < size; i++) {
            if (updateOperationContext.identity(i).identityList() != null) {
                FlatMapUtils.flatPut(updateOperationContext.ID(i).getText(), parseIdentityList(updateOperationContext.identity(i).identityList().identity()), doc);
            } else if (updateOperationContext.identity(i).STRING() != null) {
                FlatMapUtils.flatPut(updateOperationContext.ID(i).getText(), StringManager.removeStringSymbol(updateOperationContext.identity(i).getText()), doc);
            } else {
                FlatMapUtils.flatPut(updateOperationContext.ID(i).getText(), updateOperationContext.identity(i).getText(), doc);
            }
        }
        updateRequest.doc(doc);
        if (updateOperationContext.routingClause() != null) {
            updateRequest.routing(StringManager.removeStringSymbol(updateOperationContext.routingClause().STRING(0).getText()));
        }
        dslContext.getParseResult().setUpdateRequest(updateRequest);
    }

    private void parseUpdateByQuery(ElasticDslContext dslContext) {
        dslContext.getParseResult().setSqlOperation(SqlOperation.UPDATE_BY_QUERY);
        ElasticsearchParser.UpdateOperationContext updateOperationContext = dslContext.getSqlContext().updateOperation();
        String indexName = updateOperationContext.tableRef().indexName.getText();
        UpdateByQueryRequest updateByQueryRequest = new UpdateByQueryRequest(indexName);
        int size = updateOperationContext.ID().size();
        StringBuilder builder = new StringBuilder();
        Map<String, Object> params = new HashMap<>(0);
        for (int i = 0; i < size; i++) {
            builder.append(UPDATE_PREFIX).append(updateOperationContext.ID(i).getText()).append('=');
            if (updateOperationContext.identity(i).identityList() != null) {
                builder.append("params.").append(PARAM_PREFIX).append(params.size());
                params.put(PARAM_PREFIX + params.size(), parseIdentityList(updateOperationContext.identity(i).identityList().identity()));
            } else if (updateOperationContext.identity(i).STRING() != null) {
                builder.append('\'').append(StringManager.removeStringSymbol(updateOperationContext.identity(i).STRING().getText())).append('\'');
            } else {
                builder.append(updateOperationContext.identity(i).number.getText());
            }
            builder.append(';');
        }
        updateByQueryRequest.setScript(new Script(ScriptType.INLINE, "painless", builder.toString(), params));
        if (updateOperationContext.routingClause() != null) {
            updateByQueryRequest.setRouting(StringManager.removeStringSymbol(updateOperationContext.routingClause().STRING(0).getText()));
        }
        if (updateOperationContext.whereClause() != null) {
            BoolExpressionParser boolExpressionParser = new BoolExpressionParser();
            updateByQueryRequest.setQuery(boolExpressionParser.parseBoolQueryExpr(updateOperationContext.whereClause().expression()));
        } else {
            updateByQueryRequest.setQuery(QueryBuilders.matchAllQuery());
        }
        if (updateOperationContext.batchClause() != null) {
            updateByQueryRequest.setBatchSize(Integer.parseInt(updateOperationContext.batchClause().size.getText()));
        }
        if (updateOperationContext.limitClause() != null) {
            updateByQueryRequest.setMaxDocs(Integer.parseInt(updateOperationContext.limitClause().size.getText()));
        }
        dslContext.getParseResult().setUpdateByQueryRequest(updateByQueryRequest);
    }

    private List<Object> parseIdentityList(List<ElasticsearchParser.IdentityContext> identityContexts) {
        List<Object> list = new ArrayList<>(0);
        for (ElasticsearchParser.IdentityContext identityContext : identityContexts) {
            if (identityContext.identityList() != null) {
                throw new ElasticSql2DslException("[syntax error] not support update nested array object");
            }
            if (identityContext.STRING() != null) {
                list.add(StringManager.removeStringSymbol(identityContext.getText()));
            } else {
                list.add(identityContext.getText());
            }
        }
        return list;
    }
}

