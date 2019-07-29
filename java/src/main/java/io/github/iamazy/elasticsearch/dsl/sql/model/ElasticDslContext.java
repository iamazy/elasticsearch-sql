package io.github.iamazy.elasticsearch.dsl.sql.model;

import io.github.iamazy.elasticsearch.dsl.sql.node.AExpression;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class ElasticDslContext {

    private AExpression expression;

    private ElasticSqlParseResult parseResult;

    public ElasticDslContext(AExpression expression){
        this.expression=expression;
        parseResult=new ElasticSqlParseResult();
    }

    public ElasticSqlParseResult getParseResult() {
        return parseResult;
    }

    @Override
    public String toString() {
        return parseResult.toDsl(parseResult.toRequest());
    }
}
