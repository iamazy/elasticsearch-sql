package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/
public class QueryLimitParser implements QueryParser{


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null){
            ElasticsearchParser.LimitClauseContext limitClauseContext=dslContext.getSqlContext().selectOperation().limitClause();
            parseLimit(limitClauseContext,dslContext);
        }else if(dslContext.getSqlContext().deleteOperation()!=null){
            ElasticsearchParser.LimitClauseContext limitClauseContext=dslContext.getSqlContext().deleteOperation().limitClause();
            parseLimit(limitClauseContext,dslContext);
        }
    }

    private void parseLimit(ElasticsearchParser.LimitClauseContext limitClauseContext,ElasticDslContext dslContext){
        if(limitClauseContext==null){
            return;
        }
        if(limitClauseContext.offset!=null){
            dslContext.getParseResult().setFrom(Integer.parseInt(limitClauseContext.offset.getText()));
        }
        dslContext.getParseResult().setSize(Integer.parseInt(limitClauseContext.size.getText()));
    }
}
