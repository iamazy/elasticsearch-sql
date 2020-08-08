package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.GeoUtils;
import org.elasticsearch.geometry.Geometry;
import org.elasticsearch.geometry.Line;
import org.elasticsearch.geometry.LinearRing;
import org.elasticsearch.geometry.MultiLine;
import org.elasticsearch.geometry.MultiPoint;
import org.elasticsearch.geometry.MultiPolygon;
import org.elasticsearch.geometry.Point;
import org.elasticsearch.geometry.Polygon;
import org.elasticsearch.geometry.Rectangle;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/9/23
 **/
public class GeoShapeQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoShapeClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoShapeClauseContext expression) {
        try {
            QueryBuilder queryBuilder = QueryBuilders.geoShapeQuery(expression.field.getText(), parseShapeBuilder(expression.shape.getType(), expression))
                    .relation(GeoUtils.parseGeoRelation(expression.relation.getType()));
            return new AtomicQuery(queryBuilder);
        } catch (Exception e) {
            throw new ElasticSql2DslException("geo shape parse error: " + e.getMessage());
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoShapeClauseContext.class == clazz;
    }


    private Geometry parseShapeBuilder(int shape, ElasticsearchParser.GeoShapeClauseContext geoShapeClauseContext) {
        switch (shape) {
            case ElasticsearchParser.POINT: {
                return parsePointContext(geoShapeClauseContext.point());
            }
            case ElasticsearchParser.ENVELOPE: {
                return parseRectangleContext(geoShapeClauseContext.points());
            }
            case ElasticsearchParser.LINESTRING: {
                return parseLineContext(geoShapeClauseContext.points());
            }
            case ElasticsearchParser.MULTIPOINT: {
                return new MultiPoint(parsePointsContext(geoShapeClauseContext.points()));
            }
            case ElasticsearchParser.MULTILINESTRING: {
                ElasticsearchParser.PolygonContext polygonContext = geoShapeClauseContext.polygon();
                List<Line> lines = new ArrayList<>(0);
                for (ElasticsearchParser.PointsContext pointsContext : polygonContext.points()) {
                    lines.add(new Line(traversePointsX(pointsContext), traversePointsY(pointsContext)));
                }
                return new MultiLine(lines);
            }
            case ElasticsearchParser.POLYGON: {
                return parsePolygonContext(geoShapeClauseContext.polygon());
            }
            default:
            case ElasticsearchParser.MULTIPOLYGON: {
                List<Polygon> multiPolygon = new ArrayList<>(0);
                ElasticsearchParser.MultiPolygonContext multiPolygonContext = geoShapeClauseContext.multiPolygon();
                for (ElasticsearchParser.PolygonContext polygonContext : multiPolygonContext.polygon()) {
                    multiPolygon.add(parsePolygonContext(polygonContext));
                }
                return new MultiPolygon(multiPolygon);
            }
        }
    }

    private Point parsePointContext(ElasticsearchParser.PointContext pointContext) {
        return new Point(Double.parseDouble(pointContext.lon.getText()), Double.parseDouble(pointContext.lat.getText()));
    }

    private Rectangle parseRectangleContext(ElasticsearchParser.PointsContext pointsContext) {
        double minX = Double.parseDouble(pointsContext.point(0).lon.getText());
        double maxX = Double.parseDouble(pointsContext.point(1).lon.getText());
        double minY = Double.parseDouble(pointsContext.point(0).lat.getText());
        double maxY = Double.parseDouble(pointsContext.point(1).lat.getText());
        return new Rectangle(minX, maxX, maxY, minY);
    }

    private List<Point> parsePointsContext(ElasticsearchParser.PointsContext pointsContext) {
        List<Point> points = new ArrayList<>(0);
        for (ElasticsearchParser.PointContext pointContext : pointsContext.point()) {
            points.add(parsePointContext(pointContext));
        }
        return points;
    }

    private Line parseLineContext(ElasticsearchParser.PointsContext pointsContext) {
        return new Line(traversePointsX(pointsContext), traversePointsY(pointsContext));
    }

    private LinearRing parseLinearRingContext(ElasticsearchParser.PointsContext pointsContext) {
        return new LinearRing(traversePointsX(pointsContext), traversePointsY(pointsContext));
    }

    private double[] traversePointsX(ElasticsearchParser.PointsContext pointsContext) {
        double[] lats = new double[pointsContext.point().size()];
        for (int i = 0; i < pointsContext.point().size(); i++) {
            lats[i] = Double.parseDouble(pointsContext.point(i).lon.getText());
        }
        return lats;
    }

    private double[] traversePointsY(ElasticsearchParser.PointsContext pointsContext) {
        double[] lons = new double[pointsContext.point().size()];
        for (int i = 0; i < pointsContext.point().size(); i++) {
            lons[i] = Double.parseDouble(pointsContext.point(i).lat.getText());
        }
        return lons;
    }

    private Polygon parsePolygonContext(ElasticsearchParser.PolygonContext polygonContext) {
        LinearRing linearRing = parseLinearRingContext(polygonContext.points(0));
        List<LinearRing> linearRings = new ArrayList<>(0);
        for (int i = 1; i < polygonContext.points().size(); i++) {
            linearRings.add(parseLinearRingContext(polygonContext.points(i)));
        }
        return new Polygon(linearRing, linearRings);
    }
}
