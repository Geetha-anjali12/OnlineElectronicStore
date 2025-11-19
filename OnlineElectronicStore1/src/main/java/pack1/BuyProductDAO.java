package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyProductDAO 
{
	public ArrayList<ProductBean> BuyProduct(String P_code)
	{
		ArrayList<ProductBean> al=new ArrayList<ProductBean>();
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select *from product where  PCODE=?");
			System.out.println("BuyProduct Connection created");
			pstmt.setString(1,P_code);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				ProductBean pb=new ProductBean();
			pb=new ProductBean();
			pb.setPcode(rs.getString(1));
			pb.setPname(rs.getString(2));
			pb.setPcompany(rs.getString(3));
			pb.setPprice(rs.getString(4));
			pb.setPqty(rs.getString(5));
			al.add(pb);
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	

}

