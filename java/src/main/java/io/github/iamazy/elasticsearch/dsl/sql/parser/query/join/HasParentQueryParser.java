package io.github.iamazy.elasticsearch.dsl.sql.parser.query.join;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.join.query.HasParentQueryBuilder;
import org.elasticsearch.join.query.JoinQueryBuilders;

/**
 * @author iamazy
 * @date 2019/8/2
 * @descrition
 **/
public class HasParentQueryParser implements ExpressionQueryParser<ElasticsearchParser.HasParentClauseContext> {

    private static BoolExpressionParser boolExpressionParser;

    @Override
    public AtomicQuery parse(ElasticsearchParser.HasParentClauseContext expression) {
        String type=expression.type.getText();
        if(boolExpressionParser==null){
            boolExpressionParser=new BoolExpressionParser();
        }
        QueryBuilder queryBuilder=boolExpressionParser.parseBoolQueryExpr(expression.query);
        HasParentQueryBuilder hasParentQueryBuilder= JoinQueryBuilders.hasParentQuery(type,queryBuilder,true);
        return new AtomicQuery(hasParentQueryBuilder);
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.HasParentClauseContext.class==clazz;
    }
}
