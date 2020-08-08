package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019-08-03
 **/
public class FullTextQueryParser implements ExpressionQueryParser<ElasticsearchParser.FullTextContext> {

    private final QueryStringQueryParser queryStringQueryParser;
    private final MultiMatchQueryParser multiMatchQueryParser;

    public FullTextQueryParser(){
        this.queryStringQueryParser=new QueryStringQueryParser();
        this.multiMatchQueryParser=new MultiMatchQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.FullTextContext expression) {
        if (expression.fullTextClause().queryStringClause()!=null){
            return queryStringQueryParser.parse(expression.fullTextClause().queryStringClause());
        }else if(expression.fullTextClause().multiMatchClause()!=null){
            return multiMatchQueryParser.parse(expression.fullTextClause().multiMatchClause());
        }
        throw new ElasticSql2DslException("not support yet");
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.FullTextContext.class==clazz || ElasticsearchParser.MultiMatchClauseContext.class==clazz || ElasticsearchParser.FullTextClauseContext.class == clazz;
    }
}
