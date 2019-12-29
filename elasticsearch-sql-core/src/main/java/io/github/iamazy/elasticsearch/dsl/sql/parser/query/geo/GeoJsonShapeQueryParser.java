package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.GeoUtils;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.common.geo.builders.ShapeBuilder;
import org.elasticsearch.common.geo.parsers.ShapeParser;
import org.elasticsearch.common.xcontent.LoggingDeprecationHandler;
import org.elasticsearch.common.xcontent.NamedXContentRegistry;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.geometry.Geometry;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.io.IOException;

/**
 * @author iamazy
 * @date 2019/9/23
 * @descrition
 **/
public class GeoJsonShapeQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoJsonShapeClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoJsonShapeClauseContext expression) {
        try {
            QueryBuilder queryBuilder = QueryBuilders.geoShapeQuery(expression.field.getText(), parseGeometry(StringManager.removeStringSymbol(expression.geojson.getText())))
                    .relation(GeoUtils.parseGeoRelation(expression.relation.getType()));
            return new AtomicQuery(queryBuilder);
        } catch (Exception e) {
            throw new ElasticSql2DslException("geo shape parse error: " + e.getMessage());
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoJsonShapeClauseContext.class == clazz;
    }

    /**
     * turn GeoJson to ShapeBuilder
     *
     * @param geometry
     * @return
     * @throws IOException
     */
    private Geometry parseGeometry(String geometry) throws IOException {
        XContentParser xContentParser = JsonXContent.jsonXContent.createParser(NamedXContentRegistry.EMPTY, LoggingDeprecationHandler.INSTANCE, geometry);
        xContentParser.nextToken();
        return ShapeParser.parse(xContentParser).buildGeometry();
    }
}
