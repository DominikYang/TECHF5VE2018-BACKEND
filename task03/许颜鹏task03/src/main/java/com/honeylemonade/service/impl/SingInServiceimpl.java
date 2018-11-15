/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.service.impl;

import com.honeylemonade.dao.GetUserINFOArray;
import com.honeylemonade.entity.User;
import com.honeylemonade.service.SignInService;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
//提供用户名密码，匹配则返回user对象，否则返回NULL
/**
 * SignInService的实现类
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/11/11 19:30
 * @since 1.0
 */
public  class SingInServiceimpl implements SignInService {
    public  User check(String userName, String password) throws IOException {
        //获取json数组
        JSONArray json=GetUserINFOArray.read();
        //利用for each方法遍历用户信息数据库
        for (Object user:json) {
            JSONObject eachUser= (JSONObject) user;
            //用.equals方法判断是否有响应信息匹配
            if(eachUser.get("userName").equals(userName)&&eachUser.get("password").equals(password)){
                User theUser=new User();
                theUser.setPassword(password);
                theUser.setUserName(userName);
                System.out.println(44);
                return theUser;
            }
        }
         return null;
    }
}
