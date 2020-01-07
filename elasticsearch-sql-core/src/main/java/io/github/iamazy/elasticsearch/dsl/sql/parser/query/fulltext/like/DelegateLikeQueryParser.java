package io.github.iamazy.elasticsearch.dsl.sql.parser.query.fulltext.like;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;

import static io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchLexer.*;

/**
 * @author iamazy
 * @date 2019/11/21
 * @descrition
 **/
public class DelegateLikeQueryParser {

    public AtomicQuery parse(ElasticsearchParser.LikeClauseContext likeClauseContext,int idx){
        switch (idx){
            case FUZZY:{
                return new FuzzyLikeQueryParser().parse(likeClauseContext);
            }
            case WILDCARD:{
                return new WildcardLikeQueryParser().parse(likeClauseContext);
            }
            case PREFIX:{
                return new PrefixLikeQueryParser().parse(likeClauseContext);
            }
            default:{
                return new RegexpLikeQueryParser().parse(likeClauseContext);
            }
        }
    }
}
