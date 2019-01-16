package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.User;

public class DBService {
	private static String url = "jdbc:mysql://localhost:3306/";

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet res = null;

	public static void startDb(String db,String username,String password) throws Exception 
	{
		// step 1
		Class.forName("com.mysql.jdbc.Driver");

		// step 2
		con = DriverManager.getConnection(url+db, username, password);

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
	
	public ArrayList<User> getAllData(String tablename) throws SQLException
	{
		res = stmt.executeQuery("select * from "+ tablename);
		ArrayList<User> usrList = new ArrayList<User>();

		while(res.next() != false)
		{
		
		String usName = res.getString("name");
		long   usPhn  = res.getLong("phn");
		String usEmail = res.getString("email");
		
		User u1 = new User();
		u1.setName(usName);
		u1.setPhn(usPhn);
		u1.setEmail(usEmail);
		
		usrList.add(u1);		
	   }
		return usrList;
	}
	
	public User getUser(String email) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("select * from userdb.user where email = "+email);
		String usName = rs.getString("name");
		long   usPhn  = rs.getLong("phn");
		String usEmail = rs.getString("email");
		
		User u1 = new User();
		u1.setName(usName);
		u1.setPhn(usPhn);
		u1.setEmail(usEmail);
		return u1;
	}
	
	public boolean updateUser(User usr) throws SQLException
	{
		String usName = usr.getName();
		long   usPhn  = usr.getPhn();
		String usEmail = usr.getEmail();
		
		int upCount = stmt.executeUpdate("update userdb.users set name = "+usName+"where email = "+usEmail);
		if(upCount > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}







