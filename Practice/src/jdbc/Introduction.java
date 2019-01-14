package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Introduction {
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		String url = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String password = "Root$123";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res  = null;

		try {
			// step 1
		    Class.forName("com.mysql.jdbc.Driver");

			// step 2
			con = DriverManager.getConnection(url, user, password);

			// step 3
			stmt = con.createStatement();
		    res = stmt.executeQuery("select * from userdb.users");

			//step 4
			System.out.println("--------Data from DB--------");
			while(res.next() != false)
			{
			 int id      = res.getInt("userid");
			 String name = res.getString("name");
			 System.out.println("id   = "+id);
			 System.out.println("name = "+name);
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
			//try-catch block to handle exception in finally block
			try
			{
			res.close();
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
