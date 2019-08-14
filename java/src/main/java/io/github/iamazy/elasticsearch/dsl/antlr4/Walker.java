package io.github.iamazy.elasticsearch.dsl.antlr4;

import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;


/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class Walker {

    private final String sql;

    private ElasticSqlParseResult parseResult;

    public Walker(String sql) {
        this.sql = sql;
        parseResult=new ElasticSqlParseResult();
    }

    public ElasticSqlParseResult getParseResult() {
        return parseResult;
    }

    //TODO: set package access to private
    public  ElasticsearchParser.SqlContext buildAntlrTree(){
        if(StringUtils.isBlank(this.sql)){
            throw new ElasticSql2DslException("blank sql is not allowed");
        }
        CharStream stream = CharStreams.fromString(this.sql);
        ElasticsearchLexer lexer=new EnhanceElasticsearchLexer(stream);
        ElasticsearchParser parser=new ElasticsearchParser(new CommonTokenStream(lexer));
        ParserErrorStrategy strategy=new ParserErrorStrategy(this.sql);
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        parser.setErrorHandler(strategy);
        return parser.sql();
    }


    private Location location(ParserRuleContext ctx) {
        return new Location(sql, ctx.getStart().getStartIndex());
    }
}
