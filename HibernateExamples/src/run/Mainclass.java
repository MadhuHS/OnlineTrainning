package run;

import java.sql.SQLException;

import models.User;
import service.DBService;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       DBService dbsrv = new DBService();
	   dbsrv.startDb();
       
       User u1 = new User();
      // u1.setId(1);
       u1.setName("smith");
       u1.setPhn(98776554222l);
       u1.setEmail("smith@gmail.com");
       
       try 
       {
		User u2 = dbsrv.getUser(2);
		System.out.println(u2.getName());
	   } 
       catch (SQLException e1)
       {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	  }
       
       try 
       {
		dbsrv.addUser(u1);
	   } 
       catch (SQLException e) 
       {
		e.printStackTrace();
	   }
	}
}


