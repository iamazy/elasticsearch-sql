package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

/**
 * @author iamazy
 * @date 2019/12/26
 * @descrition
 **/
public final class JdbcScrollSearchResponse extends JdbcSearchResponse {

    private String scrollId;

    JdbcScrollSearchResponse(JdbcSearchResponse response, String scrollId) {
        this.scrollId = scrollId;
        setResult(response.getResult());
        setSize(response.getSize());
        setTook(response.getTook());
        setTotal(response.getTotal());
        setAliasMap(response.getAliasMap());
    }

    public String getScrollId() {
        return scrollId;
    }
}
