package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.junit.Test;

public class AggregationTest {

    /**
     * when aggregated field diff from grouped field
     */
    @Test
    public void t1() {
        long now = System.currentTimeMillis();
        String sql = "select max(age) from student group by class";
        ElasticSql2DslParser parser = new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis() - now);
    }

    /**
     * count(*)
     */
    @Test
    public void t2() {
        long now = System.currentTimeMillis();
        String sql = "select count(*) from student group by class";
        ElasticSql2DslParser parser = new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis() - now);
    }

    /**
     * count(distinct)
     */
    @Test
    public void t3() {
        long now = System.currentTimeMillis();
        String sql = "select count(distinct name) from student group by class";
        ElasticSql2DslParser parser = new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis() - now);
    }

    /**
     * no group by, only aggregation
     */
    @Test
    public void t4() {
        long now = System.currentTimeMillis();
        String sql = "select count(*), count(distinct name), max(age) from student where gender = '男'";
        ElasticSql2DslParser parser = new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.getSearchRequest()));
        System.out.println(System.currentTimeMillis() - now);
    }
}
