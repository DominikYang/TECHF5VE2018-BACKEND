package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import service.IUserService;

import java.sql.SQLException;

public class UserServiceImpl implements IUserService {

    @Override
    public User checkUser(String userName, String password) throws SQLException, ClassNotFoundException {
        IUserDao userDao = new UserDaoImpl();
        User user = userDao.queryUser(userName);
        if (user == null) {
            return null;
        } else if (user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }
}
