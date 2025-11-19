package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewCustomerProductDAO
{
ArrayList<ProductBean> al=new ArrayList<ProductBean>();
public ArrayList<ProductBean> getProductdata()
{
	try
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("select *from product");
		System.out.println("ViewCustomerProduct connection created");
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			ProductBean pb1=new ProductBean();
			pb1.setPcode(rs.getString(1));
			pb1.setPname(rs.getString(2));
			pb1.setPcompany(rs.getString(3));
			pb1.setPprice(rs.getString(4));
			pb1.setPqty(rs.getString(5));
			al.add(pb1);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
}
	
}
