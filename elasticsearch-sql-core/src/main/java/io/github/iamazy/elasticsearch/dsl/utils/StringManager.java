package io.github.iamazy.elasticsearch.dsl.utils;

/**
 * @author iamazy
 * @date 2019/7/30
 **/
public class StringManager {

    public static String removeStringSymbol(String str){
        return str.replaceAll("[`']","");
    }
}
