package io.github.iamazy.elasticsearch.dsl.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author iamazy
 * @date 2019/12/16
 * @descrition
 **/
public abstract class AbstractDriverBasedDataSource extends AbstractDataSource {

    private String uri;

    private Properties properties;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return getConnectionFromDriver();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return getConnection();
    }

    protected Connection getConnectionFromDriver() throws SQLException {
        if(properties!=null){
            return getConnectionFromDriver(properties);
        }
        return getConnectionFromDriver(new Properties());
    }

    protected abstract Connection getConnectionFromDriver(Properties props) throws SQLException;
}
