package io.github.iamazy.elasticsearch.dsl.antlr4;

import org.antlr.v4.runtime.CharStream;

/**
 * @author iamazy
 * @date 2019/7/29
 **/
public class EnhanceElasticsearchLexer extends  ElasticsearchLexer {

    public EnhanceElasticsearchLexer(CharStream charStream){
        super(charStream);
    }
    @Override
    protected boolean isType(String name) {
        return false;
    }

    @Override
    protected boolean slashIsRegex() {
        return false;
    }
}
