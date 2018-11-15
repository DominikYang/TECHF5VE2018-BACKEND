/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.service;

import com.honeylemonade.entity.User;

import java.io.IOException;

/**
 * 传递userName与password，检查.json中是否有与之匹配的信息，存在则返回user对象，否则返回NULL
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/11/11 19:30
 * @since 1.0
 */
public interface SignInService {
    //接收用户名和密码，如果匹配，则返回User对象，否则返回NULL
   User check(String userName,String password) throws IOException;
}
