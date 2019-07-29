package io.github.iamazy.elasticsearch.dsl.sql.enums;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public enum SqlConditionOperator {
    Equality,
    NotEqual,
    ApproximatelyEqual,
    NotApproximatelyEqual,
    GreaterThan,
    GreaterThanOrEqual,
    LessThan,
    LessThanOrEqual,
    IsNull,
    IsNotNull,
    In,
    NotIn,
    BetweenAnd,
    Like,
    NotLike
}