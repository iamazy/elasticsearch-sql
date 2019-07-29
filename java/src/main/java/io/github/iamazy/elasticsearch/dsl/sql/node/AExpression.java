package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.model.Location;

import java.util.Objects;

/**
 * @author iamazy
 * @date 2019/7/27
 * @descrition
 **/
public abstract class AExpression extends ANode {

    AExpression prefix;

    boolean read=true;

    boolean statement=false;

    Class<?> expected=null;

    Class<?> actual=null;

    boolean explicit=false;

    boolean internal=false;

    Object constant=null;

    boolean isNull =false;

    AExpression(Location location){
        super(location);
        prefix=null;
    }

    AExpression(Location location,AExpression prefix){
        super(location);
        this.prefix= Objects.requireNonNull(prefix);
    }

}
