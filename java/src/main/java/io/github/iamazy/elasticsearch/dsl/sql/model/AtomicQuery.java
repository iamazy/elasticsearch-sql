package io.github.iamazy.elasticsearch.dsl.sql.model;



import org.elasticsearch.index.query.QueryBuilder;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
public class AtomicQuery {

    private Set<String> highlighter=new HashSet<>(0);

    private QueryBuilder queryBuilder;

    public QueryBuilder getQueryBuilder() {
        return queryBuilder;
    }

    public Set<String> getHighlighter() {
        return highlighter;
    }

    public AtomicQuery(QueryBuilder queryBuilder){
        this.queryBuilder=queryBuilder;
    }
}
