package io.github.iamazy.elasticsearch.dsl.sql;

import com.google.common.collect.ImmutableSet;
import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.antlr4.Walker;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import io.github.iamazy.elasticsearch.dsl.sql.parser.*;

import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
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
    private Set<QueryParser> buildSqlParserChain(){
        return ImmutableSet.of(
                new QuerySelectFieldsParser(),
                new QueryFromParser(),
                new QueryWhereConditionParser(),
                new QueryRoutingsParser(),
                new QueryLimitParser()
        );
    }
}
