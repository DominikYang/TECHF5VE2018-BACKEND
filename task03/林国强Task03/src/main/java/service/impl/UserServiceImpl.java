package service.impl;

import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

import java.sql.ResultSet;

/**
 * @program: Task_03
 * @description:
 * @author: Lin
 * @create: 2018-11-17 19:39
 **/
public class UserServiceImpl implements UserService {
    @Override
    public ResultSet loginUser(String userName, String password) {
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        User u=new User();
        u.setUserName(userName);
        u.setPassword(password);
        return userDaoImpl.findByNameAndPassword(u.getUserName(),u.getPassword());
    }
}
