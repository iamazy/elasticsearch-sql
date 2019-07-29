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
public class RoutingBy extends AExpression {


    private final List<String> routings;

    public RoutingBy(Location location, List<String> routings){
        super(location);
        this.routings=routings;
    }

    public List<String> getRoutings() {
        return routings;
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
