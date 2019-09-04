package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.collections4.CollectionUtils;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.collapse.CollapseBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition sql operation must be selection
 **/
public class QuerySelectFieldsParser implements QueryParser {

    @Override
    public void parse(ElasticDslContext dslContext) {
        if (dslContext.getSqlContext().selectOperation() != null) {
            if (dslContext.getSqlContext().selectOperation().groupByClause() == null) {
                ElasticsearchParser.SelectOperationContext selectOperationContext = dslContext.getSqlContext().selectOperation();
                ElasticsearchParser.FieldListContext fieldListContext = selectOperationContext.fieldList();
                if (fieldListContext.nameOperand().size() > 0) {
                    List<String> includeFields = new ArrayList<>(0);
                    List<String> excludeFields = new ArrayList<>(0);
                    for (ElasticsearchParser.NameOperandContext fieldName : fieldListContext.nameOperand()) {
                        if (fieldName.exclude != null) {
                            if (fieldName.fieldName instanceof ElasticsearchParser.FieldNameContext) {
                                excludeFields.add(((ElasticsearchParser.FieldNameContext) fieldName.fieldName).field.getText());
                            } else {
                                excludeFields.add(fieldName.fieldName.getText());
                            }
                        } else {
                            if (fieldName.fieldName instanceof ElasticsearchParser.FieldNameContext) {
                                ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext) fieldName.fieldName;
                                if(fieldNameContext.highlighter!=null){
                                    dslContext.getParseResult().getHighlighter().add(fieldNameContext.field.getText());
                                }
                                includeFields.add(fieldNameContext.field.getText());
                            } else if (fieldName.fieldName instanceof ElasticsearchParser.DistinctNameContext) {
                                ElasticsearchParser.DistinctNameContext distinctNameContext = (ElasticsearchParser.DistinctNameContext) fieldName.fieldName;
                                String distinctName = distinctNameContext.fieldName.getText();
                                if(distinctNameContext.fieldName instanceof ElasticsearchParser.FieldNameContext){
                                    ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext)distinctNameContext.fieldName;
                                    if(fieldNameContext.highlighter!=null){
                                        distinctName=fieldNameContext.field.getText();
                                        dslContext.getParseResult().getHighlighter().add(distinctName);
                                    }
                                }
                                if (dslContext.getParseResult().getCollapseBuilder() == null) {
                                    dslContext.getParseResult().setCollapseBuilder(new CollapseBuilder(distinctName));
                                }
                                includeFields.add(distinctName);
                            } else {
                                includeFields.add(fieldName.fieldName.getText());
                            }
                        }
                    }
                    if (CollectionUtils.isNotEmpty(includeFields)) {
                        dslContext.getParseResult().getIncludeFields().addAll(includeFields);
                    }
                    if (CollectionUtils.isNotEmpty(excludeFields)) {
                        dslContext.getParseResult().getExcludeFields().addAll(excludeFields);
                    }
                }
            }
            else{
                ElasticsearchParser.GroupByClauseContext groupByClauseContext = dslContext.getSqlContext().selectOperation().groupByClause();
                //only return aggregation data and not care about whether fields are included,excluded or highlighted
                dslContext.getParseResult().setSize(0);
                List<String> groupByFields=groupByClauseContext.ID().stream().map(TerminalNode::getText).collect(Collectors.toList());
                ElasticsearchParser.FieldListContext fieldListContext = dslContext.getSqlContext().selectOperation().fieldList();

                //TODO
                for(ElasticsearchParser.NameOperandContext nameOperandContext:fieldListContext.nameOperand()){
                    if(nameOperandContext.fieldName instanceof ElasticsearchParser.FieldNameContext){
                        ElasticsearchParser.FieldNameContext fieldNameContext=(ElasticsearchParser.FieldNameContext) nameOperandContext.fieldName;
                        //check whether field is valid
                        checkGroupByField(fieldNameContext.field.getText(),groupByFields);

                    }else if(nameOperandContext.fieldName instanceof ElasticsearchParser.GroupByFunctionNameContext){
                        ElasticsearchParser.GroupByFunctionNameContext groupByFunctionNameContext=(ElasticsearchParser.GroupByFunctionNameContext) nameOperandContext.fieldName;
                        ElasticsearchParser.GroupByFunctionClauseContext groupByFunctionClauseContext = groupByFunctionNameContext.groupByFunctionClause();
                        if(groupByFunctionClauseContext.count()!=null){
                            ElasticsearchParser.CountContext countContext=groupByFunctionClauseContext.count();
                            checkGroupByField(countContext.field.getText(),groupByFields);
                            if(countContext.DISTINCT()!=null){
                                //distinct aggregation
                            }
                        }else if(groupByFunctionClauseContext.alone()!=null){
                            ElasticsearchParser.AloneContext aloneContext=groupByFunctionClauseContext.alone();
                            checkGroupByField(aloneContext.field.getText(),groupByFields);
                        }
                    }else{
                        throw new ElasticSql2DslException("only support field or groupByFunction in group by syntax");
                    }
                }
            }
        }
    }


    private void checkGroupByField(String field,List<String> fields){
        if(!fields.contains(field)){
            throw new ElasticSql2DslException("selected field must within group by item");
        }
    }
}
