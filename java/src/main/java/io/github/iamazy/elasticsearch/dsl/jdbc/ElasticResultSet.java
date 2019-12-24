package io.github.iamazy.elasticsearch.dsl.jdbc;

import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcSearchResponse;

import java.sql.*;
import java.util.Objects;

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
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return result.toString();
    }

    @Override
    public boolean getBoolean(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Boolean.parseBoolean(result.toString());
    }

    @Override
    public Object getObject(String columnLabel) throws SQLException {
        return this.response.getResult().get(rowCursor).get(columnLabel);
    }

    @Override
    public Date getDate(String columnLabel) throws SQLException {
        return new Date(getLong(columnLabel));
    }

    @Override
    public Time getTime(String columnLabel) throws SQLException {
        return new Time(getLong(columnLabel));
    }

    @Override
    public Timestamp getTimestamp(String columnLabel) throws SQLException {
        return new Timestamp(getLong(columnLabel));
    }

    @Override
    public long getLong(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Long.parseLong(result.toString());
    }

    @Override
    public int getInt(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Integer.parseInt(result.toString());
    }

    @Override
    public double getDouble(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Double.parseDouble(result.toString());
    }

    @Override
    public short getShort(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Short.parseShort(result.toString());
    }

    @Override
    public float getFloat(String columnLabel) throws SQLException {
        Object result = this.response.getResult().get(rowCursor).get(columnLabel);
        Objects.requireNonNull(result);
        return Float.parseFloat(result.toString());
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
