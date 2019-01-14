package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String password = "Root$123";
		
		Connection con = null;
		Statement stmt = null;

		try {
			// step 1
		    Class.forName("com.mysql.jdbc.Driver");

			// step 2
			con = DriverManager.getConnection(url, user, password);

			// step 3
			stmt = con.createStatement();
		    int updatedrowcount = stmt.executeUpdate("update userdb.users set name = 'madhu' where userid = 10");
            if(updatedrowcount > 0)
            {
            	  System.out.println("user record updated");
            }
            else
            {
            	  System.out.println("FAILED to update user record");
            }
		
		} 
		 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			//step 5
			//try-catch block to handle exception in finally bock
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
		System.out.println("Program ends...");

	}

}
