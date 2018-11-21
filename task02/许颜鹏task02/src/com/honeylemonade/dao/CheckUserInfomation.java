/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.dao;

import java.io.IOException;
import java.util.HashMap;

/**
 * 将方法参数与容器中的信息做比对，若存在匹配的信息，返回true，否则返回false
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/31 19:30
 * @since 1.0
 */
public class CheckUserInfomation {
    public static boolean check(String userName, String passWord) throws IOException {
        HashMap<String, String> userList = GetList.getMapCollection();
        try {
            if (userList.get(userName).equals(passWord))//判断密码字符串是否相等
                return true;
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }

}
