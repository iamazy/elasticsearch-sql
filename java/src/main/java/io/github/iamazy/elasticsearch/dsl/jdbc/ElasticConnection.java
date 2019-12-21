package io.github.iamazy.elasticsearch.dsl.jdbc;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestHighLevelClient;

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
public class ElasticConnection extends AbstractConnection{

    private RestHighLevelClient client;

    public ElasticConnection(String url, Properties properties,RestHighLevelClient client){
        super(url,properties);
        this.client=client;
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
        return null;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }
}
