package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019-08-03
 * @descrition
 **/
public class FullTextQueryParser implements ExpressionQueryParser<ElasticsearchParser.FullTextContext> {

    private final QueryStringQueryParser queryStringQueryParser;

    public FullTextQueryParser(){
        this.queryStringQueryParser=new QueryStringQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.FullTextContext expression) {
        if (expression.fullTextClause().queryStringClause()!=null){
            return queryStringQueryParser.parse(expression.fullTextClause().queryStringClause());
        }
        throw new ElasticSql2DslException("not support yet");
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.FullTextContext.class==clazz;
    }
}
