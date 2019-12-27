package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import java.util.List;
import java.util.Map;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class JdbcSearchResponse {

    private long took;
    private long total;
    private int size;
    private Map<String,String> aliasMap;
    private String sql;

    private List<Map<String,Object>> result;

    public long getTook() {
        return took;
    }

    public void setTook(long took) {
        this.took = took;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Map<String,Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String,Object>> result) {
        this.result = result;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<String, String> getAliasMap() {
        return aliasMap;
    }

    public void setAliasMap(Map<String, String> aliasMap) {
        this.aliasMap = aliasMap;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
