package dao;

import java.sql.ResultSet;

/**
 * @program: Task_03
 * @description:
 * @author: Lin
 * @create: 2018-11-17 19:37
 **/
public interface UserDao {
    /**
     * 通过用户名和密码查找
     * @param userName
     * @param password
     * @return
     */
    public ResultSet findByNameAndPassword(String userName, String password);
}
