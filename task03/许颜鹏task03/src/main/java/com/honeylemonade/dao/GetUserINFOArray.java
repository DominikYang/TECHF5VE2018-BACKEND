
/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.dao;

import org.json.JSONArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 从.json文件中读取出JSONArray数组并返回此数组
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/31 19:30
 * @since 1.0
 */
public class GetUserINFOArray {

    //返回JSONArray对象的方法
    public static JSONArray read() throws IOException {
        //设置文件
        File src=new File("C:\\Users\\15985\\Desktop\\SignInDemo\\src\\main\\java\\com\\honeylemonade\\dao\\UserDatabase.json");
        //创建文件流
        InputStream is=new FileInputStream(src);
        byte[] flush=new byte[1024*10];
        int len =-1;
        StringBuffer string=new StringBuffer();
        while ((len=is.read(flush))!=-1){
            String str=new String(flush,0,len);
            string.append(str);
        }
        //将String类变为JSONArray对象
        JSONArray jsonarray=new JSONArray(string.toString());
        //返回JSONArray对象
        return jsonarray;
    }
}
