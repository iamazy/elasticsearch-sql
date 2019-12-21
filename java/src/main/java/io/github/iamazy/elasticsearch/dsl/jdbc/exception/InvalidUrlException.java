package io.github.iamazy.elasticsearch.dsl.jdbc.exception;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class InvalidUrlException extends RuntimeException {

    public InvalidUrlException(String message){
        super(message);
    }

    public InvalidUrlException(String message,Throwable cause){
        super(message,cause);
    }
}
