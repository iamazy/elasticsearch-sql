package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.AbstractExactQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext.like.DelegateLikeQueryParser;

/**
 * @author iamazy
 * @date 2019/8/2
 **/
public class LikeQueryParser extends AbstractExactQueryParser implements ExpressionQueryParser<ElasticsearchParser.LikeClauseContext> {

    @Override
    public AtomicQuery parse(ElasticsearchParser.LikeClauseContext expression) {
        int idx=0;
        if(expression.funName!=null){
            idx=expression.funName.getType();
        }
        return new DelegateLikeQueryParser().parse(expression,idx);
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.LikeClauseContext.class==clazz;
    }
}
