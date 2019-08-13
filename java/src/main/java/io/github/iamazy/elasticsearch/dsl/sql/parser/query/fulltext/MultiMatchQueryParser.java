package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/8/13
 * @descrition
 **/
public class MultiMatchQueryParser implements ExpressionQueryParser<ElasticsearchParser.MultiMatchClauseContext> {
    @Override
    public AtomicQuery parse(ElasticsearchParser.MultiMatchClauseContext expression) {
        String[] fields=new String[expression.ID().size()];
        for(int i=0;i<expression.ID().size();i++){
            fields[i]=expression.ID(i).getText();
        }
        String value = StringManager.removeStringSymbol(expression.value.getText());
        return new AtomicQuery(QueryBuilders.multiMatchQuery(value,fields));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.MultiMatchClauseContext.class==clazz;
    }
}
