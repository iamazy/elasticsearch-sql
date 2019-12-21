package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public interface ElasticClientProvider {

    /**
     * create client from url
     * @param url
     * @return
     */
    RestHighLevelClient fromUrl(String url);
}
