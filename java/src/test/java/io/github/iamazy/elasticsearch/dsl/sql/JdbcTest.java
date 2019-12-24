package io.github.iamazy.elasticsearch.dsl.sql;

import java.sql.*;

/**
 * @author iamazy
 * @date 2019/12/23
 * @description
 */
public class JdbcTest {

    static final String JDBC_DRIVER = "io.github.iamazy.elasticsearch.dsl.jdbc.ElasticDriver";
    static final String DB_URL = "jdbc:es://localhost:9200/demo?useSSL=true&mode=cluster";

    static final String USER = "admin";
    static final String PASS = "admin";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM ? limit 1";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id  = rs.getString("_id");
                String name = rs.getString("age");
                String url = rs.getString("url");
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception se){
            se.printStackTrace();
        }
        finally{
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException ignored){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
