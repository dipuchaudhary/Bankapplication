package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAOModel;

public class ChangePassword extends HttpServlet 
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			try
			{
				String pw=request.getParameter("OPW");
				String npw=request.getParameter("NPW");
				HttpSession hs=request.getSession();
				int accno=(int) hs.getAttribute("accno");
				
				DAOModel dao=new DAOModel();
				dao.setAccno(accno);
				dao.setPassword(pw);
				boolean temp=dao.changePassword(npw);
				if(temp==true)
				{
					response.sendRedirect("/bankapplication/successPassword.jsp");
				}
				else 
				{
					response.sendRedirect("/bankapplication/failurePassword.jsp");
				}

			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

