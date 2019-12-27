package io.github.iamazy.elasticsearch.dsl.sql.parser.query.join;


import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.sql.parser.ExpressionQueryParser;

/**
 * @author iamazy
 * @date 2019/8/2
 * @descrition
 **/
public class JoinQueryParser implements ExpressionQueryParser<ElasticsearchParser.JoinContext> {

    private final HasParentQueryParser hasParentQueryParser;
    private final HasChildQueryParser hasChildQueryParser;

    public JoinQueryParser(){
        this.hasChildQueryParser=new HasChildQueryParser();
        this.hasParentQueryParser=new HasParentQueryParser();
    }

    @Override
    public AtomicQuery parse(ElasticsearchParser.JoinContext expression) {
        if(expression.hasChildClause()!=null){
            return hasChildQueryParser.parse(expression.hasChildClause());
        }else {
            return hasParentQueryParser.parse(expression.hasParentClause());
        }
    }

    @Override
    public boolean isMatchExpressionInvocation(Class clazz) {
        return ElasticsearchParser.JoinContext.class==clazz||
                ElasticsearchParser.HasParentClauseContext.class==clazz||
                ElasticsearchParser.HasChildClauseContext.class==clazz;
    }
}
