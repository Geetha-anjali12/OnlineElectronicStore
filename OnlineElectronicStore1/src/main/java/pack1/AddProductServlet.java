package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession session=req.getSession(false);
	if(session==null)
	{
		req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	}
	else
	{
	ProductBean pb=new ProductBean();
	
     pb.setPcode(req.getParameter("Pcode"));
     pb.setPname(req.getParameter("Pname"));
     pb.setPcompany(req.getParameter("Pcomp"));
     pb.setPprice(req.getParameter("Pprice"));
     pb.setPqty(req.getParameter("Pqty"));
     AddProductDAO aprodbobj=new AddProductDAO();
   	int rowCount=aprodbobj.insertProductDetails(pb);
   	if(rowCount>0)
   	{
   		req.setAttribute("message","products are added");
   		req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
   		
   	}
   	else
   	{
   		req.setAttribute("message","Products will NOT be added");
   		req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
   	}
   	
}
}
}
	

