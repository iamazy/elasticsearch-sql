package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortMode;
import org.elasticsearch.search.sort.SortOrder;

/**
 * @author iamazy
 * @date 2019-08-04
 **/
public class QueryOrderByParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null&&dslContext.getSqlContext().selectOperation().groupByClause()==null){
            if(dslContext.getSqlContext().selectOperation().orderClause()!=null){
                ElasticsearchParser.OrderClauseContext orderClauseContext=dslContext.getSqlContext().selectOperation().orderClause();
                for(ElasticsearchParser.OrderContext orderContext:orderClauseContext.order()){
                    ElasticsearchParser.NameClauseContext nameContext = orderContext.nameClause();
                    if(nameContext instanceof ElasticsearchParser.FieldNameContext){
                        ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext)nameContext;
                        String field = fieldNameContext.field.getText();
                        if(fieldNameContext.highlighter!=null){
                            dslContext.getParseResult().getHighlighter().add(field);
                        }
                        SortOrder sortOrder;
                        if(orderContext.ASC()!=null) {
                            sortOrder=SortOrder.ASC;
                        }else{
                            sortOrder=SortOrder.DESC;
                        }
                        SortBuilder sortBuilder = SortBuilders.fieldSort(field).order(sortOrder);
                        dslContext.getParseResult().getOrderBy().add(sortBuilder);
                    }
                }
            }
        }
    }
}
