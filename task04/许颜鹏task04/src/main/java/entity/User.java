/**
 * @description 用户实体类，拥有三种构造函数
 * @author xvyanpeng
 * @date 2018/12/1 15:13
 * @creed: Don't be proud, There are many people who are better than you.
 */
package entity;

public class User {
    /**
     * id
     */
    private int id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private int age;
    /**
     * 地址
     */
    private String address;

    public User() {

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public User(String userName, String password, int age, String address) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public User(int id, String userName, String password, int age, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
}
