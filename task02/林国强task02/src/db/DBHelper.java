package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *数据库工具类
 **@author linguoqiang
 *@version V1.0
 * * @date 2018/11/3 20：50
 * since 1.8
 */
public class DBHelper {
    private static String URL="jdbc:mysql://127.0.0.1:3306/imooc?serverTimezone=UTC";
    private static String USER="root";
    private static String PASSWORD="Mysql2487049041";
    private static Connection conn=null;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //利用反射启动数据库
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        return conn;
    }
}
