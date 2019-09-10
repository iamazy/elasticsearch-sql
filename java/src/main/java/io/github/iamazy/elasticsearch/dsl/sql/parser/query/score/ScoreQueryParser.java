package io.github.iamazy.elasticsearch.dsl.sql.parser.query.score;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;

/**
 * @author iamazy
 * @date 2019/8/13
 * @descrition
 **/
public class ScoreQueryParser implements QueryParser {


    @Override
    public void parse(ElasticDslContext dslContext) {
        if(dslContext.getSqlContext().selectOperation()!=null&&dslContext.getSqlContext().selectOperation().scoreClause()!=null){
            ElasticsearchParser.ScoreClauseContext scoreClauseContext=dslContext.getSqlContext().selectOperation().scoreClause();
            if(scoreClauseContext.functionScoreClause()!=null){
                FunctionScoreQueryParser functionScoreQueryParser=new FunctionScoreQueryParser(dslContext.getParseResult().getWhereCondition());
                AtomicQuery atomicQuery = functionScoreQueryParser.parse(scoreClauseContext.functionScoreClause());
                dslContext.getParseResult().setWhereCondition(atomicQuery.getQueryBuilder());
            }
        }
    }
}
