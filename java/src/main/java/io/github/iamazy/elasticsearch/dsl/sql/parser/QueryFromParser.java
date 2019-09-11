package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
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
            dslContext.getParseResult().setSqlOperation(SqlOperation.SELECT);
            ElasticsearchParser.SelectOperationContext selectOperationContext=dslContext.getSqlContext().selectOperation();
            for(ElasticsearchParser.TableRefContext tableRef:selectOperationContext.tableRef()){
                indices.add(tableRef.indexName.getText());
            }
            if(dslContext.getSqlContext().selectOperation().trackTotalClause()!=null){
                dslContext.getParseResult().trackTotalHits(true);
            }
        }else if(dslContext.getSqlContext().deleteOperation()!=null){
            dslContext.getParseResult().setSqlOperation(SqlOperation.DELETE);
            ElasticsearchParser.DeleteOperationContext deleteOperationContext=dslContext.getSqlContext().deleteOperation();
            for(ElasticsearchParser.TableRefContext tableRef:deleteOperationContext.tableRef()){
                indices.add(tableRef.indexName.getText());
            }
            if(dslContext.getSqlContext().deleteOperation().trackTotalClause()!=null){
                dslContext.getParseResult().trackTotalHits(true);
            }
        }else if(dslContext.getSqlContext().updateOperation()!=null){
            dslContext.getParseResult().setSqlOperation(SqlOperation.UPDATE);
            //TODO
            if(dslContext.getSqlContext().updateOperation().trackTotalClause()!=null){
                dslContext.getParseResult().trackTotalHits(true);
            }
        }
        dslContext.getParseResult().setIndices(indices);
    }
}
