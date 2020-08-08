package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;


/**
 * @author iamazy
 * @date 2019-08-03
 **/
public class QueryStringQueryParser implements ExpressionQueryParser<ElasticsearchParser.QueryStringClauseContext> {
    @Override
    public AtomicQuery parse(ElasticsearchParser.QueryStringClauseContext expression) {
        String text = StringManager.removeStringSymbol(expression.STRING().getText());
        return new AtomicQuery(QueryBuilders.queryStringQuery(text));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.QueryStringClauseContext.class == clazz;
    }
}
