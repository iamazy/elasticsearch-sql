package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import java.util.List;
import java.util.Map;

/**
 * @author wellCh4n
 * @date 2022/10/21
 */
public class JdbcDescResponse {

    private List<Map<String,Object>> result;

    private int size;


    public List<Map<String, Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String, Object>> result) {
        this.result = result;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
