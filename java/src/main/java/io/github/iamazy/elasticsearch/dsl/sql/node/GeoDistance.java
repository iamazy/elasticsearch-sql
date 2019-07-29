package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;


import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition Function GeoDistance,Distance type set to GeoDistance.ARC by default
 **/
public class GeoDistance extends AExpression{

    /**
     * GeoPoint field name
     */
    private final String field;

    /**
     * distance unit (ex: 12km)
     */
    private final String distance;

    /**
     * GeoPoint coordinate,for simply use, It only support geohash or latlon string
     */
    private final String coordinate;

    public GeoDistance(Location location, String field, String coordinate, String distance){
        super(location);
        this.field=field;
        this.coordinate=coordinate;
        this.distance=distance;
    }

    public String getField() {
        return field;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public String getDistance() {
        return distance;
    }

    @Override
    void extractVariables(Set<String> variables) {

    }

    @Override
    void analyze(Locals locals) {
    }

    @Override
    void write(MethodWriter writer, Globals globals) {

    }

    @Override
    public String toString() {
        return null;
    }

//    @Override
//    public GeoDistanceQueryBuilder parse() {
//        GeoDistanceQueryBuilder geoDistanceQueryBuilder = QueryBuilders.geoDistanceQuery(this.field).distance(this.distance);
//        if(coordinate.contains(",")){
//            String[] latlon=coordinate.split(",");
//            return geoDistanceQueryBuilder.point(Double.parseDouble(latlon[0]),Double.parseDouble(latlon[1]));
//        }
//        return geoDistanceQueryBuilder.geohash(coordinate);
//    }
}
