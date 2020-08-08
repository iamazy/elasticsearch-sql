package io.github.iamazy.elasticsearch.dsl.jdbc;

/**
 * @author iamazy
 * @date 2019/12/24
 **/
public enum ClusterMode {

    /**
     * 集群模式
     */
    CLUSTER("cluster"),
    /**
     * 单节点模式
     */
    SINGLE("single"),
    /**
     * 跨集群模式 not support yet
     */
    CROSS_CLUSTER("cross_cluster"),
    ;

    private String name;

    ClusterMode(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
