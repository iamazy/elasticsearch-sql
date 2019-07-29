package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class BetweenAndQueryParser extends AbstractExactQueryParser {



    public AtomicQuery parseBetweenAndQuery(ElasticsearchParser.BetweenAndContext betweenAndContext) {
        if ((betweenAndContext.leftExpr instanceof ElasticsearchParser.PrimitiveContext)
                && (betweenAndContext.rightExpr instanceof ElasticsearchParser.PrimitiveContext)) {
            ElasticsearchParser.PrimitiveContext leftPrimitiveExpr = (ElasticsearchParser.PrimitiveContext) betweenAndContext.leftExpr;
            ElasticsearchParser.PrimitiveContext rightPrimitiveExpr = (ElasticsearchParser.PrimitiveContext) betweenAndContext.rightExpr;

            String left, right;
            if ((leftPrimitiveExpr.identity().number != null && rightPrimitiveExpr.identity().number != null) ||
                    (leftPrimitiveExpr.identity().str != null && rightPrimitiveExpr.identity().str != null)) {
                left = leftPrimitiveExpr.identity().getText();
                right = rightPrimitiveExpr.identity().getText();
                return parseCondition(betweenAndContext, SqlConditionOperator.BetweenAnd, new Object[]{left,right},(field,operator,params)-> QueryBuilders.rangeQuery(field).gte(params[0]).lte(params[1]));
            } else {
                throw new ElasticSql2DslException("[Between And] -> leftExpr and rightExpr must be the same primitive type");
            }
        } else {
            throw new ElasticSql2DslException("no support other type in between and syntax yet");
        }
    }
}
















