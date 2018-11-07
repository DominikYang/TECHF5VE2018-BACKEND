<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/11/4
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginSuccess</title>
</head>
<body>
<h1 align="center">登录成功</h1>
输入的用户名：<%=request.getParameter("username")%>
输入的密码:<%=request.getParameter("password")%>
<img src="/images/login/Login.jpg" width="1520" height="400">


</body>
</html>
