package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.GeoUtils;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.common.geo.GeoJson;
import org.elasticsearch.common.xcontent.LoggingDeprecationHandler;
import org.elasticsearch.geometry.Geometry;
import org.elasticsearch.geometry.utils.StandardValidator;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.xcontent.NamedXContentRegistry;
import org.elasticsearch.xcontent.XContentParser;
import org.elasticsearch.xcontent.json.JsonXContent;

import java.io.IOException;

/**
 * @author iamazy
 * @date 2019/9/23
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
        return GeoJson.fromXContent(StandardValidator.instance(true), true, true, xContentParser);
    }
}
