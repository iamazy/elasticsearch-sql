package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.antlr4.Walker;
import io.github.iamazy.elasticsearch.dsl.sql.node.ANode;
import org.junit.Test;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSql2DslParserTest {

    @Test
    public void parse(){
        String sql="select name,^h!age,h!gender from student where a=1 and ( b=2 or c=3) limit 2,5";
        Walker walker=new Walker(sql);
        ElasticsearchParser.SqlContext sqlContext = walker.buildAntlrTree();
        ANode node= walker.visit(sqlContext);
        System.out.println(node);
    }
}
