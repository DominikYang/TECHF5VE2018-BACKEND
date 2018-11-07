<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/11/4
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户登录</title>
</head>
<body>
<!-- 用户登录界面-->
<img src="images/login/Login.jpg" width="1520" height="500">
<h1 align="center">用户登录</h1>
<form name="Login" method="post" action="servlet/ServletLogin">
    <!-- 转到servlet-->
  <table align="center">
    <tr>
      <td align="center">用户名：</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td align="center">密码：</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td align="center"><input type="submit" value="登录"></td>
      <td align="center"><input type="reset" value="取消"></td>
    </tr>
  </table>
</form>
</body>
</html>

