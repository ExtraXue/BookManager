package com.extraxue.dao;

import com.extraxue.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 用户DAO类
 */
public class UserDao {
    /**
     * 登录验证
     * @param con
     * @param user
     * @return
     * @throws Exception
     *
     */
    public User login(Connection con,User user) throws Exception{
        User resultUser = null;
        //新增数据库接口
        String sql = "select * from t_user where userName = ? and " +
                "password = ? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,user.getUserName());
        pstmt.setString(2,user.getPassWord());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            resultUser = new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassWord(rs.getString("passWord"));
        }
        return resultUser;
    }

}
