package io.github.iamazy.elasticsearch.dsl.sql.parser.aggs;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;

/**
 * @author iamazy
 * @date 2019-08-06
 * @descrition
 **/
public class GroupByQueryParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null&&dslContext.getSqlContext().selectOperation().groupByClause()!=null){
            ElasticsearchParser.GroupByClauseContext groupByClauseContext=dslContext.getSqlContext().selectOperation().groupByClause();
            for(ElasticsearchParser.NameContext nameContext:groupByClauseContext.name()){
                if(nameContext instanceof ElasticsearchParser.FieldNameContext){
                    ElasticsearchParser.FieldNameContext fieldNameContext = (ElasticsearchParser.FieldNameContext) nameContext;

                }
            }
        }
    }
}
