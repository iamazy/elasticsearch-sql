package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticConnection extends AbstractConnection {

    private RestHighLevelClient client;

    private String database;

    ElasticConnection(String url, Properties properties, RestHighLevelClient client) {
        super(url, properties);
        this.client = client;
    }

    RestHighLevelClient getRestClient() {
        return client;
    }

    @Override
    public Statement createStatement() throws SQLException {
        return new ElasticStatement(this);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new ElasticPreparedStatement(this, sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return super.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return super.prepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return new ElasticDatabaseMetaData(this.url);
    }

    String getDatabaseName() {
        if (database == null) {
            String[] items = url.split("/");
            database = items[items.length - 1];
            if (database.contains(CoreConstants.COND)) {
                database = database.split("[?]")[0];
            }
        }
        return database;
    }

    @Override
    public void close() throws SQLException {
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isClosed() {
        return client == null;
    }
}
