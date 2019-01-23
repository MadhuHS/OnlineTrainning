package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord
{
	static Connection con;
	static Statement stm;

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/userdb";
		String usname = "root";
		String pwd = "Root$123";

		try {
			//step2
			con = DriverManager.getConnection(dburl, usname, pwd);
			//step3
			stm = con.createStatement();
            
			int upcount = stm.executeUpdate("update userdb.user set name ='madhu' where id = 1");
            System.out.println(upcount+" record(s) updated");

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally 
		{
			try 
			{
				//step5
				stm.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}

		}
	}

}
