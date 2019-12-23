package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<Integer> list=new ArrayList<>(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        FlatMapUtils.flatPut("parent.list1","list",map);
        FlatMapUtils.flatPut("parent.list3.list2",list,map);
        Map<String, Object> flat = FlatMapUtils.flat(map, null);
        System.out.println(flat);
    }
}
