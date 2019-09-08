package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.GeoUtils;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/9/8
 * @descrition
 **/
public class GeoPolygonQueryParser implements ExpressionQueryParser<ElasticsearchParser.GeoPolygonClauseContext> {
    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoPolygonClauseContext expression) {
        String field=expression.ID().getText();
        List<GeoPoint> points=new ArrayList<>(0);
        for(ElasticsearchParser.GeoPointClauseContext geoPointClauseContext:expression.geoPointClause()){
            points.add(GeoUtils.parseGeoPoint(geoPointClauseContext));
        }
        return new AtomicQuery(QueryBuilders.geoPolygonQuery(field,points));
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.GeoPolygonClauseContext.class==clazz;
    }
}
