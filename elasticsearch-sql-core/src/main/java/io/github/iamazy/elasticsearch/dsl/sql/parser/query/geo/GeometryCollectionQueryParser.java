package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.common.geo.builders.GeometryCollectionBuilder;

/**
 * @author iamazy
 * @date 2019/9/24
 * @descrition
 **/
public class GeometryCollectionQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoPolygonClauseContext> {
    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoPolygonClauseContext expression) {
        GeometryCollectionBuilder geometryCollectionBuilder=new GeometryCollectionBuilder();
        return null;
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return false;
    }
}
