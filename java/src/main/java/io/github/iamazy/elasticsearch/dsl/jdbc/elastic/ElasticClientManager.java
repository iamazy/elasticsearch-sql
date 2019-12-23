package io.github.iamazy.elasticsearch.dsl.jdbc.elastic;

import com.google.common.collect.Maps;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.exception.InvalidUrlException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.*;
import org.elasticsearch.client.sniff.ElasticsearchNodesSniffer;
import org.elasticsearch.client.sniff.NodesSniffer;
import org.elasticsearch.client.sniff.SniffOnFailureListener;
import org.elasticsearch.client.sniff.Sniffer;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;

import static io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants.*;
import static io.github.iamazy.elasticsearch.dsl.jdbc.ssl.SslContextManager.TRUST_ALL_CERTS;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticClientManager implements ElasticClientProvider {

    private final Map<String, RestHighLevelClient> clientProxyMap = Maps.newHashMap();

    @Override
    public RestHighLevelClient fromUrl(String url) {
        if (clientProxyMap.containsKey(url)) {
            return clientProxyMap.get(url);
        }
        Map<String, Object> params = parseUrlParams(url);
        boolean useSsl = Boolean.parseBoolean(params.getOrDefault("useSSL", false).toString());
        Matcher matcher = IP_PORT_PATTERN.matcher(url);
        List<HttpHost> httpHosts = new ArrayList<>(0);
        while (matcher.find()) {
            String ip = matcher.group(1) == null ? DEFAULT_IP : matcher.group(1);
            int port = matcher.group(2) == null ? DEFAULT_PORT : Integer.parseInt(matcher.group(2));
            httpHosts.add(new HttpHost(ip, port, useSsl ? "https" : "http"));
        }
        String basicToken = null;
        Matcher tokenMatcher = USERNAME_PASSWORD_PATTERN.matcher(url);
        while (tokenMatcher.find()) {
            basicToken = Base64.getEncoder().encodeToString((tokenMatcher.group(1) + ":" + tokenMatcher.group(2)).getBytes());
        }
        clientProxyMap.put(url, initClient(httpHosts, useSsl, basicToken));
        return clientProxyMap.get(url);
    }

    private RestHighLevelClient initClient(List<HttpHost> httpHosts, boolean useSsl, String basicToken) {
        SniffOnFailureListener sniffOnFailureListener = new SniffOnFailureListener();
        Sniffer sniffer;
        RestHighLevelClient restHighLevelClient;
        NodesSniffer nodesSniffer;
        RestClientBuilder restClientBuilder = RestClient.builder(httpHosts.toArray(new HttpHost[0]))
                .setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS)
                .setFailureListener(sniffOnFailureListener)
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
                        httpAsyncClientBuilder.setDefaultHeaders(Collections.singletonList(new BasicHeader("Authorization", "Basic " + basicToken)));
                        return httpAsyncClientBuilder;
                    });
        }
        restHighLevelClient = new RestHighLevelClient(restClientBuilder);
        nodesSniffer = new ElasticsearchNodesSniffer(restHighLevelClient.getLowLevelClient(),
                ElasticsearchNodesSniffer.DEFAULT_SNIFF_REQUEST_TIMEOUT,
                useSsl ? ElasticsearchNodesSniffer.Scheme.HTTPS : ElasticsearchNodesSniffer.Scheme.HTTP);
        sniffer = Sniffer.builder(restHighLevelClient.getLowLevelClient()).setSniffIntervalMillis(5000).setNodesSniffer(nodesSniffer).build();
        sniffOnFailureListener.setSniffer(sniffer);
        return restHighLevelClient;
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
