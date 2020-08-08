package io.github.iamazy.elasticsearch.dsl.sql.model;

import java.util.Objects;

/**
 * @author iamazy
 * @date 2019/7/26
 **/
public final class Location {

    private final String sourceName;
    private final int offset;

    /**
     * Create a new Location
     * @param sourceName script's name
     * @param offset Character offset of script element
     */
    public Location(String sourceName,int offset){
        this.sourceName= Objects.requireNonNull(sourceName);
        this.offset=offset;
    }

    public RuntimeException createError(RuntimeException exception){
        StackTraceElement element=new StackTraceElement(WriterConstants.CLASS_NAME,"compile",sourceName,offset+1);
        StackTraceElement[] oldStack=exception.getStackTrace();
        StackTraceElement[] newStack=new StackTraceElement[oldStack.length+1];
        System.arraycopy(oldStack,0,newStack,1,oldStack.length);
        newStack[0]=element;
        exception.setStackTrace(newStack);
        assert exception.getStackTrace().length==newStack.length:"non-writeable stacktrace for exception: "+exception.getClass();
        return exception;
    }
}























