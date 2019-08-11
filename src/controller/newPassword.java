package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAOModel;

/**
 * Servlet implementation class newPassword
 */
public class newPassword extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	try
	{
		 String pwd=request.getParameter("PWD");
		String mail=request.getParameter("MAIL");
		DAOModel dao=new DAOModel();
		dao.setEmail(mail);
		dao.setPassword(pwd);
		boolean temp=dao.resetPassword();
		if(temp==true)
		{
			response.sendRedirect("/bankapplication/successnewpassword.jsp");
		}
		else
		{
			response.sendRedirect("/bankapplication/failurenewpassword.jsp");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
