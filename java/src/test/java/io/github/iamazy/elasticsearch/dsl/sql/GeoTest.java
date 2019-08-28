package io.github.iamazy.elasticsearch.dsl.sql;

import org.elasticsearch.geo.geometry.Point;
import org.elasticsearch.geo.utils.Geohash;
import org.junit.Test;

/**
 * @author iamazy
 * @date 2019/8/21
 * @descrition
 **/
public class GeoTest {

    @Test
    public void geohash(){
        String hash=Geohash.stringEncode(121.617751, 23.996745);
        System.out.println(hash);
        Point point = Geohash.toPoint(hash);
        System.out.println(point);
    }
}
