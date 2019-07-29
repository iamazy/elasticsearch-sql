package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
@FunctionalInterface
public interface IConditionExactQueryBuilder {
    QueryBuilder buildQuery(String fieldName, SqlConditionOperator operator,Object[] rightParams);
}
