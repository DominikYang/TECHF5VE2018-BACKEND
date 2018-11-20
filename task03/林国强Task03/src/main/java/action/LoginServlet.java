package action;

import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: Task_03
 * @description:
 * @author: Lin
 * @create: 2018-11-17 19:34
 **/
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            response.setContentType("text/xml;charset=UTF-8");
            response.setHeader("Cache-Control", "no-cache");
            request.setCharacterEncoding("utf-8");
            ResultSet rs=null;
            PrintWriter out=response.getWriter();
            try{
                String userName=request.getParameter("userName");
                String password=request.getParameter("password");
                //用户登录
                UserServiceImpl userService=new UserServiceImpl();
                //UserServiceImpl userServiceImpl =new UserServiceImpl();
                //调用数据库连接
                rs= userService.loginUser(userName,password);
                if (rs.next()) {
                    //判断数据库里的数据与用户输入的信息是否匹配
                    //匹配则跳转到登录成功界面
                    out.print("success");
                    //request.getRequestDispatcher("/Login_success.jsp").forward(request,response);
                } else {

                    out.print("用户不存在或密码错误！");
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
