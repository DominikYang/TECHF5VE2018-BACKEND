package dao.Impl;

import java.sql.ResultSet;

/**
 * @author Lin
 */
public interface UserDaoImpl {
    /**
     * 通过用户名和密码查找
     * @param userName
     * @param password
     * @return
     */
    public ResultSet findByNameAndPassword(String userName, String password);
}
