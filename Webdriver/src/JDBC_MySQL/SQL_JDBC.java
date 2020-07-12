package JDBC_MySQL;

import java.sql.*;

public class SQL_JDBC 
{

		static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
		static final String DB_URL = "jdbc:sqlserver://localhost:1433;database=NAB_DB;user=soumi;password=soccer";

//	   static final String USER = "soumi";
//	   static final String PASS = "soccer";
	   
	public static void main(String[] args)
	{
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try 
        {
            
        	//String connectionUrl = "jdbc:sqlserver://localhost:1234;databaseName=123;user=123;password=123";
        	//conn = DriverManager.getConnection(connectionUrl);
                
        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        		
        		System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL);
                
                System.out.println("Creating statement...");
                stmt = conn.createStatement();
                String SQL;
                
                SQL = "select * from Employee";
                
                rs = stmt.executeQuery(SQL);
                
                while (rs.next()) 
                {
                    //output =  (String) rs.getObject(1);
                	System.out.println("ID : "+rs.getInt("ID")+"    EmpCode: "+rs.getString("EmpCode")+"	EmpName"+rs.getString("EmpName")+"	EmpDeptID"+rs.getString("EmpDeptID")+"	MgrID"+rs.getString("MgrID") );
                }
                rs.close();
                System.out.println("Executed Sucessfully");
        }
        catch (Exception e) 
        {
        	System.out.println("StackTrace Error");
        	e.printStackTrace();
        }
        
    }


}
