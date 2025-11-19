package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO 
{
	public CustomerBean checkLogin(String Mid,String U_pwd)
	{
		CustomerBean cb=null;
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select *from customer where  MID=? AND  UPWORD=?");
			System.out.println("CustomerLogin Connection created");
			pstmt.setString(1,Mid);
			pstmt.setString(2, U_pwd);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
			cb=new CustomerBean();
			cb.setCname(rs.getString(1));
			cb.setPwd(rs.getString(2));
			cb.setFname(rs.getString(3));
			cb.setLname(rs.getString(4));
			cb.setAddr(rs.getString(5));
			cb.setMid(rs.getString(6));
			cb.setPhn(rs.getString(7));
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cb;
	}

	}

