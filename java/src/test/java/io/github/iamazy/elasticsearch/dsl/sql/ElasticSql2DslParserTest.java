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
        String sql="select name,^h!age,h!gender from student where (a between 1 and 2) and c=1 and (( location = 'geoaaa' and geopoint = '40.0,30.0' and distance = '12km') or t='bb') limit 2,5";
        ElasticSql2DslParser parser=new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = parser.parse(sql);
        System.out.println(parseResult.toPrettyDsl(parseResult.toRequest()));
        System.out.println(System.currentTimeMillis()-now);
    }

}
