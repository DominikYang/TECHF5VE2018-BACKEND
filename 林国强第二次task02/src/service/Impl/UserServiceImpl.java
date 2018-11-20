package service.Impl;

import java.sql.ResultSet;

/**
 * @author Lin
 */
public interface UserServiceImpl {
    /**
     * 实现登录
     * @param userName
     * @param password
     * @return
     */
    public ResultSet loginUser(String userName, String password);
}
