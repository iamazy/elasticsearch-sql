package io.github.iamazy.elasticsearch.dsl.sql.node;

import io.github.iamazy.elasticsearch.dsl.sql.Globals;
import io.github.iamazy.elasticsearch.dsl.sql.Locals;
import io.github.iamazy.elasticsearch.dsl.sql.MethodWriter;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;

import java.util.*;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition The superclass for all nodes
 **/
public abstract class ANode {

    final Location location;

    ANode(Location location){
        this.location= Objects.requireNonNull(location);
    }

    abstract void extractVariables(Set<String> variables);

    abstract void analyze(Locals locals);

    abstract void write(MethodWriter writer, Globals globals);

    RuntimeException createError(RuntimeException exception){
        return location.createError(exception);
    }

    public abstract String toString();

    protected String singleLineToString(Object ...subs){
        return singleLineToString(subs);
    }

    protected String singleLineToString(Collection<? extends Object> subs){
        return joinWithName(getClass().getSimpleName(),subs,Collections.emptyList());
    }

    protected String singleLineToStringWithOptionArgs(Collection<? extends ANode> arguments,Object... restOfSubs){
        List<Object> subs=new ArrayList<>();
        Collections.addAll(subs,restOfSubs);
        if(!arguments.isEmpty()){
            subs.add(joinWithName("Args",arguments,Collections.emptyList()));
        }
        return singleLineToString(subs);
    }

    protected String multilineToString(Collection<? extends Object> sameLine,Collection<? extends Object> ownLine){
        return joinWithName(getClass().getSimpleName(),sameLine,ownLine);
    }

    protected List<String> pairwiseToString(Collection<? extends Object> lefts,Collection<? extends Object> rights){
        List<String> pairs=new ArrayList<>(Math.max(lefts.size(),rights.size()));
        Iterator<? extends Object> left=lefts.iterator();
        Iterator<? extends Object> right=rights.iterator();
        while (left.hasNext()||right.hasNext()){
            pairs.add(joinWithName("Pair",Arrays.asList(left.hasNext()?left.next():"<uneven>",right.hasNext()?right.next():"<uneven>"),Collections.emptyList()));
        }
        return pairs;
    }

    protected String joinWithName(String name, Collection<? extends Object> sameLine, Collection<? extends Object> ownLine){
        StringBuilder builder=new StringBuilder();
        builder.append('(').append(name);
        for(Object sub:sameLine){
            builder.append(' ').append(sub);
        }
        if(ownLine.size()==1&&sameLine.isEmpty()){
            builder.append(' ').append(ownLine.iterator().next());
        }else{
            for(Object sub:ownLine){
                builder.append("\n  ").append(Objects.toString(sub).replace("\n","\n  "));
            }
        }
        return builder.append(')').toString();
    }
}
