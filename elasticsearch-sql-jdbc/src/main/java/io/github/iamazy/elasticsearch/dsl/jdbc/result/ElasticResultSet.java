package io.github.iamazy.elasticsearch.dsl.jdbc.result;

import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcScrollSearchResponse;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcSearchResponse;
import io.github.iamazy.elasticsearch.dsl.jdbc.statement.ElasticStatement;
import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticResultSet extends AbstractResultSet {

    private static final ElasticResultSetMetaData RESULT_SET_META_DATA = new ElasticResultSetMetaData();

    private JdbcSearchResponse response;

    private int rowCursor = -1;

    public ElasticResultSet(Statement statement, JdbcSearchResponse response) {
        super(statement);
        this.response = response;
    }

    @Override
    public boolean next() throws SQLException {
        rowCursor++;
        if (response instanceof JdbcScrollSearchResponse) {
            if (rowCursor == getFetchSize()) {
                ElasticStatement elasticStatement = (ElasticStatement) this.statement;
                try {
                    ElasticResultSet resultSet = (ElasticResultSet) elasticStatement.executeScrollQuery(response.getSql(), ((JdbcScrollSearchResponse) response).getScrollId());
                    response = resultSet.response;
                    rowCursor = 0;
                } catch (IOException e) {
                    throw new SQLException(e.getMessage());
                }
            }
        }
        return rowCursor + 1 <= getFetchSize();
    }

    @Override
    public String getString(String columnLabel) throws SQLException {
        String fieldName=columnLabel;
        if(this.response.getAliasMap().containsKey(columnLabel)){
            fieldName=this.response.getAliasMap().get(fieldName);
        }
        Object result = FlatMapUtils.flatGet(fieldName,this.response.getResult().get(rowCursor));
        Objects.requireNonNull(result);
        return result.toString();
    }

    @Override
    public boolean getBoolean(String columnLabel) throws SQLException {
        return Boolean.parseBoolean(getString(columnLabel));
    }

    @Override
    public Object getObject(String columnLabel) throws SQLException {
        return FlatMapUtils.flatGet(columnLabel,this.response.getResult().get(rowCursor));
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
        return Long.parseLong(getString(columnLabel));
    }

    @Override
    public int getInt(String columnLabel) throws SQLException {
        return Integer.parseInt(getString(columnLabel));
    }

    @Override
    public double getDouble(String columnLabel) throws SQLException {
        return Double.parseDouble(getString(columnLabel));
    }

    @Override
    public short getShort(String columnLabel) throws SQLException {
        return Short.parseShort(getString(columnLabel));
    }

    @Override
    public float getFloat(String columnLabel) throws SQLException {
        return Float.parseFloat(getString(columnLabel));
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
