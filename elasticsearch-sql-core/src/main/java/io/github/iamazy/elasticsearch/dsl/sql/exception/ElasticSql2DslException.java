package io.github.iamazy.elasticsearch.dsl.sql.exception;

/**
 * @author iamazy
 * @date 2019/7/26
 **/
public class ElasticSql2DslException extends RuntimeException {
    public ElasticSql2DslException(String message) {
        super(message);
    }

    public ElasticSql2DslException(Exception e){
        super(e);
    }
}