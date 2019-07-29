package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.join.query.JoinQueryBuilders;
import org.elasticsearch.join.query.ParentIdQueryBuilder;

import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/28
 * @descrition
 **/
public class ParentId extends AExpression {

    private final String type;

    private final String id;

    public ParentId(Location location,String type,String id){
        super(location);
        this.type=type;
        this.id=id;
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
