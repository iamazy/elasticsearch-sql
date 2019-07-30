package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/
public class QueryFromParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        List<String> indices=new ArrayList<>(0);
        if(dslContext.getSqlContext().selectOperation()!=null){
            ElasticsearchParser.SelectOperationContext selectOperationContext=dslContext.getSqlContext().selectOperation();
            for(ElasticsearchParser.TableRefContext tableRef:selectOperationContext.tableRef()){
                indices.add(tableRef.indexName.getText());
            }

        }else if(dslContext.getSqlContext().deleteOperation()!=null){
            ElasticsearchParser.DeleteOperationContext deleteOperationContext=dslContext.getSqlContext().deleteOperation();
            for(ElasticsearchParser.TableRefContext tableRef:deleteOperationContext.tableRef()){
                indices.add(tableRef.indexName.getText());
            }
        }
        dslContext.getParseResult().setIndices(indices);
    }
}
