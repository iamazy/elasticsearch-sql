package io.github.iamazy.elasticsearch.dsl.sql.model;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;

/**
 * @author iamazy
 * @date 2019/7/29
 **/
public class ElasticDslContext {

    private ElasticsearchParser.SqlContext sqlContext;

    private ElasticSqlParseResult parseResult;

    public ElasticDslContext(ElasticsearchParser.SqlContext sqlContext){
        this.sqlContext=sqlContext;
        parseResult=new ElasticSqlParseResult();
    }

    public ElasticSqlParseResult getParseResult() {
        return parseResult;
    }

    public ElasticsearchParser.SqlContext getSqlContext() {
        return sqlContext;
    }

    @Override
    public String toString() {
        return parseResult.toDsl(parseResult.getSearchRequest());
    }
}
