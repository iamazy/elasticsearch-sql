package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public abstract class AbstractExactQueryParser {

    AtomicQuery parseCondition(ElasticsearchParser.ExpressionContext expression, SqlConditionOperator operator, Object[] params, IConditionExactQueryBuilder queryBuilder){
        if (expression instanceof ElasticsearchParser.NameExprContext){
            ElasticsearchParser.NameExprContext nameExprContext= (ElasticsearchParser.NameExprContext) expression;
            ElasticsearchParser.NameContext nameContext = nameExprContext.name();
            if(nameContext instanceof ElasticsearchParser.FieldNameContext){
                ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext) nameContext;
                if(fieldNameContext.highlighter!=null){
                    //TODO
                }
            }

        }
        return null;
    }
}
