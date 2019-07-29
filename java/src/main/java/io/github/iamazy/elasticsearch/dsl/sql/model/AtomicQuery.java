package io.github.iamazy.elasticsearch.dsl.sql.model;


import lombok.Data;
import org.elasticsearch.index.query.QueryBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/29
 * @descrition
 **/
@Data
public class AtomicQuery {

    private Set<String> highlighter=new HashSet<>(0);

    private QueryBuilder queryBuilder;

    private boolean isNestedQuery;

    private List<String> nestedQueryPaths;

    public AtomicQuery(QueryBuilder queryBuilder){
        this.queryBuilder=queryBuilder;
        this.isNestedQuery=false;
    }

    public AtomicQuery(QueryBuilder queryBuilder,List<String> nestedQueryPaths){
        this.queryBuilder=queryBuilder;
        this.isNestedQuery=true;
        this.nestedQueryPaths=nestedQueryPaths;
    }
}
