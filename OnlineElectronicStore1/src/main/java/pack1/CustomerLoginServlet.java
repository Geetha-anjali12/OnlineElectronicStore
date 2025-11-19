package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/clog")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		
		CustomerLoginDAO obj=new CustomerLoginDAO();
        CustomerBean cbean=obj.checkLogin(req.getParameter("mail"),req.getParameter("pwd"));
		  if(cbean==null)
		  {
			  req.setAttribute("msg", "Invalid customer credentials...");
			  req.getRequestDispatcher("CustomerRegistration.jsp").forward(req,res);
		  }
		  else
		  {
			
			
			HttpSession session=req.getSession();
			session.setAttribute("cbean",cbean);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req,res);
			
		
	}
	}
	}


