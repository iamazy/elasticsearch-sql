package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;

/**
 * @author iamazy
 * @date 2019/7/29
 **/
@FunctionalInterface
public interface QueryParser {
    void parse(ElasticDslContext dslContext);
}
