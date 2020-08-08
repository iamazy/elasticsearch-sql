package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.ElasticClientManager;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.ElasticClientProvider;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.client.RestHighLevelClient;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author iamazy
 * @date 2019/12/21
 **/
public class ElasticDriver implements Driver {

    static {
        try {
            DriverManager.registerDriver(new ElasticDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private RestHighLevelClient restHighLevelClient;
    private ElasticClientProvider elasticClientProvider;

    private ElasticDriver() {
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        synchronized (ElasticDriver.class) {
            if (restHighLevelClient != null) {
                return new ElasticConnection(url, info, restHighLevelClient);
            }
            if (elasticClientProvider == null) {
                elasticClientProvider = new ElasticClientManager();
            }
            String username=info.getOrDefault("user","").toString();
            String password=info.getOrDefault("password","").toString();
            restHighLevelClient = elasticClientProvider.fromUrl(url,username,password);
            if (restHighLevelClient == null) {
                throw new SQLException(String.format("Failed to create elastic client for url[%s]", url));
            }
        }
        return new ElasticConnection(url, info, restHighLevelClient);
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return url != null
                && (StringUtils.startsWithIgnoreCase(url, JdbcConstants.ELASTIC_DRIVER_PREFIX));
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 1;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return true;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new UnsupportedOperationException("getParentLogger");
    }
}
