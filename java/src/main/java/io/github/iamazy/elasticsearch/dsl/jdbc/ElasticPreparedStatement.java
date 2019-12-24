package io.github.iamazy.elasticsearch.dsl.jdbc;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.github.iamazy.elasticsearch.dsl.jdbc.cons.JdbcConstants;

import java.math.BigDecimal;
import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public class ElasticPreparedStatement extends AbstractFeatureNotSupportedPreparedStatement {

    private Map<Integer, SqlParam> paramMap = Maps.newHashMap();

    private String sql;

    public ElasticPreparedStatement(ElasticConnection connection, String sql) {
        super(connection);
        this.sql = sql;
    }

    @Override
    public boolean execute() throws SQLException {
        executeQuery();
        return true;
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        if (paramMap.size() > 0) {
            List<SqlParam> params = Lists.newArrayList(paramMap.values());
            params.sort((o1, o2) -> {
                if (o1.index < o2.index) {
                    return -1;
                } else if (o1.index > o2.index) {
                    return 1;
                }
                return 0;
            });
            return executeQuery(sql, params.stream().map(input -> {
                Objects.requireNonNull(input);
                return input.value;
            }).toArray(Object[]::new));
        }
        return executeQuery(sql);
    }

    @Override
    public int executeUpdate() throws SQLException {
        return super.executeUpdate();
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        return super.executeUpdate(sql);
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeUpdate(sql, columnNames);
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        String dateStr = JdbcConstants.DATE_FORMAT.format(x);
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, dateStr));
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        String dateStr = JdbcConstants.DATE_FORMAT.format(x);
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, dateStr));
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        String dateStr = JdbcConstants.DATE_FORMAT.format(x);
        paramMap.put(parameterIndex, new SqlParam(parameterIndex, dateStr));
    }

    @Override
    public void clearParameters() throws SQLException {
        paramMap.clear();
    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {
        if (x instanceof Date) {
            setDate(parameterIndex, (Date) x);
        } else if (x instanceof Time) {
            setTime(parameterIndex, (Time) x);
        } else if (x instanceof java.util.Date) {
            String dateStr = JdbcConstants.DATE_FORMAT.format(x);
            paramMap.put(parameterIndex, new SqlParam(parameterIndex, dateStr));
        } else {
            paramMap.put(parameterIndex, new SqlParam(parameterIndex, x));
        }
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return new ElasticResultSetMetaData();
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return null;
    }

    private static class SqlParam {
        private int index;
        private Object value;

        public SqlParam(int index, Object value) {
            this.index = index;
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}
