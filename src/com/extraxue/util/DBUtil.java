package com.extraxue.util;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库工具类
 */
public class DBUtil {
    private String dbUrl = "jdbc:mysql://localhost:3306/db_book"; //数据库连接地址
    private String dbUserName = "root";
    private String dbPassword = "ExtraXue123!";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";//jdbc8.0在连接名上多了个‘cj’

    public Connection getConn() throws Exception{
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
        return con;
    }

    /**
     * 关闭数据库连接
     * Connection占用内存很多，所以主要关闭这个，别的可以不管
     * @param con
     * @throws Exception
     */
    public void closeConn(Connection con) throws Exception{
        if(con != null){
            con.close();
        }
    }
    public static void main(String[] args){
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.getConn();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
    }
}

