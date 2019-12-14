package io.github.iamazy.elasticsearch.dsl.sql.parser.insert;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.action.index.IndexRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/12/14
 * @descrition not support insert nested object
 **/
public class InsertQueryParser implements QueryParser {

    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().insertOperation() != null) {
            dslContext.getParseResult().setSqlOperation(SqlOperation.INSERT);
            ElasticsearchParser.InsertOperationContext insertOperationContext = dslContext.getSqlContext().insertOperation();
            String indexName = insertOperationContext.tableRef().indexName.getText();
            int size = insertOperationContext.identity().size();
            Map<String, Object> source = new HashMap<>(0);
            for (int i = 0; i < size / 2; i++) {
                checkFieldsAndValues(insertOperationContext.identity(i), insertOperationContext.identity(i + size / 2));
                FlatMapUtils.flatPut(insertOperationContext.identity(i).ID().getText(), StringManager.removeStringSymbol(insertOperationContext.identity(i+size/2).getText()),source);
            }
            IndexRequest indexRequest=new IndexRequest(indexName);
            if(source.containsKey("_id")){
                indexRequest.id(source.get("_id").toString());
                source.remove("_id");
            }
            if(source.containsKey("_routing")){
                indexRequest.routing(source.get("_routing").toString());
                source.remove("_routing");
            }
            if(insertOperationContext.routingClause()!=null){
                indexRequest.routing(StringManager.removeStringSymbol(insertOperationContext.routingClause().STRING(0).getText()));
            }
            indexRequest.source(source);
            dslContext.getParseResult().setIndexRequest(indexRequest);
        }
    }

    private void checkFieldsAndValues(ElasticsearchParser.IdentityContext fieldContext, ElasticsearchParser.IdentityContext valueContext) {
        if (fieldContext.ID() == null) {
            throw new ElasticSql2DslException("[syntax error] field must be ID instance");
        }
        if (valueContext.ID() != null) {
            throw new ElasticSql2DslException("[syntax error] value must not be ID instance");
        }
    }
}
