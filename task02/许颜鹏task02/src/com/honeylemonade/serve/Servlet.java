/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 *
 */
package com.honeylemonade.serve;

import com.honeylemonade.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/31 19:30
 * @since 1.0
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        resp.setContentType("text/html;charset=utf-8");
        if (CheckUserInfomation.check(userName, passWord)) {//用户信息匹配则登入成功，否则登录失败
            resp.getWriter().write("<h1 style=\";color:red;text-align:center\">登录成功！！</h1>");
        } else {
            resp.getWriter().write("<h1 style=\";color:red;text-align:center\">登录失败！！</h1>");
        }
    }
}
