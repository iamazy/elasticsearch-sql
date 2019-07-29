package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;


import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition
 **/
public class HasChild extends AExpression {

    private final String type;

    private final AExpression expr;

    public HasChild(Location location, String type, AExpression expr){
        super(location);
        this.type=type;
        this.expr=expr;
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
