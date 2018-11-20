package action;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 *
 * @author Lin
 * @date 2016/10/31
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        ResultSet rs=null;
        try{
            String userName=request.getParameter("userName");
            String password=request.getParameter("password");
            //用户登录
            UserService userService=new UserService();
            //调用数据库连接
            rs=userService.loginUser(userName,password);
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
}
