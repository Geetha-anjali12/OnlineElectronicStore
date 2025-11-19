package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO 
{
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> getProductdata()
	{
		try
		{
			Connection con=DBConnect.getCon();
	         PreparedStatement pstmt=con.prepareStatement("select *from product");
	         System.out.println("ViewProduct connection created");
	         ResultSet rs=pstmt.executeQuery();
	         while(rs.next())
	         {
	        	ProductBean bean=new ProductBean();
	        	bean.setPcode(rs.getString(1));
	        	bean.setPname(rs.getString(2));
	        	bean.setPcompany(rs.getString(3));
	        	bean.setPprice(rs.getString(4));
	        	bean.setPqty(rs.getString(5));
	        	al.add(bean);
	         }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
}
}


