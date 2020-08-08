package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author iamazy
 * @date 2019/7/30
 **/
public interface ExpressionQueryParser<T extends ParserRuleContext> {
    AtomicQuery parse(T expression);

    boolean isMatchExpressionInvocation(Class clazz);
}
