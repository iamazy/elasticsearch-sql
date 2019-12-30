package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.score.FunctionScoreQueryParser;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/
public class QueryWhereConditionParser extends BoolExpressionParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null){
            ElasticsearchParser.WhereClauseContext whereClauseContext = dslContext.getSqlContext().selectOperation().whereClause();
            parseWhereCondition(dslContext,whereClauseContext);
            if(dslContext.getSqlContext().selectOperation().functionScoreClause()!=null){
                FunctionScoreQueryParser functionScoreQueryParser=new FunctionScoreQueryParser(dslContext.getParseResult().getWhereCondition());
                AtomicQuery atomicQuery = functionScoreQueryParser.parse(dslContext.getSqlContext().selectOperation().functionScoreClause());
                dslContext.getParseResult().setWhereCondition(atomicQuery.getQueryBuilder());
            }
        }else if(dslContext.getSqlContext().deleteOperation()!=null){
            ElasticsearchParser.WhereClauseContext whereClauseContext = dslContext.getSqlContext().deleteOperation().whereClause();
            parseWhereCondition(dslContext,whereClauseContext);
        }else if(dslContext.getSqlContext().updateOperation()!=null){
            ElasticsearchParser.WhereClauseContext whereClauseContext = dslContext.getSqlContext().updateOperation().whereClause();
            parseWhereCondition(dslContext,whereClauseContext);
        }
    }

    private void parseWhereCondition(ElasticDslContext dslContext,ElasticsearchParser.WhereClauseContext whereClauseContext){
        if(whereClauseContext!=null) {
            ElasticsearchParser.ExpressionContext expression = whereClauseContext.expression();
            QueryBuilder queryBuilder = parseBoolQueryExpr(expression);
            dslContext.getParseResult().setWhereCondition(queryBuilder);
            dslContext.getParseResult().getHighlighter().addAll(this.highlighter);
        }
    }
}
