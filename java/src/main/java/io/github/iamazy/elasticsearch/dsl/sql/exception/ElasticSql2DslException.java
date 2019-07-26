package io.github.iamazy.elasticsearch.dsl.sql.exception;

import com.alibaba.druid.sql.parser.ParserException;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSql2DslException extends RuntimeException {
    public ElasticSql2DslException(String message) {
        super(message);
    }

    public ElasticSql2DslException(ParserException ex) {
        super(ex);
    }
}