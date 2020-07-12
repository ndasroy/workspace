package JDBC_MySQL;

import java.sql.*;

public class JDBC_Test 
{

	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/EMP";


	   static final String USER = "admin";
	   static final String PASS = "admin1";
	   
	   public static void main(String[] args) 
	   {
				   Connection conn = null;
				   Statement stmt = null;
			   try
			   {
		
			      Class.forName("com.mysql.jdbc.Driver");
		
		
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
		
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "select * from employee";
			      ResultSet rs= stmt.executeQuery(sql);
			      while(rs.next())
				      {
				    	  System.out.println("ID : "+rs.getInt("Id")+"    Name: "+rs.getString("Name") );
				      }
			      System.out.println("Executed Sucessfully");
			   }
			   catch(Exception e)
				   {
					   e.printStackTrace();
				   }
	   }
}
