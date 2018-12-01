package dao;

import entity.User;

import java.sql.SQLException;

public interface IUserDao {
    /**
     * @description 通过用户名查询用户，若存在此用户返回user对象，否则返回NULL
     * @author xvyanpeng
     * @date 2018/12/1 15:30
     * @creed: Don't be proud, There are many people who are better than you.
     */
    public User queryUser(String userName) throws SQLException, ClassNotFoundException;
}
