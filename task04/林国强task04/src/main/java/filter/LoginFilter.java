package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @program: Task03
 * @description: 控制登录的过滤器
 * @author: Lin
 * @create: 2018-11-27 20:39
 **/
public class LoginFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取filterConfig
        config=filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取到HttpServlet的request和response
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        //获取session
        HttpSession session=request.getSession();
        //String noLoginPaths=config.getInitParameter("noLoginPaths");

        //通过config获取配置文档里面的初始化参数
        String charset=config.getInitParameter("charset");
        //防止乱码
        if(charset==null){
            charset="UTF-8";
        }
        request.setCharacterEncoding(charset);
        /*
        if (noLoginPaths!=null){
            String[] strArray=noLoginPaths.split(";");
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i]==null||"".equals(strArray[i])){
                    continue;
                }
                if (request.getRequestURI().contains(strArray[i])){
                    filterChain.doFilter(servletRequest,servletResponse);
                    return;
                }
            }
        }
        */
        if(session.getAttribute("userName")!=null){
            //当session中的userName存在时则放行
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            //当不存在时则跳转登录
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
    @Override
    public void destroy() {

    }
}
