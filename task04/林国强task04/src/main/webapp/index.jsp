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
  <title>用户登录</title>
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
  <script type="text/javascript">
      var xmlHttp;
      var userName;
      var password;
      var usernameContent;
      var passwordContent;
      function loadCheck(){
          usernameContent=document.getElementById("username");
          passwordContent=document.getElementById("password");
          if(usernameContent.value.length===0||passwordContent.value.length===0){
              document.getElementById("insert").innerHTML="用户名或密码为空!";
              return;
          }
          userName=usernameContent.value;
          password=passwordContent.value;
         if (window.XMLHttpRequest) {
              xmlHttp = new XMLHttpRequest();
          }
          //考虑浏览器的兼容性
         if (window.ActiveXObject) {
              xmlHttp = new ActiveXObject("Micsoft.XMLHTTP");
              if (!xmlHttp) {
                 xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
             }
         }
          xmlHttp.open("POST","http://localhost:8080/action/AjaxLoginServlet",true);
          xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
          xmlHttp.send("userName="+usernameContent.value+"&password="+passwordContent.value);
          xmlHttp.onreadystatechange=getResult;
      }
      function getResult(){
          //alert(xmlHttp.readyState);
          if(xmlHttp.readyState===4){
              if(xmlHttp.status===200){
                  var result=xmlHttp.responseText;
                  if(result==="success"){
                      location.href="http://localhost:8080/Login_success.jsp";
                  }
                  if(result==="fail"){
                      //动态显示登录失败
                      document.getElementById("insert").innerHTML="用户名或者密码错误！";
                      //登录失败则清空密码
                      document.getElementById("password").value="";
                  }
              }else{
                  alert("连接失败!")
              }
         }
      }
  </script>
</head>
<body>
<h1 align="center">登录</h1>
<!-- 用户登录界面-->
<h1 align="center">用户登录</h1>
<div class="container container-small">
    <!-- 转到servlet-->
  <div class="form-group">
    <div align="center" class="alert-success">请登录</div>
    <label>用户名</label>
    <input class="form-control" type="text" id="username" name="userName" >
  </div>
  <div class="form-group">
    <label>密  码</label>
    <input class="form-control" type="password" id="password" name="password" >
  </div>
<div align="center" class="form-group">
    <input class="btn btn-block" type="submit"   value="立即登录" onclick="loadCheck()" >
</div>
  <div id="insert" style="color:red;padding:10px;font-size:20px"></div>
</div>
</body>
</html>

