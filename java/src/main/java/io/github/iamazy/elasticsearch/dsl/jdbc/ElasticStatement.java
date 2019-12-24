package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcResponseExtractor;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;

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

    ElasticStatement(ElasticConnection connection) {
        this.connection = connection;
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        ElasticSql2DslParser elasticSql2DslParser = new ElasticSql2DslParser();
        ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql.replaceFirst("[?]", connection.getDatabaseName()));
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
}
