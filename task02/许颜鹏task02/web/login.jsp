/*
* Copyright (c) 2018 honeylemonade All Rights Reserved.
*
*
*
*
*
*
*/
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登入</title>
    <style type="text/css">
        .divForm {
            position: absolute;
            width: 300px;
            height: 200px;
            text-align: center;
            top: 50%;
            left: 50%;
            margin-top: -200px;
            margin-left: -150px;
        }
    </style>
</head>
<body background="/pic.png"
      style=" background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
<div class="divForm">
    <form action="Servlet" method="post">
        用户名: <input type="text" name="userName" value=""/><br/><br/>
        密码： <input type="text" name="passWord" value=""/><br/><br/>
        <input type="submit" value="登入">
    </form>
</div>
</body>
</html>
