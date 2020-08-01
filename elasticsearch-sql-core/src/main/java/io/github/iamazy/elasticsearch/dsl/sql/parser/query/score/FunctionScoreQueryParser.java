package io.github.iamazy.elasticsearch.dsl.sql.parser.query.score;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.index.query.functionscore.WeightBuilder;

/**
 * @author iamazy
 * @date 2019/8/13
 * @descrition
 **/
public class FunctionScoreQueryParser implements ExpressionQueryParser<ElasticsearchParser.FunctionScoreClauseContext> {

    private QueryBuilder queryBuilder;

    public FunctionScoreQueryParser(QueryBuilder queryBuilder) {
        this.queryBuilder = queryBuilder;
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.FunctionScoreClauseContext expression) {
        BoolExpressionParser boolExpressionParser = new BoolExpressionParser();
        int size = expression.expression().size();
        FunctionScoreQueryBuilder.FilterFunctionBuilder[] filterFunctionBuilders = new FunctionScoreQueryBuilder.FilterFunctionBuilder[size];
        for (int i = 0; i < size; i++) {
            WeightBuilder weightBuilder = ScoreFunctionBuilders.weightFactorFunction((size - i) * 5);
            FunctionScoreQueryBuilder.FilterFunctionBuilder filterFunctionBuilder = new FunctionScoreQueryBuilder.FilterFunctionBuilder(boolExpressionParser.parseBoolQueryExpr(expression.expression(i)), weightBuilder);
            filterFunctionBuilders[i] = filterFunctionBuilder;
        }
        return new AtomicQuery(new FunctionScoreQueryBuilder(this.queryBuilder, filterFunctionBuilders));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.FunctionScoreClauseContext.class == clazz;
    }
}
