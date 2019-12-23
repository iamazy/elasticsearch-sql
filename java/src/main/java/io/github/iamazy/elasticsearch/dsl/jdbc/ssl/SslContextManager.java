package io.github.iamazy.elasticsearch.dsl.jdbc.ssl;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * @author iamazy
 * @date 2019/2/15
 * @descrition
 **/
public class SslContextManager {

    public static final TrustManager[] TRUST_ALL_CERTS = new TrustManager[]{
            new X509TrustManager() {
                @Override
                public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                }

                @Override
                public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                }

                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[]{};
                }
            }
    };
}
