package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);//return the session
		if(session==null)
	             req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
		else
		{
			String pcode=req.getParameter("pcode");
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productlist");
			ProductBean pb=null;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext()) 
			{
				pb=i.next();
				if(pcode.equals(pb.getPcode()))
				{
					break;
				}
				
			}
			
			
			DeleteProductDAO obj=new DeleteProductDAO();
			int rowCount=obj.deleteProductdata(pb);
			if(rowCount>0)
			{
				req.setAttribute("msg","Product Data Updated");
			req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
		     }
			else
			{
				req.setAttribute("msg","Product Data NOT Updated");
				req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
			}
	}
	}
	}


