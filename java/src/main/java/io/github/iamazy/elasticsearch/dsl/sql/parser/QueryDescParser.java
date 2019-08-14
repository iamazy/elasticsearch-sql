package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import org.elasticsearch.action.admin.indices.mapping.get.GetFieldMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsRequest;

/**
 * @author iamazy
 * @date 2019-08-10
 * @descrition
 **/
public class QueryDescParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().descOperation()!=null){
            dslContext.getParseResult().setSqlOperation(SqlOperation.DESC);
            GetFieldMappingsRequest getFieldMappingsRequest = new GetFieldMappingsRequest();
            GetMappingsRequest getMappingsRequest = new GetMappingsRequest();
            ElasticsearchParser.TableRefContext tableRefContext=dslContext.getSqlContext().descOperation().tableRef();
            String index = tableRefContext.indexName.getText();
            if(dslContext.getSqlContext().descOperation().identity()!=null){
                String field = dslContext.getSqlContext().descOperation().identity().getText();
                getFieldMappingsRequest.indices(index);
                getFieldMappingsRequest.fields(field);
                dslContext.getParseResult().setFieldMappingsRequest(getFieldMappingsRequest);
            }else{
                getMappingsRequest.indices(index);
                dslContext.getParseResult().setMappingsRequest(getMappingsRequest);
            }

        }
    }
}
