package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import org.elasticsearch.index.query.BoolQueryBuilder;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/
public class QueryWhereConditionParser extends BoolExpressionParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null){
            ElasticsearchParser.ExpressionContext expression = dslContext.getSqlContext().selectOperation().whereClause().expression();
            BoolQueryBuilder boolQueryBuilder = parseBoolQueryExpr(expression);
            dslContext.getParseResult().setWhereCondition(boolQueryBuilder);
        }else if(dslContext.getSqlContext().deleteOperation()!=null){

        }else if(dslContext.getSqlContext().updateOperation()!=null){

        }
    }
}
