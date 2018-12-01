package dao.impl;

import util.DBUtil;
import dao.IUserDao;
import entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    @Override
    public User queryUser(String userName) throws SQLException, ClassNotFoundException {
        String sql="select * from users where userName=?";
        Object[] objects = {userName};
        ResultSet resultSet= DBUtil.executeQuery(sql,objects);
        //若结果集不为空，则返回user对象
        if(resultSet.next()){
            int id=resultSet.getInt(1);
            String uName=resultSet.getString(2);
            String pwd=resultSet.getString(3);
            int age=resultSet.getInt(4);
            String address=resultSet.getString(5);
            User user=new User(id,uName,pwd,age,address);
            return user;
        }
        return null;
    }
}
