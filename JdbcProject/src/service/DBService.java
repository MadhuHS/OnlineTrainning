package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.User;

public class DBService 
{
	 Connection con;
	 Statement stm;
	 ResultSet rs;
	 String dburl = "jdbc:mysql://localhost:3306/";
  
   public void startDb(String dbname,String username,String password) 
   throws SQLException
   {
	    con = DriverManager.getConnection(dburl+dbname,username,password);
		stm = con.createStatement();  
   }
   
   public int addUser(User usr) throws SQLException
   {
	   int id = usr.getId();
	   String name = usr.getName();
	   String phn = usr.getPhn();
	   String email = usr.getEmail();
	   
	   String query = "insert into userdb.user values("+id+","+"'"+name+"'"+","+"'"+phn+"'"+","+"'"+email+"'"+")";  
	   //String query = "insert into userdb.user values("+usr.getId()+","+"'"+usr.getName()+"'"+","+"'"+usr.getPhn()+"'"+","+"'"+usr.getEmail()+"'"+")";
	   System.out.println(query);
	   int count = stm.executeUpdate(query); 
	   return count;
   }
   
   public User getUser(int id) throws SQLException
   {
	   String query = "select * from userdb.user where id = "+id;
	   ResultSet rs = stm.executeQuery(query);
	   rs.next();
	   User u1 = new User();
	   
	   int uid = rs.getInt("id");
	   u1.setId(uid);
	   
	   String name = rs.getString("name");
	   u1.setName(name);
	   
	   String phn = rs.getString("phn");
	   u1.setPhn(phn);
	   
	   String email = rs.getString("email");
	   u1.setEmail(email);
	   
	   return u1;
   }
   
   public int updateUser(User usr) throws SQLException
   {
	   String query = "update userdb.user set name = "+"'"+usr.getName()+"'"+","+"email = "+"'"+usr.getEmail()+"'"+","+"phn = "+"'"+usr.getPhn()+"'"+" where id = "+usr.getId();
       System.out.println(query);
	   int count = stm.executeUpdate(query);
       return count;
   }
   
   public int deleteUser(int id) throws SQLException
   {
	   String query = "delete from userdb.user where id = "+id;
       System.out.println(query);
	   int count = stm.executeUpdate(query);
       return count;
   }
   
   public ArrayList<User> getAllUsers() throws SQLException
   {
	   ArrayList<User> usrlist = new ArrayList<User>();
	   String query = "select * from userdb.user";
	   ResultSet rs = stm.executeQuery(query);
	   
	   while(rs.next() != false)
	   {
	   User u1 = new User();
	   
	   int uid = rs.getInt("id");
	   u1.setId(uid);
	   
	   String name = rs.getString("name");
	   u1.setName(name);
	   
	   String phn = rs.getString("phn");
	   u1.setPhn(phn);
	   
	   String email = rs.getString("email");
	   u1.setEmail(email);
	   
	   usrlist.add(u1);
	   }
	   
	   return usrlist;
   }
   
   public void stopDb() throws SQLException
   {
		rs.close();
		stm.close();
		con.close();
   }
}





