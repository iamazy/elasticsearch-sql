package io.github.iamazy.elasticsearch.dsl.cons;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author iamazy
 * @date 2019/3/25
 **/
public interface CoreConstants {

    ObjectMapper OBJECT_MAPPER=new ObjectMapper();


    String COMMA = ",";
    String COLON = ":";
    String DOLLAR = "$";
    String MODULE = "%";
    String STAR = "*";
    String UNDERLINE = "_";
    String COND = "?";
    String DOT=".";
    String GRAVE_ACCENT="`";
    String UP_ARROW="^";
    String POUND="#";
    String DEFAULT_ES_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    String UNDERLINE_ID = "_id";
}
