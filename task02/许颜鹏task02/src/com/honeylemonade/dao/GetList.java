/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.dao;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能：从userName.txt文件中获取用户账号密码信息，并可以生产键值对容器
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/31 19:30
 * @since 1.0
 */
public class GetList {

    public static HashMap<String, String> getMapCollection() throws IOException {
        /**
         *获取一个存储用户账号密码的容器
         */
        HashMap<String, String> userList = new HashMap<String, String>();
        File src = new File("C:\\Users\\15985\\Desktop\\servletDemo\\src\\com\\honeylemonade\\dao\\userName.txt");
        BufferedReader readSrc = new BufferedReader(new FileReader(src));
        while (true) {
            String key = readSrc.readLine();
            String value = readSrc.readLine();
            if (key != null && value != null) {
                userList.put(key, value);
            } else break;
        }
        readSrc.close();
        return userList;
    }
}
