/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 */
package com.honeylemonade.action;

import com.honeylemonade.entity.User;
import com.honeylemonade.service.SignInService;
import com.honeylemonade.service.impl.SingInServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//设置此servlet的URL

@WebServlet("/SignInServlet")
/**
 * 将方法参数与容器中的信息做比对，若存在匹配的信息，返回true，否则返回false
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/11/11 19:30
 * @since 1.0
 */
public class SignInServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受用户传递参数
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        //进行业务逻辑处理
        resp.setContentType("text/html;charset=utf-8");
        SignInService checker = new SingInServiceimpl();
        User theUser = checker.check(userName, password);
        //如果返回的为User对象，则说明数据库中存在此用户
        if (theUser != null) {
            resp.getWriter().write("<h1 style=\\\";color:red;text-align:center\\\">尊敬的用户:" + checker.check(userName, password).getUserName() + ",您好，欢迎来到您的个人主页!</h1>");
        } else {
            resp.getWriter().write("<h1 style=\\\";color:red;text-align:center\\\">登录失败!</h1>");
        }
    }
}
