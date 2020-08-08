package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;

/**
 * @author iamazy
 * @date 2019/7/29
 **/
public class BetweenAndQueryParser extends AbstractExactQueryParser {


    public AtomicQuery parse(ElasticsearchParser.BetweenAndContext betweenAndContext) {
        if(betweenAndContext.rangeClause()!=null){
            ElasticsearchParser.RangeClauseContext rangeClauseContext=betweenAndContext.rangeClause();
            String field=rangeClauseContext.field.getText();
            RangeQueryBuilder queryBuilder=QueryBuilders.rangeQuery(field);
            String leftValue = StringManager.removeStringSymbol(rangeClauseContext.left.getText());
            String rightValue = StringManager.removeStringSymbol(rangeClauseContext.right.getText());
            if(rangeClauseContext.LPAREN()!=null){
                queryBuilder.gt(leftValue);
            }else{
                queryBuilder.gte(leftValue);
            }
            if(rangeClauseContext.RPAREN()!=null){
                queryBuilder.lt(rightValue);
            }else{
                queryBuilder.lte(rightValue);
            }
            return new AtomicQuery(queryBuilder);
        }
        return parseCondition(betweenAndContext, SqlConditionOperator.BetweenAnd,
                new Object[]{betweenAndContext.left.getText(), betweenAndContext.right.getText()},
                (field, operator, params) -> QueryBuilders.rangeQuery(field).gte(StringManager.removeStringSymbol(params[0].toString())).lte(StringManager.removeStringSymbol(params[1].toString())));
    }
}
















