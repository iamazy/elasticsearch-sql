package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.AbstractExactQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RegexpQueryBuilder;

/**
 * @author iamazy
 * @date 2019/8/2
 * @descrition
 **/
public class LikeQueryParser extends AbstractExactQueryParser implements ExpressionQueryParser<ElasticsearchParser.LikeClauseContext> {

    @Override
    public AtomicQuery parse(ElasticsearchParser.LikeClauseContext expression) {
        SqlConditionOperator operator = expression.not == null ? SqlConditionOperator.Like : SqlConditionOperator.NotLike;
        return parseCondition(expression, operator, null, (fieldName, operator1, rightParams) -> {
            String pattern = StringManager.removeStringSymbol(expression.pattern.getText());
            if (pattern.contains(CoreConstants.MODULE)) {
                pattern = pattern.replaceAll(CoreConstants.MODULE, CoreConstants.STAR);
            }
            if (pattern.contains(CoreConstants.UNDERLINE)) {
                pattern = pattern.replaceAll(CoreConstants.UNDERLINE, CoreConstants.COND);
            }
            RegexpQueryBuilder regexpQueryBuilder = QueryBuilders.regexpQuery(fieldName, pattern);
            switch (operator1) {
                case Like: {
                    return regexpQueryBuilder;
                }
                default:
                case NotLike: {
                    return QueryBuilders.boolQuery().mustNot(regexpQueryBuilder);
                }
            }
        });
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.LikeClauseContext.class==clazz;
    }
}
