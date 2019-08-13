package io.github.iamazy.elasticsearch.dsl.sql.parser.query.score;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.functionscore.*;

/**
 * @author iamazy
 * @date 2019/8/13
 * @descrition
 **/
public class FunctionScoreQueryParser implements ExpressionQueryParser<ElasticsearchParser.FunctionScoreClauseContext> {

    private static BoolExpressionParser boolExpressionParser;

    @Override
    public AtomicQuery parse(ElasticsearchParser.FunctionScoreClauseContext expression) {
        ElasticsearchParser.ExpressionContext leftExpr = expression.expression(0);
        if(boolExpressionParser==null){
            boolExpressionParser=new BoolExpressionParser();
        }
        QueryBuilder queryBuilder = boolExpressionParser.parseBoolQueryExpr(leftExpr);
        int size=expression.expression().size();
        FunctionScoreQueryBuilder.FilterFunctionBuilder[] filterFunctionBuilders=new FunctionScoreQueryBuilder.FilterFunctionBuilder[size-1];
        for(int i=1;i<size;i++){
            WeightBuilder weightBuilder= ScoreFunctionBuilders.weightFactorFunction((size-i+1)*5);
            FunctionScoreQueryBuilder.FilterFunctionBuilder filterFunctionBuilder=new FunctionScoreQueryBuilder.FilterFunctionBuilder(boolExpressionParser.parseBoolQueryExpr(expression.expression(i)),weightBuilder);
            filterFunctionBuilders[i-1]=filterFunctionBuilder;
        }
        return new AtomicQuery(new FunctionScoreQueryBuilder(queryBuilder,filterFunctionBuilders));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.FunctionScoreClauseContext.class==clazz;
    }
}
