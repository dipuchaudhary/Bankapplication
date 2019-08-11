package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAOModel;

public class statement extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			HttpSession hs=request.getSession();
			int accno=(int) hs.getAttribute("accno");
			DAOModel dao=new DAOModel();
			dao.setAccno(accno);
			ArrayList al=new ArrayList();
			al=dao.getStatement();
			
			if(al==null) {
				response.sendRedirect("/bankapplication/failureStatement.jsp");
			}else {
				hs.setAttribute("al", al);
				response.sendRedirect("/bankapplication/successStatement.jsp");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

