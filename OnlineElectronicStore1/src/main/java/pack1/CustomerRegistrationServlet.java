package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/ureg")
public class CustomerRegistrationServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	CustomerBean cb=new CustomerBean();
	cb.setCname(req.getParameter("cname"));
	cb.setPwd(req.getParameter("pwd"));
	cb.setFname(req.getParameter("fname"));
	cb.setLname(req.getParameter("lname"));
	cb.setAddr(req.getParameter("addr"));
	cb.setMid(req.getParameter("mid"));
	cb.setPhn(req.getParameter("phn"));
	CustomerRegistrationDAO crDAO=new CustomerRegistrationDAO();
	int rowCount=crDAO.insertCustomerData(cb);
	if(rowCount>0)
   	{
   		req.setAttribute("msg","customer succesfuully Registered!!!");
   		req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
   		
   	}
   	else
   	{
   		req.setAttribute("msg","Please Register....");
   		req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
   	}
   	
}
}

