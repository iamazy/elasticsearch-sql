package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import org.elasticsearch.common.geo.ShapeRelation;
import org.elasticsearch.common.geo.builders.*;
import org.elasticsearch.common.geo.parsers.ShapeParser;
import org.elasticsearch.common.xcontent.LoggingDeprecationHandler;
import org.elasticsearch.common.xcontent.NamedXContentRegistry;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.locationtech.jts.geom.Coordinate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/9/23
 * @descrition
 **/
public class GeoShapeQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoShapeClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoShapeClauseContext expression) {
        try {
            QueryBuilder queryBuilder= QueryBuilders.geoShapeQuery(expression.field.getText(),parseShapeBuilder(expression.shape.getType(),expression))
                    .relation(parseGeoRelation(expression.relation.getType()));
            return new AtomicQuery(queryBuilder);
        } catch (Exception e) {
            throw new ElasticSql2DslException("geo shape parse error: "+e.getMessage());
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoShapeClauseContext.class==clazz;
    }

    private ShapeRelation parseGeoRelation(int relation){
        switch (relation){
            case ElasticsearchParser.WITHIN:{
                return ShapeRelation.WITHIN;
            }
            case ElasticsearchParser.DISJOINT:{
                return ShapeRelation.DISJOINT;
            }
            case ElasticsearchParser.CONTAINS:{
                return ShapeRelation.CONTAINS;
            }
            default:
            case ElasticsearchParser.INTERSECTS:{
                return ShapeRelation.INTERSECTS;
            }
        }
    }

    /**
     * turn GeoJson to ShapeBuilder
     * @param geometry
     * @return
     * @throws IOException
     */
    private ShapeBuilder parseShapeBuilder(Map<String, Object> geometry) throws IOException {
        String json = CoreConstants.OBJECT_MAPPER.writeValueAsString(geometry);
        XContentParser xContentParser = JsonXContent.jsonXContent.createParser(NamedXContentRegistry.EMPTY, LoggingDeprecationHandler.INSTANCE, json);
        xContentParser.nextToken();
        return ShapeParser.parse(xContentParser);
    }


    private ShapeBuilder parseShapeBuilder(int shape, ElasticsearchParser.GeoShapeClauseContext geoShapeClauseContext){
        switch (shape) {
            case ElasticsearchParser.POINT: {
                return new PointBuilder().coordinate(parsePointContext(geoShapeClauseContext.point()));
            }
            case ElasticsearchParser.ENVELOPE: {
                ElasticsearchParser.PointsContext pointsContext = geoShapeClauseContext.points();
                return new EnvelopeBuilder(parsePointContext(pointsContext.point(0)), parsePointContext(pointsContext.point(1)));
            }
            case ElasticsearchParser.LINESTRING: {
                return new LineStringBuilder(parsePointsContext(geoShapeClauseContext.points()));
            }
            case ElasticsearchParser.MULTIPOINT: {
                return new MultiPointBuilder(parsePointsContext(geoShapeClauseContext.points()));
            }
            case ElasticsearchParser.MULTILINESTRING: {
                ElasticsearchParser.PolygonContext polygonContext = geoShapeClauseContext.polygon();
                MultiLineStringBuilder multiLineStringBuilder = new MultiLineStringBuilder();
                for (ElasticsearchParser.PointsContext pointsContext : polygonContext.points()) {
                    multiLineStringBuilder.linestring(new LineStringBuilder(parsePointsContext(pointsContext)));
                }
                return multiLineStringBuilder;
            }
            case ElasticsearchParser.POLYGON: {
                return parsePolygonContext(geoShapeClauseContext.polygon());
            }
            default:
            case ElasticsearchParser.MULTIPOLYGON: {
                MultiPolygonBuilder multiPolygonBuilder = new MultiPolygonBuilder();
                ElasticsearchParser.MultiPolygonContext multiPolygonContext = geoShapeClauseContext.multiPolygon();
                for (ElasticsearchParser.PolygonContext polygonContext : multiPolygonContext.polygon()) {
                    multiPolygonBuilder.polygon(parsePolygonContext(polygonContext));
                }
                return multiPolygonBuilder;
            }
        }
    }

    private Coordinate parsePointContext(ElasticsearchParser.PointContext pointContext){
        return new Coordinate(Double.parseDouble(pointContext.lon.getText()),Double.parseDouble(pointContext.lat.getText()));
    }

    private List<Coordinate> parsePointsContext(ElasticsearchParser.PointsContext pointsContext){
        List<Coordinate> coordinates=new ArrayList<>(0);
        for(ElasticsearchParser.PointContext pointContext:pointsContext.point()){
            coordinates.add(parsePointContext(pointContext));
        }
        return coordinates;
    }

    private PolygonBuilder parsePolygonContext(ElasticsearchParser.PolygonContext polygonContext){
        PolygonBuilder polygonBuilder=new PolygonBuilder(parsePolygonContext(polygonContext.points(0)));
        for(int i=1;i<polygonContext.points().size();i++){
            polygonBuilder.hole(new LineStringBuilder(parsePolygonContext(polygonContext.points(i))));
        }
        return polygonBuilder;
    }

    private CoordinatesBuilder parsePolygonContext(ElasticsearchParser.PointsContext pointsContext){
        List<Coordinate> coordinates=new ArrayList<>(0);
        for(ElasticsearchParser.PointContext pointContext:pointsContext.point()){
            coordinates.add(parsePointContext(pointContext));
        }
        return new CoordinatesBuilder().coordinates(coordinates).close();
    }
}
