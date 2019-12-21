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

    protected AtomicQuery parseCondition(ParserRuleContext expression, SqlConditionOperator operator, Object[] params, IConditionExactQueryBuilder queryBuilder){
        if (expression instanceof ElasticsearchParser.NameExprContext){
            ElasticsearchParser.NameExprContext nameExprContext= (ElasticsearchParser.NameExprContext) expression;
            ElasticsearchParser.NameClauseContext nameContext = nameExprContext.nameClause();
            if(nameContext instanceof ElasticsearchParser.FieldNameContext){
                return parseHighlighterField((ElasticsearchParser.FieldNameContext) nameContext,operator,params,queryBuilder);
            }

        }else if(expression instanceof ElasticsearchParser.BetweenAndContext){
            ElasticsearchParser.BetweenAndContext betweenAndContext=(ElasticsearchParser.BetweenAndContext) expression;
            if(betweenAndContext.expr instanceof ElasticsearchParser.FieldNameContext){
                ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext)betweenAndContext.expr;
                return parseHighlighterField(fieldNameContext,operator,params,queryBuilder);
            }
        }else if(expression instanceof ElasticsearchParser.InClauseContext){
            ElasticsearchParser.InClauseContext inClauseContext=(ElasticsearchParser.InClauseContext)expression;
            if(inClauseContext.left instanceof ElasticsearchParser.FieldNameContext){
                return parseHighlighterField((ElasticsearchParser.FieldNameContext)inClauseContext.left,operator,params,queryBuilder);
            }else {
                QueryBuilder query = queryBuilder.buildQuery(inClauseContext.left.getText(), operator, params);
                return new AtomicQuery(query);
            }
        }else if(expression instanceof ElasticsearchParser.LikeClauseContext){
            ElasticsearchParser.LikeClauseContext likeClauseContext=(ElasticsearchParser.LikeClauseContext) expression;
            if(likeClauseContext.field instanceof ElasticsearchParser.FieldNameContext){
                return parseHighlighterField((ElasticsearchParser.FieldNameContext)likeClauseContext.field,operator,params,queryBuilder);
            }else {
                QueryBuilder query = queryBuilder.buildQuery(likeClauseContext.field.getText(), operator, params);
                return new AtomicQuery(query);
            }
        }
        return null;
    }

    private AtomicQuery parseHighlighterField(ElasticsearchParser.FieldNameContext fieldNameContext,SqlConditionOperator operator, Object[] params,IConditionExactQueryBuilder queryBuilder){
        QueryBuilder query = queryBuilder.buildQuery(fieldNameContext.field.getText(), operator, params);
        AtomicQuery atomicQuery=new AtomicQuery(query);
        if(fieldNameContext.highlighter!=null) {
            atomicQuery.getHighlighter().add(fieldNameContext.field.getText());
        }
        return atomicQuery;

    }
}




































