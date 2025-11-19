
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
	@WebServlet("/update1")
	public class UpdateCustomerProductServlet extends HttpServlet
	{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);//return the session
		if(session==null)
	             req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		else
		{
			String pcode=req.getParameter("Pcode");
			String pprice=req.getParameter("Pprice");
    		String pqty=req.getParameter("Pqty");
    		String required=req.getParameter("reqno");
    		String final_pqty=String.valueOf(Integer.parseInt(pqty)-Integer.parseInt(required));
			if(Integer.parseInt(required)>Integer.parseInt(pqty))
			{
				req.setAttribute("msg","Product Data NOT Updated");
				req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
			}
			else
			{
				double FinalPrice=Integer.parseInt(required)*Integer.parseInt(pprice);
				ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productlist1");
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
				pb.setPqty(req.getParameter("Pqty"));
				
				UpdateProductDAO obj=new UpdateProductDAO();
				int rowCount=obj.updateProductdata(pb);
				if(rowCount>0)
				{
					req.setAttribute("FinalPrice", FinalPrice);
					req.getRequestDispatcher("OrderConfirmed.jsp").forward(req,res);
				}
			}
	}
	}
	}


