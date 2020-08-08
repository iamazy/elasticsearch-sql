package io.github.iamazy.elasticsearch.dsl.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author iamazy
 * @date 2019/12/21
 **/
public interface ElasticDataSource extends DataSource {

    boolean shouldClose(Connection connection);
}
