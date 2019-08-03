package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.junit.Test;
/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSql2DslParserTest {

    @Test
    public void parse(){
        long now=System.currentTimeMillis();
        String sql="select name,^h!age,h!gender from student where ((a in (1,2,3,4)) and has_parent(apple,bb~='fruit')) and c=1 and (location = 'geoaaa' and geopoint = '40.0,30.0' and distance = '1km' or t='bb') limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void nested(){
        long now=System.currentTimeMillis();
        String sql="select name from student where (([class1, age>1 and [class1.class2, name='hhha']] and c=1) or b~=='hhhhh') and query by 'apppple' limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void group(){
        long now=System.currentTimeMillis();
        String sql="select name from student where a='hhhhh' and query by 'apppple' limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }


}
