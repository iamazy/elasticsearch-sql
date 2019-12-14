package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/12/14
 * @descrition
 **/
public class FlatMapTest {

    @Test
    public void flatTest(){
        Map<String,Object> map=new HashMap<>(0);
        FlatMapUtils.flatPut("deviceInfo.deviceLocation.zhCountry","中国",map);
        FlatMapUtils.flatPut("deviceInfo.deviceCategory","M_RSS",map);
        FlatMapUtils.flatPut("deviceInfo.deviceLocation.zhProvince","台湾",map);
        FlatMapUtils.flatPut("deviceInfo.deviceLocation.zhCity","台中市",map);
        System.out.println(map);
        Object o = FlatMapUtils.flatGet("deviceInfo.deviceLocation.zhCity", map);
        System.out.println(o);
        Object o1 = FlatMapUtils.flatGet("deviceInfo.deviceCategory", map);
        System.out.println(o1);
    }
}
