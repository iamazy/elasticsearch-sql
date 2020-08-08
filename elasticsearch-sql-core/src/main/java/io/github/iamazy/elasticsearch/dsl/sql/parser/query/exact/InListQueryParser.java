package io.github.iamazy.elasticsearch.dsl.sql.parser.query.exact;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionOperator;
import io.github.iamazy.elasticsearch.dsl.sql.model.AtomicQuery;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author iamazy
 * @date 2019/7/31
 **/
public class InListQueryParser extends AbstractExactQueryParser{

    public AtomicQuery parse(ElasticsearchParser.InContext inContext){
        SqlConditionOperator operator = inContext.inClause().NOT() == null ? SqlConditionOperator.In:SqlConditionOperator.NotIn;
        List<Object> inList=new ArrayList<>(0);
        for(ElasticsearchParser.InRightOperandContext rightCtx:inContext.inClause().right.inRightOperand()){
            if(rightCtx instanceof ElasticsearchParser.ConstLiteralContext){
                ElasticsearchParser.ConstLiteralContext literalContext=(ElasticsearchParser.ConstLiteralContext)rightCtx;
                inList.add(literalContext.identity().getText());
            }
        }
        return parseCondition(inContext.inClause(),operator,inList.toArray(new Object[0]),(fieldName, operator1, rightParams) -> {
            if(SqlConditionOperator.In==operator1){
                return QueryBuilders.termsQuery(fieldName, Arrays.stream(rightParams).map(param->StringManager.removeStringSymbol(param.toString())).collect(Collectors.toList()));
            }
            return QueryBuilders.boolQuery().mustNot(QueryBuilders.termsQuery(fieldName,Arrays.stream(rightParams).map(param->StringManager.removeStringSymbol(param.toString())).collect(Collectors.toList())));
        });
    }
}
