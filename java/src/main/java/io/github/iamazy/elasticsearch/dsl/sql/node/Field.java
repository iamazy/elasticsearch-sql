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
public class Field extends ANode {

    private final boolean exclude;

    private final String fieldName;

    private final boolean highlight;

    private final String alias;

    public Field(Location location, String fieldName, String alias, boolean exclude,boolean highlight){
        super(location);
        this.exclude=exclude;
        this.highlight=this.exclude!=false?false:highlight;
        this.fieldName=fieldName;
        this.alias=alias;
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
