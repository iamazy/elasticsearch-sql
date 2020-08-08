package io.github.iamazy.elasticsearch.dsl.sql.parser.query.score;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.BoolExpressionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import org.elasticsearch.index.query.DisMaxQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/9/10
 **/
public class DisMaxQueryParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null&&dslContext.getSqlContext().selectOperation().disMaxClause()!=null){
            ElasticsearchParser.DisMaxClauseContext disMaxClauseContext = dslContext.getSqlContext().selectOperation().disMaxClause();
            BoolExpressionParser boolExpressionParser=new BoolExpressionParser();
            DisMaxQueryBuilder queryBuilder=QueryBuilders.disMaxQuery();
            for(ElasticsearchParser.ExpressionContext expressionContext:disMaxClauseContext.expression()){
                queryBuilder.add(boolExpressionParser.parseBoolQueryExpr(expressionContext));
            }
            if(disMaxClauseContext.tieBreaker!=null){
                queryBuilder.tieBreaker(Float.parseFloat(disMaxClauseContext.tieBreaker.getText()));
            }
            dslContext.getParseResult().setWhereCondition(queryBuilder);
        }
    }
}
