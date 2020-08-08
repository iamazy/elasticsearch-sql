package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import com.google.common.collect.Maps;
import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.ClusterMode;
import io.github.iamazy.elasticsearch.dsl.jdbc.exception.InvalidUrlException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.HttpAsyncResponseConsumerFactory;
import org.elasticsearch.client.NodeSelector;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.sniff.ElasticsearchNodesSniffer;
import org.elasticsearch.client.sniff.NodesSniffer;
import org.elasticsearch.client.sniff.SniffOnFailureListener;
import org.elasticsearch.client.sniff.Sniffer;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;


import static io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants.DEFAULT_IP;
import static io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants.DEFAULT_PORT;
import static io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants.ELASTIC_DRIVER_PREFIX;
import static io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants.IP_PORT_PATTERN;
import static io.github.iamazy.elasticsearch.dsl.jdbc.ssl.SslContextManager.TRUST_ALL_CERTS;

/**
 * @author iamazy
 * @date 2019/12/21
 **/
public class ElasticClientManager implements ElasticClientProvider {

    private final Map<String, RestHighLevelClient> clientProxyMap = Maps.newHashMap();

    @Override
    public RestHighLevelClient fromUrl(String url, String username, String password) {
        if (clientProxyMap.containsKey(url)) {
            return clientProxyMap.get(url);
        }
        Map<String, Object> params = parseUrlParams(url);
        boolean useSsl = Boolean.parseBoolean(params.getOrDefault("useSSL", false).toString());
        String mode = params.getOrDefault("mode", "single").toString();
        Matcher matcher = IP_PORT_PATTERN.matcher(url);
        List<HttpHost> httpHosts = new ArrayList<>(0);
        while (matcher.find()) {
            String ip = matcher.group(1) == null ? DEFAULT_IP : matcher.group(1);
            int port = matcher.group(2) == null ? DEFAULT_PORT : Integer.parseInt(matcher.group(2));
            httpHosts.add(new HttpHost(ip, port, useSsl ? "https" : "http"));
        }
        String token = username + ":" + password;
        clientProxyMap.put(url, initClient(httpHosts, useSsl, parseClusterMode(mode), token));
        return clientProxyMap.get(url);
    }

    private RestHighLevelClient initClient(List<HttpHost> httpHosts, boolean useSsl, ClusterMode mode, String token) {
        RestHighLevelClient restHighLevelClient;
        RestClientBuilder restClientBuilder = RestClient.builder(httpHosts.toArray(new HttpHost[0]))
                .setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS)
                .setRequestConfigCallback(builder -> builder.setConnectTimeout(50000)
                        .setSocketTimeout(600000));
        if (useSsl) {
            restClientBuilder
                    .setHttpClientConfigCallback(httpAsyncClientBuilder -> {
                        httpAsyncClientBuilder.setSSLHostnameVerifier((s, sslSession) -> true);
                        SSLContext sslContext;
                        try {
                            sslContext = SSLContext.getInstance("TLS");
                            sslContext.init(null, TRUST_ALL_CERTS, new java.security.SecureRandom());
                        } catch (NoSuchAlgorithmException | KeyManagementException e) {
                            throw new RuntimeException(e.getMessage());
                        }
                        httpAsyncClientBuilder.setSSLContext(sslContext);
                        String basicToken = Base64.getEncoder().encodeToString(token.getBytes());
                        httpAsyncClientBuilder.setDefaultHeaders(Collections.singletonList(new BasicHeader("Authorization", "Basic " + basicToken)));
                        return httpAsyncClientBuilder;
                    });
        }
        if (ClusterMode.CLUSTER.equals(mode)) {
            SniffOnFailureListener sniffOnFailureListener = new SniffOnFailureListener();
            restClientBuilder.setFailureListener(sniffOnFailureListener);
            restHighLevelClient = new RestHighLevelClient(restClientBuilder);
            NodesSniffer nodesSniffer = new ElasticsearchNodesSniffer(restHighLevelClient.getLowLevelClient(),
                    ElasticsearchNodesSniffer.DEFAULT_SNIFF_REQUEST_TIMEOUT,
                    useSsl ? ElasticsearchNodesSniffer.Scheme.HTTPS : ElasticsearchNodesSniffer.Scheme.HTTP);
            Sniffer sniffer = Sniffer.builder(restHighLevelClient.getLowLevelClient()).setSniffIntervalMillis(5000).setNodesSniffer(nodesSniffer).build();
            sniffOnFailureListener.setSniffer(sniffer);
        } else {
            restHighLevelClient = new RestHighLevelClient(restClientBuilder);
        }
        return restHighLevelClient;
    }

    private ClusterMode parseClusterMode(String mode) {
        switch (mode) {
            case "cluster": {
                return ClusterMode.CLUSTER;
            }
            case "cross_cluster": {
                return ClusterMode.CROSS_CLUSTER;
            }
            default: {
                return ClusterMode.SINGLE;
            }
        }
    }

    public static RequestOptions requestOptions(String token) {
        HttpAsyncResponseConsumerFactory responseConsumerFactory = new HttpAsyncResponseConsumerFactory
                .HeapBufferedResponseConsumerFactory(Integer.MAX_VALUE);
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        builder.setHttpAsyncResponseConsumerFactory(responseConsumerFactory);
        builder.addHeader("Authorization", "Basic " + token);
        return builder.build();
    }

    private Map<String, Object> parseUrlParams(String url) {
        if (!StringUtils.startsWithIgnoreCase(url, ELASTIC_DRIVER_PREFIX)) {
            throw new InvalidUrlException("[" + url + "] is an invalid elasticsearch jdbc url");
        }
        if (url.contains(CoreConstants.COND)) {
            Map<String, Object> params = new HashMap<>(0);
            try {
                String[] items = url.substring(url.indexOf('?') + 1).split("[&]");
                for (String item : items) {
                    String[] split = item.split("[=]");
                    params.put(split[0], split[1]);
                }
            } catch (Exception e) {
                throw new InvalidUrlException(e.getMessage());
            }
            return params;
        } else {
            return Collections.emptyMap();
        }
    }
}
