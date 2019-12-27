package io.github.iamazy.elasticsearch.dsl.sql.model;

import com.google.common.collect.Lists;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlBoolOperator;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlConditionType;

import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/

public class SqlCondition {

    private SqlConditionType conditionType;
    private SqlBoolOperator operator;
    private List<AtomicQuery> queryList;

    public SqlCondition(AtomicQuery query){
        this(query,SqlConditionType.Atomic);
    }

    public SqlCondition(List<AtomicQuery> queryList,SqlBoolOperator operator){
        this.queryList=queryList;
        this.conditionType=SqlConditionType.Combine;
        this.operator=operator;
    }

    public SqlCondition(AtomicQuery query,SqlConditionType conditionType){
        this.queryList= Lists.newArrayList(query);
        this.conditionType=conditionType;
    }

    public List<AtomicQuery> getQueryList() {
        return queryList;
    }

    public SqlBoolOperator getOperator() {
        return operator;
    }

    public SqlConditionType getConditionType() {
        return conditionType;
    }
}
