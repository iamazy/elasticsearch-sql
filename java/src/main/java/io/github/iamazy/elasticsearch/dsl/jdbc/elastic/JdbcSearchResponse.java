package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import java.util.List;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class JdbcSearchResponse<T> {

    private long took;
    private long total;

    private List<T> result;

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

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
