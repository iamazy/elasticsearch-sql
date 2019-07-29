package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;

import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class Table extends AExpression {

    private final String indexName;

    private final String alias;

    public Table(Location location, String indexName, String alias){
        super(location);
        this.indexName=indexName;
        this.alias=alias;
    }

    public String indexName() {
        return indexName;
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
