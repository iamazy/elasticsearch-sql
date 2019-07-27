package io.github.iamazy.elasticsearch.dsl.sql;

import org.junit.Test;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSql2DslParserTest {

    @Test
    public void parse(){
        String sql="select name,^age,gender from student limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        parser.parse(sql);
    }
}
