package io.github.iamazy.elasticsearch.dsl.jdbc.statement;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.ElasticConnection;
import io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcResponseExtractor;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcSearchResponse;
import io.github.iamazy.elasticsearch.dsl.jdbc.result.ElasticResultSet;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.enums.SqlOperation;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.index.reindex.BulkByScrollResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticStatement extends AbstractStatement {

    protected ElasticConnection connection;
    private ResultSet resultSet;
    private ElasticSql2DslParser elasticSql2DslParser;

    public ElasticStatement(ElasticConnection connection) {
        this.connection = connection;
        this.elasticSql2DslParser = new ElasticSql2DslParser();
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql);
        checkDatabase(parseResult.getIndices());
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

    public ResultSet executeScrollQuery(String sql, String scrollId) throws SQLException, IOException {
        JdbcResponseExtractor jdbcResponseExtractor = new JdbcResponseExtractor();
        SearchResponse searchResponse;
        if (StringUtils.isBlank(scrollId)) {
            ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql);
            checkDatabase(parseResult.getIndices());
            assert parseResult.getSqlOperation() == SqlOperation.SELECT;
            parseResult.toRequest().scroll(JdbcConstants.SCROLL);
            parseResult.toRequest().source().size(JdbcConstants.DEFAULT_SCROLL_SIZE);
            searchResponse = connection.getRestClient().search(parseResult.toRequest(), RequestOptions.DEFAULT);
        } else {
            SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
            scrollRequest.scroll(JdbcConstants.SCROLL);
            searchResponse = connection.getRestClient().scroll(scrollRequest, RequestOptions.DEFAULT);
        }
        JdbcSearchResponse jdbcSearchResponse = jdbcResponseExtractor.parseScrollSearchResponse(searchResponse);
        if(StringUtils.isBlank(jdbcSearchResponse.getSql())){
            jdbcSearchResponse.setSql(sql);
        }
        this.resultSet = new ElasticResultSet(this, jdbcSearchResponse);
        return resultSet;
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return executeUpdate(sql);
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        ElasticSqlParseResult parseResult = elasticSql2DslParser.parse(sql);
        checkDatabase(parseResult.getIndices());
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
                    return (int) response.getUpdated();
                }
                case DELETE: {
                    connection.getRestClient().delete(parseResult.getDeleteRequest(), RequestOptions.DEFAULT);
                    return 1;
                }
                case DELETE_BY_QUERY: {
                    BulkByScrollResponse response = connection.getRestClient().deleteByQuery(parseResult.getDeleteByQueryRequest(), RequestOptions.DEFAULT);
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
        sql = prepareExecute(sql, args);
        return executeQuery(sql);
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }

    @Override
    public boolean isClosed() {
        return connection.isClosed();
    }

    String prepareExecute(String sql, Object[] args) {
        int count = StringUtils.countMatches(sql, CoreConstants.COND);
        assert count == args.length;
        for (Object item : args) {
            sql = sql.replaceFirst("\\?", item.toString());
        }
        return sql;
    }

    private void checkDatabase(List<String> indices) throws SQLException {
        if (!connection.getDatabaseNames().containsAll(indices)) {
            throw new SQLException("[invalid] database queried must be contained in " + connection.getDatabaseNames());
        }
    }
}
