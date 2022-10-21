package io.github.iamazy.elasticsearch.dsl.jdbc.result;

import io.github.iamazy.elasticsearch.dsl.cons.CoreConstants;
import io.github.iamazy.elasticsearch.dsl.jdbc.elastic.JdbcDescResponse;
import io.github.iamazy.elasticsearch.dsl.utils.FlatMapUtils;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

/**
 * @author chen.weihao@ruanyun.net
 */
public class ElasticDescResultSet extends AbstractResultSet {

    private static final ElasticResultSetMetaData RESULT_SET_META_DATA = new ElasticResultSetMetaData();

    private final JdbcDescResponse response;

    private int rowCursor = -1;

    public ElasticDescResultSet(Statement statement, JdbcDescResponse response) {
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
        return (String) response.getResult().get(rowCursor).get(columnLabel);
    }

    @Override
    public Object getObject(String columnLabel) throws SQLException {
        Object object = response.getResult().get(rowCursor).get(columnLabel);
        try {
            return CoreConstants.OBJECT_MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("desc parse to json exception");
        }
    }

    @Override
    public boolean getBoolean(String columnLabel) throws SQLException {
        return Boolean.parseBoolean(getString(columnLabel));
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
