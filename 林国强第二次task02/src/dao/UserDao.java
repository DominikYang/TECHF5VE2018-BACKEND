package dao;

import dao.Impl.UserDaoImpl;
import utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @program: Task02
 * @description: 数据处理
 * @author: Lin
 * @create: 2018-11-09 11:16
 **/
public class UserDao implements UserDaoImpl {
    @Override
    public ResultSet findByNameAndPassword(String username, String password) {
        ResultSet rs = null;
        Connection connection = DBHelper.getConn();
        String sql =" "+
                " select * from login"+
                " where username=? and password=?";
        try {
            PreparedStatement ptmt = connection.prepareStatement(sql);
            ptmt.setString(1, username);
            ptmt.setString(2, password);
            rs = ptmt.executeQuery();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

}