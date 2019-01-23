package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mainclass {
	static Connection con;
	static Statement stm;
	static ResultSet rs;

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/userdb";
		String usname = "root";
		String pwd = "Root$123";

		try {
			//step2
			con = DriverManager.getConnection(dburl, usname, pwd);
			//step3
			stm = con.createStatement();
			rs = stm.executeQuery("select * from userdb.user");

			//step4
			while(rs.next() != false)// start pointing to records in resultset
			{
			int i1 = rs.getInt("id");
			String n1 = rs.getString("name");
			String p1 = rs.getString("phn");
			String e1 = rs.getString("email");

			System.out.println(i1);
			System.out.println(n1);
			System.out.println(p1);
			System.out.println(e1);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally 
		{
			try 
			{
				//step5
				rs.close();
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
