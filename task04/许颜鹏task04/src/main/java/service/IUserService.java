package service;

import entity.User;

import java.sql.SQLException;

public interface IUserService {
    /**
     * @params [userName, password]
     * @return boolean
     * @description 数据库中有匹配用户，则返回该用户对象，否则返回null
     */
    public User checkUser(String userName,String password) throws SQLException, ClassNotFoundException;
}
