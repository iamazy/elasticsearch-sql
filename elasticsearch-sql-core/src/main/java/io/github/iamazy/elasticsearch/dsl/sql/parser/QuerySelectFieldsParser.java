package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import io.github.iamazy.elasticsearch.dsl.sql.parser.aggs.GroupByQueryParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.collect.Tuple;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.collapse.CollapseBuilder;

import java.util.*;
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
                parseNotGroupByClause(dslContext);
            } else {
                ElasticsearchParser.GroupByClauseContext groupByClauseContext = dslContext.getSqlContext().selectOperation().groupByClause();
                parseGroupByClause(groupByClauseContext, dslContext);
            }
        }
    }

    private void parseNotGroupByClause(ElasticDslContext dslContext) {
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
                        ElasticsearchParser.FieldNameContext fieldNameContext = (ElasticsearchParser.FieldNameContext) fieldName.fieldName;
                        //highlighter
                        if (fieldNameContext.highlighter != null) {
                            dslContext.getParseResult().getHighlighter().add(fieldNameContext.field.getText());
                        }
                        //add aliases map
                        if (fieldName.alias != null) {
                            dslContext.getParseResult().getAliasMap().put(fieldName.alias.getText(), fieldName.fieldName.getText());
                        }
                        includeFields.add(fieldNameContext.field.getText());
                    } else if (fieldName.fieldName instanceof ElasticsearchParser.DistinctNameContext) {
                        ElasticsearchParser.DistinctNameContext distinctNameContext = (ElasticsearchParser.DistinctNameContext) fieldName.fieldName;
                        String distinctName = distinctNameContext.fieldName.getText();
                        if (distinctNameContext.fieldName instanceof ElasticsearchParser.FieldNameContext) {
                            ElasticsearchParser.FieldNameContext fieldNameContext = (ElasticsearchParser.FieldNameContext) distinctNameContext.fieldName;
                            if (fieldNameContext.highlighter != null) {
                                distinctName = fieldNameContext.field.getText();
                                dslContext.getParseResult().getHighlighter().add(distinctName);
                            }
                        }
                        if (StringUtils.isNotBlank(dslContext.getParseResult().getDistinctName())) {
                            dslContext.getParseResult().setDistinctName(distinctName);
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

    private void parseGroupByClause(ElasticsearchParser.GroupByClauseContext groupByClauseContext, ElasticDslContext dslContext) {
        //only return aggregation data and not care about whether fields are included,excluded or highlighted
        dslContext.getParseResult().setSize(0);
        List<String> groupByFields = groupByClauseContext.ID().stream().map(TerminalNode::getText).collect(Collectors.toList());
        ElasticsearchParser.FieldListContext fieldListContext = dslContext.getSqlContext().selectOperation().fieldList();
        GroupByQueryParser groupByQueryParser = new GroupByQueryParser();
        Map<Integer, Set<AggregationBuilder>> aggregationMap = new HashMap<>(0);
        for (ElasticsearchParser.NameOperandContext nameOperandContext : fieldListContext.nameOperand()) {
            if (nameOperandContext.fieldName instanceof ElasticsearchParser.FieldNameContext) {
                ElasticsearchParser.FieldNameContext fieldNameContext = (ElasticsearchParser.FieldNameContext) nameOperandContext.fieldName;
                //check whether field is valid
                checkGroupByField(fieldNameContext.field.getText(), groupByFields);
                //there is no need to build aggregation builder, because it's has been built.
            }  else if (nameOperandContext.fieldName instanceof ElasticsearchParser.FunctionNameContext) {
                ElasticsearchParser.FunctionNameContext functionNameContext = (ElasticsearchParser.FunctionNameContext) nameOperandContext.fieldName;
                //only support one params groupBy function at the moment
                String field = functionNameContext.params.identity(0).ID().getText();
                checkGroupByField(field, groupByFields);
                int idx = groupByFields.indexOf(field);
                //insert subAggregation
                if (aggregationMap.containsKey(idx)) {
                    aggregationMap.get(idx).add(groupByQueryParser.parse(functionNameContext.functionName.getText(), field));
                } else {
                    Set<AggregationBuilder> aggregationSet = new HashSet<>(0);
                    aggregationSet.add(groupByQueryParser.parse(functionNameContext.functionName.getText(), field));
                    aggregationMap.put(idx, aggregationSet);
                }

            } else {
                throw new ElasticSql2DslException("only support field or groupBy function in groupBy syntax");
            }
            if(nameOperandContext.alias!=null){
                dslContext.getParseResult().getAliasMap().put(nameOperandContext.alias.getText(),nameOperandContext.fieldName.getText());
            }
        }
        if (groupByFields.size() > 0) {
            AggregationBuilder aggregationBuilder = null;
            List<AggregationBuilder> aggregationBuilders = new ArrayList<>(0);
            for (int i = groupByFields.size() - 1; i >= 0; i--) {
                String field = groupByFields.get(i);
                if (aggregationBuilder == null) {
                    aggregationBuilder = AggregationBuilders.terms("terms_" + field).field(field).size(5000);
                    aggregationBuilders.add(aggregationBuilder);
                    if (aggregationMap.containsKey(i)) {
                        aggregationBuilders.addAll(aggregationMap.get(i));
                    }
                }else{
                    aggregationBuilder = AggregationBuilders.terms("terms_" + field).field(field).size(5000);
                    for(AggregationBuilder aggregation:aggregationBuilders){
                        aggregationBuilder.subAggregation(aggregation);
                    }
                    aggregationBuilders.clear();
                    if(aggregationMap.containsKey(i)){
                        aggregationBuilders.addAll(aggregationMap.get(i));
                    }
                    aggregationBuilders.add(aggregationBuilder);
                }
            }
            dslContext.getParseResult().getGroupBy().addAll(aggregationBuilders);
        }
    }


    private void checkGroupByField(String field, List<String> fields) {
        if (!fields.contains(field)) {
            throw new ElasticSql2DslException("selected field must be contained by groupBy fields");
        }
    }
}
