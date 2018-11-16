/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.entity;
/**
 * User类，用来存储用户信息
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/11/11 19:30
 * @since 1.0
 */
public class User {
    //用户名
    String userName;
    //密码
    String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
