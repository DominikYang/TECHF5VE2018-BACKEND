package entity;
/**
*用户实体类
**@author linguoqiang
*@version V1.0
 * * @date 2018/11/3 20：42
 * since 1.8
 */
public class Users {
    private String username;  //用户名
    private String password;   //密码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
