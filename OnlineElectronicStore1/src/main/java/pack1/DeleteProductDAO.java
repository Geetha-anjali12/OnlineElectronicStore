package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO 
{
	public int deleteProductdata(ProductBean pb)
	{
		int rowCount=0;
		try
		{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("delete from product WHERE PCODE=?");
		System.out.println("DeleteProduct Connection created");
		pstmt.setString(1, pb.getPcode());
		rowCount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
	}



