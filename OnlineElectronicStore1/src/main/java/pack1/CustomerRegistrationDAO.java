package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegistrationDAO 
{
public int insertCustomerData(CustomerBean cb)
{
	int rowCount=0;
	
	
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			System.out.println("CustomerRegistration connection created");
			pstmt.setString(1, cb.getCname());
			pstmt.setString(2, cb.getPwd());
			pstmt.setString(3, cb.getFname());
			pstmt.setString(4, cb.getLname());
			pstmt.setString(5, cb.getAddr());
			pstmt.setString(6, cb.getMid());
			pstmt.setString(7, cb.getPhn());
			rowCount=pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	return rowCount;
}
	
}

