package io.github.iamazy.elasticsearch.dsl.sql;

import java.lang.invoke.MethodType;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public final class Locals {

    public static String buildLocalMethodKey(String methodName,int methodArity){
        return methodName+"/"+methodArity;
    }

    public static class LocalMethod{
        public final String name;
        public final Class<?> returnType;
        public final List<Class<?>> typeParameters;
        public final MethodType methodType;

        public LocalMethod(String name,Class<?> returnType,List<Class<?>> typeParameters,MethodType methodType){
            this.name=name;
            this.returnType=returnType;
            this.typeParameters=typeParameters;
            this.methodType=methodType;
        }
    }
}
