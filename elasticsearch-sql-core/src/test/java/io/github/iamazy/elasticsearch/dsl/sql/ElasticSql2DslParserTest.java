package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.elasticsearch.search.aggregations.bucket.composite.CompositeValuesSourceBuilder;
import org.junit.Test;

import java.util.Arrays;

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
        String sql="select name,^h!age,h!gender from student where ((a in (1,2,3,4)) and has_parent(apple,bb~='fruit')) and c=1 and (location.coordinate = [40.0,30.0] and distance = '1km' or t='bb') limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void nested(){
        long now=System.currentTimeMillis();
        String sql="select name from student where (([class1, age>1 and [class1.class2, name='hhha']] and c=1) or b~=='hhhhh') and query by 'apppple' limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void nested2(){
        long now=System.currentTimeMillis();
        String sql="select * from class where [student,student.name is null]";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void exists(){
        long now=System.currentTimeMillis();
        String sql="select * from student where name is not null and age >15";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void group(){
        long now=System.currentTimeMillis();
        String sql="select name from student aggregate by terms(name,1)>(terms(aa,2),terms(bb,3)>(terms(cc,4))),terms(age,10)>(terms(weight,10))";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void nestedAgg(){
        long now=System.currentTimeMillis();
        String sql="select name from student aggregate by terms(name,1)>(terms(aa,2),[apple,cardinality(ip),terms(aaa,1)>(terms(bb,1),terms(cc,10)>(terms(hh,3),avg(age)),terms(vv,1))]) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void distinct(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student where a like '%appl%' limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void betweenAnd(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student where a between 'dfsfsd' and 'ffff' aggregate by [apple,terms(a,1)],terms(b,1) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void betweenAnd2(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student where a ranged in (1,2] aggregate by [apple,terms(a,1)],terms(b,1) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg1(){
        long now=System.currentTimeMillis();
        String sql="select distinct h!name,h!age from student aggregate by [apple,terms(a,1)],terms(bb,2),cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg2(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student aggregate by terms(bb,2)>([apple,terms(a,1)]),cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg3(){
        long now=System.currentTimeMillis();
        String sql="select distinct name from student aggregate by terms(bb,2)>([apple,terms(a,1)],cardinality(ip)) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void agg4(){
        long now=System.currentTimeMillis();
        String sql="select * from student aggregate by terms(bb,2)>(terms(cc,2)),[apple,terms(a,1)],cardinality(ip) limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void compositeAgg(){

    }

    @Test
    public void desc(){
        long now=System.currentTimeMillis();
        String sql="describe student/xiaoming";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.getFieldMappingsRequest());
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void functionScore(){
        long now=System.currentTimeMillis();
        String sql="select * from student where h!age> 10 and h!weight between 80 and 90 and color = 'red' func_score high > 160 && name ='小明' aggregate by terms(name,10),terms(age,10)>(cardinality(clazz))";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void multiMatch(){
        long now=System.currentTimeMillis();
        String sql="select * from student where (name,age) ~= 'hahah'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void reindex(){
        long now=System.currentTimeMillis();
        String sql="insert into port_info_v1 select * from port_info where a=1";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.getReindexRequest());
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void highlighter(){
        long now=System.currentTimeMillis();
        String sql="select * from student where (h!name,age) ~= 'hahah' and h!ab='haliluya'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoDistance(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate=[40,30] and distance='100km' ";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoBoundingBox(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate between [30,70] and [20,50]";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoPolygon(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate in [[30.132,50],[40,60],[50,212]]";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate within [[10,11],[21,22]] shaped as envelope";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape2(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate contains [[[10,10],[20,20]],[[11,11],[21,21]]] shaped as multilinestring";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape3(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate within [10,10] shaped as point";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape4(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate intersects [[[10,10],[20,20],[11,11],[10,10]]] shaped as polygon";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape5(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate disjoint [[[[10,10],[22,21],[11,11],[10,10]]],[[[10,10],[20,20],[11,11],[10,10]]]] shaped as multipolygon ";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void geoShape6(){
        long now=System.currentTimeMillis();
        String sql="select * from student where location.coordinate disjoint `{\"coordinates\": [[-155.52, 19.61], [-156.22, 20.74], [-157.97, 21.46]], \"type\": \"linestring\"}`";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }



    @Test
    public void groupBy(){
        long now=System.currentTimeMillis();
        String sql="select max(name),avg(height),avg(name),min(name) from student group by name,age,height";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void disMax(){
        long now=System.currentTimeMillis();
        String sql="select * from student dis_max age>11 || name='小米宁' and ( height>1.6 or fruit ='apple') || firstName is not null and tie_breaker=0.7";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void trackTotalHits(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory='port_info' aggregate by terms(deviceInfo.deviceType,10) limit 0 track total";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void fuzzyLike(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory fuzzy like'port_info'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void wildcardLike(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory wildcard like 'port_info'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void prefixLike(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory prefix like 'port_info'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void regexpLike(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory regexp like 'port*'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void like(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where resCategory like 'port*'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

    @Test
    public void not(){
        long now=System.currentTimeMillis();
        String sql="select * from aaa where (not resCategory ~=== 'port*') or aa ~='apple'";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }
}
