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
public class ABoolExpr extends AExpression {

    private final AExpression leftExpr;

    private final AExpression rightExpr;

    private final Relation relation;

    public ABoolExpr(Location location,ABoolExpr leftExpr,ABoolExpr rightExpr,Relation relation){
        super(location);
        this.leftExpr=leftExpr;
        this.rightExpr=rightExpr;
        this.relation=relation;
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

    public enum Relation{
        And("and"),
        Or("or")
        ;

        private String relation;

        Relation(String relation){
            this.relation=relation;
        }
    }
}
