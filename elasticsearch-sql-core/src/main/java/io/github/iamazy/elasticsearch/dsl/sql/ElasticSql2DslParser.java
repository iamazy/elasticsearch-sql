package io.github.iamazy.elasticsearch.dsl.sql;

import com.google.common.collect.ImmutableList;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.antlr4.Walker;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryFromParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryLimitParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryOrderByParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryRoutingsParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QuerySelectFieldsParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.QueryWhereConditionParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.AggregateByQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.delete.DeleteQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.desc.QueryDescParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.insert.InsertQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.score.DisMaxQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.reindex.ReindexQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.update.UpdateQueryParser;

import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/26
 **/
public class ElasticSql2DslParser {

    public ElasticSqlParseResult parse(String sql) throws ElasticSql2DslException{
        Walker walker=new Walker(sql);
        ElasticsearchParser.SqlContext sqlContext = walker.buildAntlrTree();
        ElasticDslContext elasticDslContext=new ElasticDslContext(sqlContext);
        for(QueryParser parser:buildSqlParserChain()){
            parser.parse(elasticDslContext);
        }
        return elasticDslContext.getParseResult();
    }


    /**
     *
     * @return QueryParser Set ,
     */
    private static List<QueryParser> buildSqlParserChain(){
        return ImmutableList.of(
                new QuerySelectFieldsParser(),
                new QueryFromParser(),
                new QueryWhereConditionParser(),
                new DisMaxQueryParser(),
                new QueryRoutingsParser(),
                new AggregateByQueryParser(),
                new QueryOrderByParser(),
                new QueryLimitParser(),

                new QueryDescParser(),
                new ReindexQueryParser(),
                new InsertQueryParser(),
                new UpdateQueryParser(),
                new DeleteQueryParser()
        );
    }
}
