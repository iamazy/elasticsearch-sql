package io.github.iamazy.elasticsearch.dsl.sql.parser.query.score;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019/8/13
 * @descrition
 **/
public class ScoreQueryParser implements ExpressionQueryParser<ElasticsearchParser.ScoreContext> {

    private final FunctionScoreQueryParser functionScoreQueryParser;

    public ScoreQueryParser(){
        this.functionScoreQueryParser=new FunctionScoreQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.ScoreContext expression) {
        if(expression.functionScoreClause()!=null){
            return functionScoreQueryParser.parse(expression.functionScoreClause());
        }
        return null;
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return clazz== ElasticsearchParser.ScoreContext.class || ElasticsearchParser.FunctionScoreClauseContext.class==clazz;
    }
}
