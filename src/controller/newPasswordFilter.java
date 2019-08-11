package controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class newPasswordFilter
 */
public class newPasswordFilter implements Filter {

    /**
     * Default constructor. 
     */
    public newPasswordFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String pwd=request.getParameter("PWD");
		String cpwd=request.getParameter("CPWD");
		if(pwd.equals(cpwd)==true)
		{
	
		
		chain.doFilter(request, response);
	}
		else
		{
			((HttpServletResponse) response).sendRedirect("/bankapplication/errornewpassword.jsp");
		}
	}
}
	