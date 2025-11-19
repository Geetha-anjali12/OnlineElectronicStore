package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
public int updateProductdata(ProductBean pb)
{
	int rowCount=0;
	try
	{
	Connection con=DBConnect.getCon();
	PreparedStatement pstmt=con.prepareStatement("update product set PPRICE=?,PQTY=? WHERE PCODE=?");
	System.out.println("UpdateProduct connection created");
	pstmt.setString(1, pb.getPprice());
	pstmt.setString(2, pb.getPqty());
	pstmt.setString(3, pb.getPcode());
	rowCount=pstmt.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rowCount;
}
}

