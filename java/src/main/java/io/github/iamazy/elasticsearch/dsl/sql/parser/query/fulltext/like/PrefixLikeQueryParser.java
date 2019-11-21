package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext.like;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact.AbstractExactQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.FuzzyQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/11/21
 * @descrition
 **/
public class PrefixLikeQueryParser extends AbstractExactQueryParser implements LikeQueryParser {

    @Override
    public AtomicQuery parse(ElasticsearchParser.LikeClauseContext expression) {
        SqlConditionOperator operator = expression.not == null ? SqlConditionOperator.Like : SqlConditionOperator.NotLike;
        return parseCondition(expression, operator, null, (fieldName, operator1, rightParams) -> {
            String pattern = StringManager.removeStringSymbol(expression.pattern.getText());
            QueryBuilder prefixQuery = QueryBuilders.prefixQuery(fieldName, pattern);
            switch (operator1) {
                case Like: {
                    return prefixQuery;
                }
                default:
                case NotLike: {
                    return QueryBuilders.boolQuery().mustNot(prefixQuery);
                }
            }
        });
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.LikeClauseContext.class==clazz;
    }
}
