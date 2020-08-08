package io.github.iamazy.elasticsearch.dsl.utils;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/12/14
 **/
@SuppressWarnings({"unchecked", "beta"})
public class FlatMapUtils {

    public static Map<String, Object> flat(Map<String, ?> map, String parentKey) {
        String parent = parentKey == null ? StringUtils.EMPTY : parentKey;
        Map<String, Object> dataInfo = new HashMap<>(map.size());
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (!(entry.getValue() instanceof Map)) {
                if (StringUtils.isNotBlank(parent)) {
                    dataInfo.put(parent + CoreConstants.DOT + entry.getKey(), entry.getValue() != null ? entry.getValue() : StringUtils.EMPTY);
                } else {
                    dataInfo.put(entry.getKey(), entry.getValue() != null ? entry.getValue() : StringUtils.EMPTY);
                }
            } else {
                Map<String, ?> childMap = (Map<String, ?>) entry.getValue();
                if (StringUtils.isNotBlank(parent)) {
                    parent = parent + CoreConstants.DOT + entry.getKey();
                } else {
                    parent = entry.getKey();
                }
                dataInfo.putAll(flat(childMap, parent));
                if (parent.contains(CoreConstants.DOT)) {
                    parent = parent.substring(0, parent.lastIndexOf(CoreConstants.DOT));
                } else {
                    parent = StringUtils.EMPTY;
                }

            }
        }
        return dataInfo;
    }


    public static void flatPut(String key, Object value, Map<String, Object> map) {
        if (key.contains(CoreConstants.DOT)) {
            String firstItem = key.substring(0, key.indexOf(CoreConstants.DOT));
            String restItems = key.substring(key.indexOf(CoreConstants.DOT) + 1);
            if (!map.containsKey(firstItem)) {
                map.put(firstItem, new HashMap<>(0));
            }
            flatPut(restItems, value, (Map<String, Object>) map.get(firstItem));
        } else {
            map.put(key, value);
        }
    }

    public static Object flatGet(String key, Map<String, Object> map) {
        if (key.contains(CoreConstants.DOT)) {
            String firstItem = key.substring(0, key.indexOf(CoreConstants.DOT));
            String restItems = key.substring(key.indexOf(CoreConstants.DOT) + 1);
            if (map.containsKey(firstItem) && map.get(firstItem) instanceof Map) {
                return flatGet(restItems, (Map<String, Object>) map.get(firstItem));
            } else {
                return null;
            }
        } else {
            return map.get(key);
        }
    }
}
