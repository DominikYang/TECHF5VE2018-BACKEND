package servlet;

import entity.User;
import service.IUserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //服务器指定请求编码
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        IUserService userService=new UserServiceImpl();
        try {
            User user= userService.checkUser(userName,password);
            if(user!=null){
                HttpSession session=request.getSession();
                session.setAttribute("id",user.getId());
                session.setAttribute("userName",user.getUserName());
                session.setAttribute("password",user.getPassword());
                session.setAttribute("age",user.getAge());
                session.setAttribute("address",user.getAddress());
                //5s后session过期
                session.setMaxInactiveInterval(5);
                //请求转发
                request.getRequestDispatcher("WelcomePage.jsp").forward(request,response);
            }else{
                //重定向
                response.sendRedirect("homepage.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
