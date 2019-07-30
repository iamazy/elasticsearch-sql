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
public class Order extends AExpression {

    /**
     * field name
     */
    private final String field;

    /**
     * order type: desc|asc,
     * desc by default
     */
    private final String type;

    public Order(Location location, String field, String type){
        super(location);
        this.field=field;
        this.type=type;
    }

    public String getField() {
        return field;
    }

    public String getType() {
        return type;
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
