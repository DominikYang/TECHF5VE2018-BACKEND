/**
 * @description 通用的数据库操作
 * @author xvyanpeng
 * @date 2018/11/25 17:58
 * @creed: Don't be proud, There are many people who are better than you.
 */
package util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    private final static String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
    private final static String USERNAME = "root";
    private final static String PWD = "159852";
    public static Connection connection = null;
    public static PreparedStatement preparedStatement = null;

    /**
     * @params [sql, params]
     * @return boolean
     * @description 执行修改操作
     */
    public static boolean executeUpdate(String sql, Object[] params) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //建立连接
        connection = DriverManager.getConnection(URL, USERNAME, PWD);
        preparedStatement = connection.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
        int count = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }
/**
 * @params [sql, params]
 * @return java.sql.ResultSet
 * @description 执行查询操作
 */
    public static ResultSet executeQuery(String sql, Object[] params) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ResultSet resultSet = null;
        //建立连接
        connection = DriverManager.getConnection(URL, USERNAME, PWD);
        preparedStatement = connection.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
        resultSet = preparedStatement.executeQuery();

        return resultSet;

    }
    /**
     * @params [sql]
     * @return int
     * @description 查询数据总数
     */
    public static int getTotalCount(String sql) throws ClassNotFoundException, SQLException {
        int count=-1;
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet resultSet = null;
        //建立连接
        connection = DriverManager.getConnection(URL, USERNAME, PWD);
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            count= resultSet.getInt(1);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return count;

    }

}
