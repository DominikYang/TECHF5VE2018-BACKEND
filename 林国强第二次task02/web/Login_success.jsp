<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/11/4
  Time: 19:15
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>test</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <style>
        .btn-primary{
            background-color: #6f42c1;
            border-color: white;
        }
        h1{
            color: #6f42c1;
        }
        .alert-success{
            size: 300px;
        }
        .container-small
        {
            max-width: 350px;
        }
    </style>
</head>
<body>
<h1 align="center">登录成功</h1>
<!-- 用户登录界面-->
<div class="jumbotron" align="center">
  <div class="container container-small">
      <h1>Hello!</h1>
      <p>输入的用户名：<%=request.getParameter("userName")%></p>    <br>
      <p>输入的密码:<%=request.getParameter("password")%></p>       <br>
  </div>
</div>
</body>
</html>

