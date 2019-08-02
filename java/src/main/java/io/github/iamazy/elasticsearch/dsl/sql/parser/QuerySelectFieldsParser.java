package io.github.iamazy.elasticsearch.dsl.sql.parser;

import io.github.iamazy.elasticsearch.dsl.antlr4.ElasticsearchParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticDslContext;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/30
 * @descrition sql operation must be selection
 **/
public class QuerySelectFieldsParser implements QueryParser{

    @Override
    public void parse(ElasticDslContext dslContext) {

        List<String> includeFields=new ArrayList<>(0);
        List<String> excludeFields=new ArrayList<>(0);
        ElasticsearchParser.SelectOperationContext selectOperationContext=dslContext.getSqlContext().selectOperation();
        ElasticsearchParser.FieldListContext fieldListContext = selectOperationContext.fieldList();
        if(fieldListContext.nameOperand()!=null){
            for(ElasticsearchParser.NameOperandContext fieldName:fieldListContext.nameOperand()){
                if(fieldName.exclude!=null){
                    if(fieldName.fieldName instanceof ElasticsearchParser.FieldNameContext){
                        excludeFields.add(((ElasticsearchParser.FieldNameContext) fieldName.fieldName).field.getText());
                    }else {
                        excludeFields.add(fieldName.fieldName.getText());
                    }
                }else{
                    if(fieldName.fieldName instanceof ElasticsearchParser.FieldNameContext){
                        includeFields.add(((ElasticsearchParser.FieldNameContext) fieldName.fieldName).field.getText());
                    }else {
                        includeFields.add(fieldName.fieldName.getText());
                    }
                }
            }
        }
        if(CollectionUtils.isNotEmpty(includeFields)){
            dslContext.getParseResult().getIncludeFields().addAll(includeFields);
        }
        if(CollectionUtils.isNotEmpty(excludeFields)){
            dslContext.getParseResult().getExcludeFields().addAll(excludeFields);
        }
    }
}
