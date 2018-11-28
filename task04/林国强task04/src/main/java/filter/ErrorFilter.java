package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: Task03
 * @description: 对错误页面的过滤
 * @author: Lin
 * @create: 2018-11-28 09:55
 **/
@WebFilter(filterName = "ErrorFilter",urlPatterns = "/error.jsp",dispatcherTypes = DispatcherType.ERROR)
public class ErrorFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("用户页面未找到！");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        //获取HTTPServlet的request和response
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        //重定向到指定错误页面
        response.sendRedirect(request.getContextPath()+"/error.jsp");
    }

    @Override
    public void destroy() {

    }
}
