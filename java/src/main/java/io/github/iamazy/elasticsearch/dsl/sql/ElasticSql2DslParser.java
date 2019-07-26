package io.github.iamazy.elasticsearch.dsl.sql;

import io.github.iamazy.elasticsearch.dsl.antlr4.*;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import io.github.iamazy.elasticsearch.dsl.sql.node.ANode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.StringUtils;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class ElasticSql2DslParser {

    public ElasticSqlParseResult parse(String sql) throws ElasticSql2DslException{
        if(StringUtils.isBlank(sql)){
            throw new ElasticSql2DslException("blank sql is not allowed");
        }

        CharStream input = CharStreams.fromString(sql);

        ElasticsearchLexer lexer=new ElasticsearchLexer(input);
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);

        ElasticsearchParser parser=new ElasticsearchParser(tokenStream);

        ElasticsearchParser.SqlContext sqlTree=parser.sql();
        ElasticsearchParserVisitor<ANode> visitor=new Walker();
        ANode visit = visitor.visit(sqlTree);

        return null;
    }
}
