package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
//import pack1.DBInfo.*;
public class DBConnect
{
   private DBConnect()
   {
	   
   }
   private static Connection con=null;
   static
   {
	   try
	   {
		   Class.forName(DBInfo.driver);
		 con= DriverManager.getConnection(DBInfo.dbUrl,DBInfo.dbUname,DBInfo.dbPwd);
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
	   public static Connection getCon()
	   {
		   return con;
		   
	   }
   }

