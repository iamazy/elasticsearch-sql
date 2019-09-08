package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.GeoUtils;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.common.geo.GeoPoint;
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
        GeoPoint leftTop = GeoUtils.parseGeoPoint(expression.leftTop);
        GeoPoint rightBottom = GeoUtils.parseGeoPoint(expression.rightBottom);
        return new AtomicQuery(geoBoundingBoxQueryBuilder.setCorners(leftTop, rightBottom));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoBoundingBoxClauseContext.class == clazz;
    }

}
