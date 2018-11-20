package service;

import dao.UserDao;
import entity.User;
import service.Impl.UserServiceImpl;

import java.sql.ResultSet;

/**
 * @program: Task02
 * @description:
 * @author: Lin
 * @create: 2018-11-11 11:39
 **/
public class UserService implements UserServiceImpl {
    @Override
    public ResultSet loginUser(String userName, String password) {
        UserDao userDao=new UserDao();
        User u=new User();
        u.setUserName(userName);
        u.setPassword(password);
        return userDao.findByNameAndPassword(u.getUserName(),u.getPassword());
    }
}
