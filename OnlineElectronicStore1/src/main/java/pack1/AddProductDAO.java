package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
public int insertProductDetails(ProductBean pb)
{
	int rowCount=0;
	try
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
		System.out.println("AddProduct Connection created");
		pstmt.setString(1,pb.getPcode());
		pstmt.setString(2,pb.getPname());
		pstmt.setString(3,pb.getPcompany());
		pstmt.setString(4,pb.getPprice());
		pstmt.setString(5,pb.getPqty());
		
		rowCount=pstmt.executeUpdate();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rowCount;
}
}

