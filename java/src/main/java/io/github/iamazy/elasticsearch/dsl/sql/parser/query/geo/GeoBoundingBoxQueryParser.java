package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.GeoBoundingBoxQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/8/28
 * @descrition
 **/
public class GeoBoundingBoxQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoBoundingBoxClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoBoundingBoxClauseContext expression) {
        GeoBoundingBoxQueryBuilder geoBoundingBoxQueryBuilder = QueryBuilders.geoBoundingBoxQuery(expression.field.getText());
        if (expression.leftTop.getText().contains(",")&&expression.rightBottom.getText().contains(",")) {
            String[] leftTop = StringManager.removeStringSymbol(expression.leftTop.getText()).split(",");
            String[] rightBottom = StringManager.removeStringSymbol(expression.rightBottom.getText()).split(",");
            geoBoundingBoxQueryBuilder.setCorners(Double.parseDouble(leftTop[0]), Double.parseDouble(leftTop[1]),Double.parseDouble(rightBottom[0]),Double.parseDouble(rightBottom[1]));
        } else {
            geoBoundingBoxQueryBuilder.setCorners(StringManager.removeStringSymbol(expression.leftTop.getText()),StringManager.removeStringSymbol(expression.rightBottom.getText()));
        }
        return new AtomicQuery(geoBoundingBoxQueryBuilder);
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoBoundingBoxClauseContext.class == clazz;
    }

}
