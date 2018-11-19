package entity;
/**
*用户实体类
**@author linguoqiang
*@version V1.0
 * * @date 2018/11/3 20：42
 * since 1.8
 */
public class User {
    /**
     * 用户
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
