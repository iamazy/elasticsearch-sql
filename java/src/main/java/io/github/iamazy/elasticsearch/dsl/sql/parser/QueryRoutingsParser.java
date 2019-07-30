package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class QueryRoutingsParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        List<String> routings = new ArrayList<>(0);
        if (dslContext.getSqlContext().selectOperation() != null) {
            ElasticsearchParser.SelectOperationContext selectOperationContext = dslContext.getSqlContext().selectOperation();
            addRouting(selectOperationContext.routingClause(), routings);
        } else if (dslContext.getSqlContext().insertOperation() != null) {
            ElasticsearchParser.InsertOperationContext insertOperationContext = dslContext.getSqlContext().insertOperation();
            addRouting(insertOperationContext.routingClause(), routings);
        } else if (dslContext.getSqlContext().updateOperation() != null) {
            ElasticsearchParser.UpdateOperationContext updateOperationContext = dslContext.getSqlContext().updateOperation();
            addRouting(updateOperationContext.routingClause(), routings);
        } else if (dslContext.getSqlContext().deleteOperation() != null) {
            ElasticsearchParser.DeleteOperationContext deleteOperationContext = dslContext.getSqlContext().deleteOperation();
            addRouting(deleteOperationContext.routingClause(), routings);
        }
        if (CollectionUtils.isNotEmpty(routings)) {
            dslContext.getParseResult().setRoutingBy(routings);
        }
    }

    private void addRouting(ElasticsearchParser.RoutingClauseContext routingClauseContext, List<String> routings) {
        if (routingClauseContext != null) {
            for (TerminalNode node : routingClauseContext.STRING()) {
                routings.add(StringManager.removeStringSymbol(node.getText()));
            }
        }
    }
}
