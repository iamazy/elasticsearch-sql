package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/8/14
 **/
public class ExistsQueryParser implements ExpressionQueryParser<ElasticsearchParser.IsClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.IsClauseContext expression) {
        String field = expression.field.getText();
        if(expression.not!=null){
            return new AtomicQuery(QueryBuilders.existsQuery(field));
        }
        return new AtomicQuery(QueryBuilders.boolQuery().mustNot(QueryBuilders.existsQuery(field)));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.IsClauseContext.class==clazz;
    }
}
