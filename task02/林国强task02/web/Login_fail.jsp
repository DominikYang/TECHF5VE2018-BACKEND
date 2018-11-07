<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/11/4
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginFail</title>
</head>
<body>
<h1>登录失败</h1>
<a href="/index.jsp">点击重新登录</a>    <!-- 设置重新登录-->
输入的用户名：<%=request.getParameter("username")%>
输入的密码:<%=request.getParameter("password")%>
</body>
</html>
