<%@page import="com.sun.net.httpserver.Authenticator.Success"%>
<%@page import="userDao.UserDao"
		import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<jsp:useBean id="userDao" class="userDao.UserDao" scope="page"/>





<meta charset="utf-8">
<title>验证中....</title>


<%
User loginUser = new User();
loginUser.setUsername(request.getParameter("username"));
loginUser.setPassword(request.getParameter("password"));
//System.out.println(loginUser.getPassword());

 try{
if(userDao.yanzhen(loginUser)){
response.sendRedirect("success.jsp");
}

else{
response.sendRedirect("fail.jsp");
}
}
catch(Exception e){
	e.toString();
} 

%>

