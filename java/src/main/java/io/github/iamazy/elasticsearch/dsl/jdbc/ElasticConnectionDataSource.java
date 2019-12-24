package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.ElasticClientProvider;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticConnectionDataSource extends DriverManagerDataSource implements ElasticDataSource {

    private final Object connectionMonitor = new Object();
    private boolean suppressClose;
    private Connection target;
    private Connection connection;
    private RestHighLevelClient restHighLevelClient;
    private ElasticClientProvider elasticClientProvider;

    public ElasticConnectionDataSource() {
    }

    public ElasticConnectionDataSource(String url, boolean suppressClose) {
        super(url);
        this.suppressClose = suppressClose;
    }

    public void setElasticClientProvider(ElasticClientProvider elasticClientProvider) {
        this.elasticClientProvider = elasticClientProvider;
    }

    public boolean isSuppressClose() {
        return suppressClose;
    }

    public void setSuppressClose(boolean suppressClose) {
        this.suppressClose = suppressClose;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        synchronized (this.connectionMonitor) {
            if (this.connection == null) {
                initConnection(username,password);
            }
            if (connection.isClosed()) {
                throw new SQLException(
                        "Connection was closed in ElasticSingleConnectionDataSource. Check that user code checks " +
                                "shouldClose() before closing Connections, or set 'suppressClose' to 'true'");
            }
            return this.connection;
        }
    }

    @Override
    public boolean shouldClose(Connection connection) {
        synchronized (connectionMonitor) {
            return connection != this.connection && connection != this.target;
        }
    }

    public void destroy() {
        synchronized (connectionMonitor) {
            closeConnection();
        }
    }

    public void initConnection(String username,String password) throws SQLException {
        if (getUrl() == null) {
            throw new IllegalStateException("'url' property is required for lazily initializing a Connection");
        }
        synchronized (connectionMonitor) {
            closeConnection();
        }
        try {
            if (elasticClientProvider != null) {
                restHighLevelClient = elasticClientProvider.fromUrl(getUrl(),username,password);
                if (restHighLevelClient == null) {
                    throw new SQLException(String.format("Failed to build elastic client for url[%s]", getUrl()));
                }
                target = new ElasticConnection(getUrl(), null, restHighLevelClient);
            } else {
                this.target = getConnectionFromDriver();
            }
        } catch (Exception e) {
            throw new SQLException(String.format("Failed to create connection for url[%s]", getUrl()), e);
        }
        prepareConnection(target);
        this.connection = isSuppressClose() ? getCloseSuppressingConnectionProxy(target) : target;
    }

    public void resetConnection() {
        synchronized (connectionMonitor) {
            closeConnection();
            this.target = null;
            this.connection = null;
        }
    }

    protected void prepareConnection(Connection connection) throws SQLException {
        Boolean autoCommit = getAutoCommitValue();
        if (autoCommit != null && connection.getAutoCommit() != autoCommit) {
            connection.setAutoCommit(autoCommit);
        }
    }

    private void closeConnection() {
        if (target != null) {
            try {
                target.close();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        if (restHighLevelClient != null) {
            try {
                restHighLevelClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected Connection getCloseSuppressingConnectionProxy(Connection target) {
        return (Connection) Proxy.newProxyInstance(ConnectionProxy.class.getClassLoader(),
                new Class[]{ConnectionProxy.class},
                new CloseSuppressingInvocationHandler(target));
    }

    protected Boolean getAutoCommitValue() {
        return Boolean.FALSE;
    }

    public void setAutoCommit(boolean autoCommit) {
        //ignore
    }

    private static class CloseSuppressingInvocationHandler implements InvocationHandler {

        private final Connection target;

        public CloseSuppressingInvocationHandler(Connection target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            switch (method.getName()) {
                case "equals": {
                    return proxy == args[0];
                }
                case "hashCode": {
                    return System.identityHashCode(proxy);
                }
                case "unwrap": {
                    if (((Class) args[0]).isInstance(proxy)) {
                        return proxy;
                    }
                }
                case "isWrapperFor": {
                    if (((Class) args[0]).isInstance(proxy)) {
                        return true;
                    }
                }
                case "close": {
                    return null;
                }
                case "isClosed": {
                    return false;
                }
                case "getTargetConnection": {
                    return this.target;
                }
                default: {
                    return method.invoke(target, args);
                }
            }
        }
    }
}
