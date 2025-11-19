package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO 
{
	public AdminBean checkLogin(String U_name,String U_pwd)
	{
		AdminBean ab=null;
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select *from admin where  uname=? AND upword=?");
			System.out.println("AdminLogin Connection created");
			pstmt.setString(1,U_name);
			pstmt.setString(2, U_pwd);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
			ab=new AdminBean();
			ab.setUname(rs.getString(1));
			ab.setUpword(rs.getString(2));
			ab.setFname(rs.getString(3));
			ab.setLname(rs.getString(4));
			ab.setAddr(rs.getString(5));
			ab.setMid(rs.getString(6));
			ab.setPhno(rs.getString(7));
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}

	}


