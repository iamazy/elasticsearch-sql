package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcResponseExtractor;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.index.reindex.BulkByScrollResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticStatement extends AbstractStatement {

    protected ElasticConnection connection;
    private ResultSet resultSet;
    private ElasticSql2DslParser elasticSql2DslParser;

    ElasticStatement(ElasticConnection connection) {
        this.connection = connection;
        this.elasticSql2DslParser = new ElasticSql2DslParser();
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql.replaceFirst("\\{}", connection.getDatabaseName()));
        assert parseResult.getSqlOperation() == SqlOperation.SELECT;
        try {
            SearchResponse searchResponse = connection.getRestClient().search(parseResult.toRequest(), RequestOptions.DEFAULT);
            JdbcResponseExtractor jdbcResponseExtractor = new JdbcResponseExtractor();
            this.resultSet = new ElasticResultSet(this, jdbcResponseExtractor.parseSearchResponse(searchResponse));
            return resultSet;
        } catch (IOException e) {
            throw new SQLException(e.getMessage());
        }
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeUpdate(sql, columnNames);
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql.replaceFirst("\\{}", connection.getDatabaseName()));
        try {
            switch (parseResult.getSqlOperation()) {
                case INSERT: {
                    connection.getRestClient().index(parseResult.getIndexRequest(), RequestOptions.DEFAULT);
                    return 1;
                }
                case UPDATE: {
                    connection.getRestClient().update(parseResult.getUpdateRequest(), RequestOptions.DEFAULT);
                    return 1;
                }
                case UPDATE_BY_QUERY: {
                    BulkByScrollResponse response = connection.getRestClient().updateByQuery(parseResult.getUpdateByQueryRequest(), RequestOptions.DEFAULT);
                    setQueryTimeout((int) response.getTook().getSeconds());
                    return (int) response.getUpdated();
                }
                case DELETE: {
                    connection.getRestClient().delete(parseResult.getDeleteRequest(), RequestOptions.DEFAULT);
                    return 1;
                }
                case DELETE_BY_QUERY: {
                    BulkByScrollResponse response = connection.getRestClient().deleteByQuery(parseResult.getDeleteByQueryRequest(), RequestOptions.DEFAULT);
                    setQueryTimeout((int) response.getTook().getSeconds());
                    return (int) response.getDeleted();
                }
                default: {
                    throw new SQLException("only support [insert,update,delete] operation");
                }
            }
        } catch (IOException e) {
            throw new SQLException(e.getMessage());
        }

    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return super.execute(sql, columnNames);
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        executeQuery(sql);
        return true;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return resultSet;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return connection;
    }

    @Override
    protected ResultSet executeQuery(String sql, Object[] args) throws SQLException {
        return executeQuery(sql);
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return super.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        super.setQueryTimeout(seconds);
    }
}
