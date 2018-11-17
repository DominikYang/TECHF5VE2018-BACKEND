<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/11/4
  Time: 18:34
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
<h1 align="center">登录</h1>
<!-- 用户登录界面-->
<h1 align="center">用户登录</h1>
<div class="container container-small">
<form name="Login" method="post" action="action/LoginServlet">
    <!-- 转到servlet-->
  <div class="form-group">
    <div align="center" class="alert-success">请登录</div>
    <label>用户名</label>
    <input class="form-control" type="text" name="userName">
  </div>
  <div class="form-group">
    <label>密  码</label>
    <input class="form-control" type="password" name="password">
  </div>
<div align="center" class="form-group">
    <input class="btn btn-block" type="submit"   value="立即登录">
</div>
</form>
</div>
</body>
</html>

