package service;

import java.sql.ResultSet;

/**
 * @program: Task_03
 * @description:
 * @author: Lin
 * @create: 2018-11-17 19:39
 **/
public interface UserService {
    /**
     * 实现登录
     * @param userName
     * @param password
     * @return
     */
    public ResultSet loginUser(String userName, String password);
}
