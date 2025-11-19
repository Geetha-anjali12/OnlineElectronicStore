package pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/view2")
public class ViewCustomerProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);
		ViewCustomerProductDAO vDAO=new ViewCustomerProductDAO();
		ArrayList<ProductBean> al1=vDAO.getProductdata();
		session.setAttribute("productlist1", al1);
		req.getRequestDispatcher("customerViewProduct.jsp").forward(req,res);
	}
}
