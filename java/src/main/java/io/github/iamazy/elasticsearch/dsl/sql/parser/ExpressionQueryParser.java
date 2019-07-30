package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/

public abstract class ExpressionQueryParser<T extends ParserRuleContext> {
    public abstract AtomicQuery parse(T expression);

    public abstract boolean isMatchExpressionInvocation(Class<T> clazz);
}
