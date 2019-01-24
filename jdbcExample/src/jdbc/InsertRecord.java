package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
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
            
			int upcount = stm.executeUpdate("insert into userdb.user values (2,'user2',67568912,'u2@email')");
            System.out.println(upcount+" record(s) added");

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
