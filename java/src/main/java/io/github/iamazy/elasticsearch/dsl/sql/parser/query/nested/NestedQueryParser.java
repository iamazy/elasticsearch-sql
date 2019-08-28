package io.github.iamazy.elasticsearch.dsl.sql.parser.query.nested;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/8/2
 * @descrition
 **/
public class NestedQueryParser implements ExpressionQueryParser<ElasticsearchParser.NestedContext> {



    @Override
    public AtomicQuery parse(ElasticsearchParser.NestedContext expression) {
        String nestedPath=expression.nestedClause().nestedPath.getText();
        BoolExpressionParser  boolExpressionParser=new BoolExpressionParser();
        QueryBuilder queryBuilder = boolExpressionParser.parseBoolQueryExpr(expression.nestedClause().query);
        NestedQueryBuilder nestedQueryBuilder= QueryBuilders.nestedQuery(nestedPath,queryBuilder, ScoreMode.Avg);
        return new AtomicQuery(nestedQueryBuilder);
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.NestedContext.class==clazz;
    }
}
