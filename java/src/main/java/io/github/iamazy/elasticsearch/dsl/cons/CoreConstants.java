package io.github.iamazy.elasticsearch.dsl.cons;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.codecs.ObjectIdGenerator;

/**
 * @author iamazy
 * @date 2019/3/25
 **/
public interface CoreConstants {

    ObjectMapper OBJECT_MAPPER=new ObjectMapper();
    ObjectIdGenerator OBJECT_ID_GENERATOR=new ObjectIdGenerator();

    String COMMA = ",";
    String COLON = ":";
    String DOLLAR = "$";
    String DOT=".";
    String GRAVE_ACCENT="`";
    String UP_ARROW="^";
    String POUND="#";
    String HIGHLIGHTER="h#";
    String DEFAULT_ES_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
}
