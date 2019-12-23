package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcSearchResponse;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticResultSet extends AbstractResultSet {

    public static final ElasticResultSetMetaData RESULT_SET_META_DATA = new ElasticResultSetMetaData();

    private JdbcSearchResponse response;

    private int rowCursor = -1;

    public ElasticResultSet(Statement statement, JdbcSearchResponse response) {
        super(statement);
        this.response = response;
    }

    @Override
    public boolean next() throws SQLException {
        rowCursor++;
        return rowCursor + 1 <= getFetchSize();
    }

    @Override
    public String getString(String columnLabel) throws SQLException {
        return this.response.getResult().get(rowCursor).get(columnLabel).toString();
    }

    @Override
    public boolean getBoolean(String columnLabel) throws SQLException {
        return false;
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return RESULT_SET_META_DATA;
    }

    @Override
    public void beforeFirst() throws SQLException {
        rowCursor = 0;
    }

    @Override
    public void afterLast() throws SQLException {
        rowCursor = 1;
    }

    @Override
    public int getRow() throws SQLException {
        return rowCursor;
    }

    @Override
    public int getFetchSize() throws SQLException {
        return response.getSize();
    }
}
