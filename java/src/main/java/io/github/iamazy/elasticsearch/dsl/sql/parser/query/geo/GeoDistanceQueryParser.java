package io.github.iamazy.elasticsearch.dsl.sql.parser.query.geo;


import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.GeoDistanceQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition
 **/
public class GeoDistanceQueryParser extends ExpressionQueryParser<ElasticsearchParser.GeoDistanceClauseContext> {


    @Override
    public AtomicQuery parse(ElasticsearchParser.GeoDistanceClauseContext expression) {
        GeoDistanceQueryBuilder geoDistanceQueryBuilder= QueryBuilders.geoDistanceQuery(StringManager.removeStringSymbol(expression.field.getText()));
        if(expression.GEOPOINT()!=null){
            String[] latLon=StringManager.removeStringSymbol(expression.coordinate.getText()).split(",");
            geoDistanceQueryBuilder.point(Double.parseDouble(latLon[0]),Double.parseDouble(latLon[1]));
        }else{
            geoDistanceQueryBuilder.geohash(StringManager.removeStringSymbol(expression.coordinate.getText()));
        }
        geoDistanceQueryBuilder.distance(StringManager.removeStringSymbol(expression.distance.getText()));
        return new AtomicQuery(geoDistanceQueryBuilder);
    }

    @Override
    public boolean isMatchExpressionInvocation(Class<ElasticsearchParser.GeoDistanceClauseContext> clazz) {
        return ElasticsearchParser.GeoDistanceClauseContext.class == clazz;
    }

}
