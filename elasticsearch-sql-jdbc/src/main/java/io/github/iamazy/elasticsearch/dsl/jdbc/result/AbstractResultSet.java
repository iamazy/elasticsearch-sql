package io.github.iamazy.elasticsearch.dsl.jdbc.result;

import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * @author iamazy
 * @date 2019/12/16
 * @descrition
 **/
public abstract class AbstractResultSet extends AbstractFeatureNotSupportedResultSet {

    protected boolean isClosed = false;

    protected Statement statement;

    public AbstractResultSet(Statement statement) {
        this.statement = statement;
    }

    @Override
    public void close() throws SQLException {
        isClosed = true;
    }

    @Override
    public boolean isClosed() {
        return isClosed;
    }

    @Override
    public int findColumn(String columnLabel) throws SQLException {
        return 1;
    }

    @Override
    public boolean wasNull() throws SQLException {
        return false;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {
        //ignore
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return FETCH_FORWARD;
    }

    @Override
    public int getType() throws SQLException {
        return TYPE_FORWARD_ONLY;
    }

    @Override
    public int getConcurrency() throws SQLException {
        return CONCUR_READ_ONLY;
    }

    @Override
    public Statement getStatement() {
        return statement;
    }

    @Override
    public int getHoldability() throws SQLException {
        return CLOSE_CURSORS_AT_COMMIT;
    }

    @Override
    public Object getObject(String columnLabel) throws SQLException {
        return getString(columnLabel);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        if (isWrapperFor(iface)) {
            return (T) this;
        }
        throw new SQLException(String.format("[%s] cannot be unwrapped as [%s]", getClass().getName(), iface.getName()));
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return iface.isInstance(this);
    }
}
