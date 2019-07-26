package io.github.iamazy.elasticsearch.dsl.sql.model;

import java.util.Objects;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition Represents a location in sql code (name of token + character offset)
 **/
public final class Location {

    private final String sourceName;
    private final int offset;

    public Location(String sourceName,int offset){
        this.sourceName= Objects.requireNonNull(sourceName);
        this.offset=offset;
    }

    public String getSourceName() {
        return sourceName;
    }

    public int getOffset() {
        return offset;
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

    private static final int MAX_NAME_LENGTH=256;

    public static String computeSourceName(String scriptName){
        StringBuilder fileName=new StringBuilder();
        int limit = scriptName.indexOf("\n");
        if (limit>=0){
            int limit2= scriptName.indexOf("\r");
            if(limit2>=0){
                limit=Math.min(limit,limit2);
            }
        }else{
            limit=scriptName.length();
        }
        limit=Math.min(limit,MAX_NAME_LENGTH);
        fileName.append(scriptName,0,limit);
        if(limit!=scriptName.length()){
            fileName.append("...");
        }
        return fileName.toString();
    }
}























