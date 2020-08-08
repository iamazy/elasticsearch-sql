package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019/8/13
 **/
public class MultiMatchQueryParser implements ExpressionQueryParser<ElasticsearchParser.MultiMatchClauseContext> {
    @Override
    public AtomicQuery parse(ElasticsearchParser.MultiMatchClauseContext expression) {
        String[] fields=new String[expression.nameClause().size()];
        Set<String> highlighters=new HashSet<>(0);
        for(int i=0;i<expression.nameClause().size();i++){
            if(expression.nameClause(i) instanceof ElasticsearchParser.FieldNameContext){
                ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext)expression.nameClause(i);
                if(fieldNameContext.highlighter!=null){
                    highlighters.add(fieldNameContext.field.getText());
                }
                fields[i]=fieldNameContext.field.getText();
            }

        }
        String value = StringManager.removeStringSymbol(expression.value.getText());
        AtomicQuery atomicQuery= new AtomicQuery(QueryBuilders.multiMatchQuery(value,fields));
        atomicQuery.getHighlighter().addAll(highlighters);
        return atomicQuery;
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.MultiMatchClauseContext.class==clazz;
    }
}
