package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019-08-03
 * @descrition
 **/
public class FullTextQueryParser implements ExpressionQueryParser<ElasticsearchParser.FullTextContext> {

    private QueryStringQueryParser queryStringQueryParser;

    public FullTextQueryParser(){
        this.queryStringQueryParser=new QueryStringQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.FullTextContext expression) {
        if (expression.fullTextClause().queryStringClause()!=null){
            queryStringQueryParser.parse(expression.fullTextClause().queryStringClause());
        }
        return null;
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return false;
    }
}
