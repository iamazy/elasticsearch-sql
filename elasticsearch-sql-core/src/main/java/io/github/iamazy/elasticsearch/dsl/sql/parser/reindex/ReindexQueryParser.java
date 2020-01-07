package io.github.iamazy.elasticsearch.dsl.sql.parser.reindex;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.reindex.ReindexRequest;
import org.elasticsearch.index.reindex.RemoteInfo;
import org.elasticsearch.script.Script;
import org.elasticsearch.script.ScriptType;


import java.util.Collections;

import java.util.concurrent.TimeUnit;

/**
 * @author iamazy
 * @date 2019/8/14
 * @descrition
 **/
public class ReindexQueryParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().reindexOperation() != null) {
            dslContext.getParseResult().setSqlOperation(SqlOperation.REINDEX);
            ElasticsearchParser.ReindexOperationContext reindexOperationContext = dslContext.getSqlContext().reindexOperation();
            String destIndex = reindexOperationContext.tableRef(0).indexName.getText();
            String[] sourceIndices = new String[reindexOperationContext.tableRef().size() - 1];
            for (int i = 1; i <= sourceIndices.length; i++) {
                sourceIndices[i - 1] = reindexOperationContext.tableRef(i).indexName.getText();
            }
            ReindexRequest reindexRequest = new ReindexRequest();
            if (reindexOperationContext.fieldList().nameOperand().size() > 0) {
                buildScript(reindexOperationContext, reindexRequest);
            }
            if (reindexOperationContext.whereClause() != null) {
                BoolExpressionParser boolExpressionParser = new BoolExpressionParser();
                QueryBuilder queryBuilder = boolExpressionParser.parseBoolQueryExpr(reindexOperationContext.whereClause().expression());
                if (reindexOperationContext.host != null) {
                    reindexRequest.setRemoteInfo(buildRemoteInfo(reindexOperationContext, queryBuilder.toString()));
                } else {
                    reindexRequest.setSourceQuery(queryBuilder);
                }
            }
            if (reindexOperationContext.batchClause() != null) {
                reindexRequest.setSourceBatchSize(Integer.parseInt(reindexOperationContext.batchClause().size.getText()));
            }
            if (reindexOperationContext.limitClause() != null) {
                reindexRequest.setMaxDocs(Integer.parseInt(reindexOperationContext.limitClause().size.getText()));
            }
            reindexRequest.setDestIndex(destIndex);
            reindexRequest.setSourceIndices(sourceIndices);
            reindexRequest.setDestOpType("create");
            reindexRequest.setConflicts("proceed");
            reindexRequest.setShouldStoreResult(true);
            reindexRequest.setScroll(TimeValue.timeValueMinutes(10));
            ActionRequestValidationException validationException = reindexRequest.validate();
            if (validationException != null) {
                throw validationException;
            }
            dslContext.getParseResult().setReindexRequest(reindexRequest);
        }
    }


    private void buildScript(ElasticsearchParser.ReindexOperationContext reindexOperationContext, ReindexRequest reindexRequest) {
        StringBuilder script = new StringBuilder();
        for (ElasticsearchParser.NameOperandContext nameOperandContext : reindexOperationContext.fieldList().nameOperand()) {
            if (nameOperandContext.exclude != null) {
                script.append("ctx._source.remove('").append(nameOperandContext.fieldName.getText()).append("')';");
            }
        }
        if (StringUtils.isNotBlank(script.toString())) {
            reindexRequest.setScript(new Script(ScriptType.INLINE, "painless", script.toString(), Collections.emptyMap()));
        }
    }

    /**
     * get remote es clusters info
     *
     * @param reindexOperationContext
     * @param query                   elasticsearch query dsl
     * @return RemoteInfo
     */
    private RemoteInfo buildRemoteInfo(ElasticsearchParser.ReindexOperationContext reindexOperationContext, String query) {
        String[] hostInfo = reindexOperationContext.STRING(0).getText().split("://|:");
        String user = null;
        String password = null;
        if (reindexOperationContext.user != null) {
            user = reindexOperationContext.STRING(1).getText();
            password = reindexOperationContext.STRING(2).getText();
        }
        return new RemoteInfo(hostInfo[0], hostInfo[1], Integer.parseInt(hostInfo[2]),
                null, new BytesArray(query), user, password, Collections.emptyMap(), new TimeValue(1000, TimeUnit.MILLISECONDS),
                new TimeValue(100, TimeUnit.SECONDS));
    }
}
