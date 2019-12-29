package io.github.iamazy.elasticsearch.dsl.sql;

import java.sql.*;
import java.util.Arrays;

/**
 * @author iamazy
 * @date 2019/12/23
 * @description
 */
public class JdbcTest {

    static final String JDBC_DRIVER = "io.github.iamazy.elasticsearch.dsl.jdbc.ElasticDriver";
    static final String DB_URL = "jdbc:es://localhost:9200/device_search?useSSL=false&mode=single";

    static final String USER = "admin";
    static final String PASS = "admin";

    private static void conn1(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM device_search where name = 'iamazy' limit 10";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id  = rs.getString("_id");
                String name = rs.getString("name");
                String url = rs.getString("list");
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

    public static void prepareStatement1(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "SELECT * FROM device_search limit 10";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"aaa");
            ps.setInt(2,111);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id  = rs.getString("_id");
                String name = rs.getString("name");
                String url = rs.getString("list");
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            rs.close();
            ps.close();
            conn.close();
        } catch(Exception se){
            se.printStackTrace();
        }
        finally{
            try{
                if(ps!=null) ps.close();
            }catch(SQLException ignored){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void insert1(){
        Connection conn = null;
        Statement ps = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "insert into device_search(name,age,list,_id) values('aaa',11,[1,2,2,1],111)";
            ps = conn.createStatement();
            int rs = ps.executeUpdate(sql);
            System.out.println(rs);
            ps.close();
            conn.close();
        } catch(Exception se){
            se.printStackTrace();
        }
        finally{
            try{
                if(ps!=null) ps.close();
            }catch(SQLException ignored){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void insert2(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "insert into device_search(name,age,list,_id) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"bbb");
            ps.setInt(2,3231);
            ps.setObject(3, Arrays.asList(1,3,2));
            ps.setString(4,"8373");
            int rs = ps.executeUpdate();
            System.out.println(rs);
            ps.close();
            conn.close();
        } catch(Exception se){
            se.printStackTrace();
        }
        finally{
            try{
                if(ps!=null) ps.close();
            }catch(SQLException ignored){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void scroll(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "SELECT * FROM device_search_test";
            ps = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                i++;
                System.out.println(rs.getString("_id")+"--"+ i);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch(Exception se){
            se.printStackTrace();
        }
        finally{
            try{
                if(ps!=null) ps.close();
            }catch(SQLException ignored){
            }
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        scroll();
    }
}
