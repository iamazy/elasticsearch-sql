package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;


import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition Geo Bounding Box type set to memory by default
 *             when both {{@link #leftTop}} and {{@link #rightBottom}} both set to 'dr' means that would match entire area
 **/
public class GeoBoundingBox extends AExpression {

    /**
     * GeoPoint field name
     */
    private final String field;

    /**
     * Box left top coordinate,for simply use,only support geohash or latlon string
     */
    private final String leftTop;

    /**
     * Box right bottom coordinate,for simply use,only support geohash or latlon string
     */
    private final String rightBottom;

    public GeoBoundingBox(Location location, String field, String leftTop, String rightBottom){
        super(location);
        this.field=field;
        this.leftTop=leftTop;
        this.rightBottom=rightBottom;
    }

    public String getField() {
        return field;
    }

    public String getLeftTop() {
        return leftTop;
    }

    public String getRightBottom() {
        return rightBottom;
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
