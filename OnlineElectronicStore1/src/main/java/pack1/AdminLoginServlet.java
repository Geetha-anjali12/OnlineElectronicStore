package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/alogin")
public class AdminLoginServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	 String uname=req.getParameter("uName");
	 String pwd=req.getParameter("pwd");
	AdminLoginDAO obj=new AdminLoginDAO();
    AdminBean abean=obj.checkLogin(uname,pwd);
	  if(abean==null)
	  {
		  req.setAttribute("message", "Invalid admin credentials...");
		  req.getRequestDispatcher("ALogin.jsp").forward(req,res);
	  }
	  else
	  {
		
		
		HttpSession session=req.getSession();
		session.setAttribute("abean",abean);
		req.getRequestDispatcher("AdminHome.jsp").forward(req,res);
		
	
}
}
}
