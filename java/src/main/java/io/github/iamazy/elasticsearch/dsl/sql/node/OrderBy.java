package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;

import java.util.List;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition
 **/
public class OrderBy extends AExpression {


    private final List<Order> orderList;

    public OrderBy(Location location, List<Order> orderList){
        super(location);
        this.orderList=orderList;
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
