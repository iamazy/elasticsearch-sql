package io.github.iamazy.elasticsearch.dsl.sql;

import org.elasticsearch.geometry.Point;
import org.elasticsearch.geometry.utils.Geohash;
import org.junit.Test;

/**
 * @author iamazy
 * @date 2019/8/21

 **/
public class GeoTest {

    @Test
    public void geohash(){
        String url="jdbc:es://10.10.2.43:9210/device_search_latest?useSSL=true";
        String[] split = url.split("/");
        System.out.println(split);
    }
}
