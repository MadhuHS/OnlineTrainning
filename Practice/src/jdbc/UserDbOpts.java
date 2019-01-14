package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDbOpts 
{
	static String url = "jdbc:mysql://localhost:3306/userdb";
	static String user = "root";
	static String password = "Root$123";
	
	static Connection con = null;
	static Statement stmt = null;
	
    public static void startDb() throws Exception
    {
    		    // step 1
		    Class.forName("com.mysql.jdbc.Driver");

			// step 2
			con = DriverManager.getConnection(url, user, password);

			// step 3
			stmt = con.createStatement();
    }
    
    public static void stopDb()
    {
      	try
		{
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
    }
    
    public static void addUserRecord()
    {
    	
    }
	
	public static void main(String[] args)
	{
       try 
       {
		startDb();
	   }
       catch (Exception e) 
       {
		e.printStackTrace();
	   }
             
       stopDb();
	}

}
