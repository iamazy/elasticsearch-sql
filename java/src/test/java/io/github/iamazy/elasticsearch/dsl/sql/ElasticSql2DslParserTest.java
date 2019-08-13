package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.junit.Test;
/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition 注意：为了展示友好的json格式，使用jackson对json进行了pretty了，所以显示在解析时间不是真正的elasticsearch-sql解析成dsl的时间 <br/>
 *             需要将parseResult.toPrettyDsl()变成parseResult.toDsl()
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
        String sql="select name from student aggregate by terms(name,1)>(terms(aa,2),terms(bb,3)>(terms(cc,4))),terms(age,10)>(terms(weight,10))";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void nestedAgg(){
        long now=System.currentTimeMillis();
        String sql="select name from student aggregate by terms(name,1)>(terms(aa,2),[apple,cardinality(ip),terms(aaa,1)>(terms(bb,1),terms(cc,10)>(terms(hh,3),avg(age)),terms(vv,1))]) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void distinct(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student where a like '%appl%' limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void betweenAnd(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student where a between 1 and 2 aggregate by [apple,terms(a,1)],terms(b,1) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg1(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student aggregate by [apple,terms(a,1)],terms(bb,2),cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg2(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student aggregate by terms(bb,2)>([apple,terms(a,1)]),cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg3(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student aggregate by terms(bb,2)>([apple,terms(a,1)],cardinality(ip)) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg4(){
        long now=System.currentTimeMillis();
        String sql="select * from student aggregate by terms(bb,2)>(terms(cc,2)),[apple,terms(a,1)],cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void delete1(){
        long now=System.currentTimeMillis();
        String sql="delete from student where a=1";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(parseResult.toDelRequest());
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void desc(){
        long now=System.currentTimeMillis();
        String sql="desc student/xiaoming";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toMapping());
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void functionScore(){
        long now=System.currentTimeMillis();
        String sql="select * from student where age> 10 and query weight between 80 and 90 and color = 'red' func_score high > 160 && name ='小明' aggregate by terms(name,10),terms(age,10)>(cardinality(clazz))";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void multiMatch(){
        long now=System.currentTimeMillis();
        String sql="select * from student where (name,age) ~= 'hahah'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }
}
