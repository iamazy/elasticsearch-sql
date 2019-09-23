package io.github.iamazy.elasticsearch.dsl.utils;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.geo.ShapeRelation;

/**
 * @author iamazy
 * @date 2019/9/8
 * @descrition
 **/
public class GeoUtils {

    public static GeoPoint parseGeoPoint(ElasticsearchParser.PointContext pointContext) {
        return new GeoPoint(Double.parseDouble(pointContext.lat.getText()), Double.parseDouble(pointContext.lon.getText()));
    }

    public static ShapeRelation parseGeoRelation(int relation){
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
}
