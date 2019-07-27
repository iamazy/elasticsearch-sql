package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;


import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition Function AGeoDistance,Distance type set to {{@link #GeoDistance.ARC}} by default
 **/
public class AGeoDistance extends AExpression{

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

    public AGeoDistance(Location location, String field, String coordinate, String distance){
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
}
