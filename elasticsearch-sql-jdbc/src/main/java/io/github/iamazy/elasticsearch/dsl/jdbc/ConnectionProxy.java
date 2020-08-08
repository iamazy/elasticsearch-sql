package io.github.iamazy.elasticsearch.dsl.jdbc;

import java.sql.Connection;

/**
 * @author iamazy
 * @date 2019/12/16
 **/
public interface ConnectionProxy extends Connection {

    Connection getTargetConnection();
}
