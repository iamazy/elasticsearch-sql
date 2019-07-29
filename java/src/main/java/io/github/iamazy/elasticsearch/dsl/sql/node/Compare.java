package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.Operation;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;

import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/28
 * @descrition
 **/
public class Compare extends AExpression {

    private final AExpression leftExpr;

    private final AExpression rightExpr;

    private final Operation operation;

    public Compare(Location location,AExpression leftExpr,AExpression rightExpr,Operation operation){
        super(location);
        this.leftExpr=leftExpr;
        this.rightExpr=rightExpr;
        this.operation=operation;
    }

    @Override
    void extractVariables(Set<String> variables) {

    }

    @Override
    void analyze(Locals locals) {

    }

    @Override
    void write(MethodWriter writer, Globals globals) {

    }

    @Override
    public String toString() {
        return null;
    }


}
