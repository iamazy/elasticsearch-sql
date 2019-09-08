package io.github.iamazy.elasticsearch.dsl.utils;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import org.elasticsearch.common.geo.GeoPoint;

/**
 * @author iamazy
 * @date 2019/9/8
 * @descrition
 **/
public class GeoUtils {

    public static GeoPoint parseGeoPoint(ElasticsearchParser.GeoPointClauseContext geoPointClauseContext) {
        return new GeoPoint(Double.parseDouble(geoPointClauseContext.lat.getText()), Double.parseDouble(geoPointClauseContext.lon.getText()));
    }
}
