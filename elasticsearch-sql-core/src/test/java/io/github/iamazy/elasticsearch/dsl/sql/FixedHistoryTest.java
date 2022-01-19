package io.github.iamazy.elasticsearch.dsl.sql;

import org.junit.Test;

public class FixedHistoryTest {

    protected static ElasticSql2DslParser parser = new ElasticSql2DslParser();

    @Test
    public void fixedAt20220119(){
        // 1. distinct
        String distinctSql = "select distinct name from user ";
        System.out.println(parser.parse(distinctSql).toDsl());

    }

    @Test
    public void fixedOn20211221() {
        // 1. 去掉默认sortMode=avg ,默认为null
        // @io/github/iamazy/elasticsearch/dsl/sql/parser/QueryOrderByParser.java:36
        String fixDefaultSortMode = "select * from user order by id desc";
        System.out.println(parser.parse(fixDefaultSortMode).toDsl());

        // 2. 使得 and or 右侧 支持 in not in 等表达式
        // @io/github/iamazy/elasticsearch/dsl/sql/parser/query/exact/BinaryQueryParser.java:138
        String fixAndOrRightReg = "select * from user where id = 1 and ( name not in ('zs' ) or age < 18)";
        System.out.println(parser.parse(fixAndOrRightReg).toDsl());

        // 3. 添加无参toDsl
        // @io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult.toDsl()
    }

}
