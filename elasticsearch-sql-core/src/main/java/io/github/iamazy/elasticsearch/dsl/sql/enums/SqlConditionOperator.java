package io.github.iamazy.elasticsearch.dsl.sql.enums;

/**
 * @author iamazy
 * @date 2019/7/29
 **/
public enum SqlConditionOperator {
    Equality,
    NotEqual,
    ApproximatelyEqual,
    ApproximatelyNotEqual,
    MatchPhrase,
    NotMatchPhrase,
    MatchPhrasePrefix,
    NotMatchPhrasePrefix,
    Not,
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