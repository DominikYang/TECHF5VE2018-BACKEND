package servlet;

import db.DBHelper;
import entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Users u=new Users();
        request.setCharacterEncoding("utf-8");
        String username,password;
        try{
            username=request.getParameter("username");
            password=request.getParameter("password");
            u.setUsername(username);
            u.setPassword(password);
            Connection connection= DBHelper.getConn(); //调用数据库连接
            String sql=""+
                       " select * from login"+
                       " where username=? and password=?";
                PreparedStatement ptmt = connection.prepareStatement(sql);
                ptmt.setString(1, request.getParameter("username"));
                ptmt.setString(2, request.getParameter("password"));
                ResultSet rs = ptmt.executeQuery();
                if (rs.next()) {
                    //判断数据库里的数据与用户输入的信息是否匹配
                    //匹配则跳转到登录成功界面
                    request.getRequestDispatcher(request.getContextPath()+"/Login_success.jsp").forward(request,response);
                } else {
                    //无法找到该用户 则跳转到登录失败界面
                    request.getRequestDispatcher(request.getContextPath() + "/Login_fail.jsp").forward(request,response);
                }
            }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);   //使doGet做doPost请求
    }
}
