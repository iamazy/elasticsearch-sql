package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import org.antlr.v4.runtime.ParserRuleContext;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public abstract class AbstractExactQueryParser {

    public AtomicQuery parseCondition(ParserRuleContext expression, SqlConditionOperator operator, Object[] params, IConditionExactQueryBuilder queryBuilder){
        if (expression instanceof ElasticsearchParser.NameExprContext){
            ElasticsearchParser.NameExprContext nameExprContext= (ElasticsearchParser.NameExprContext) expression;
            ElasticsearchParser.NameContext nameContext = nameExprContext.name();
            if(nameContext instanceof ElasticsearchParser.FieldNameContext){
                ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext) nameContext;
                if(fieldNameContext.highlighter!=null){
                    //TODO
                }
                QueryBuilder query = queryBuilder.buildQuery(fieldNameContext.field.getText(),operator,params);
                return new AtomicQuery(query);
            }

        }else if(expression instanceof ElasticsearchParser.BetweenAndContext){
            ElasticsearchParser.BetweenAndContext betweenAndContext=(ElasticsearchParser.BetweenAndContext) expression;
            QueryBuilder query = queryBuilder.buildQuery(betweenAndContext.expr.getText(),operator,params);
            return new AtomicQuery(query);
        }
        return null;
    }
}




































