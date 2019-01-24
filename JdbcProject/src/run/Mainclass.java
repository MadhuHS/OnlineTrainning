package run;

import java.sql.SQLException;
import java.util.ArrayList;

import models.User;
import service.DBService;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       DBService dbsrv = new DBService();
       try 
       {
		dbsrv.startDb("userdb","root","Root$123");
		User u1 = new User();
		u1.setId(1);
		u1.setName("Miller");
		u1.setPhn("2321233");
		u1.setEmail("miller@email");
		
		//int count = dbsrv.updateUser(u1);
		//System.out.println(count+" user info updated");
        
		//int count = dbsrv.deleteUser(5);
		//System.out.println(count+" user deleted");

		 
		//int count = dbsrv.addUser(u1);
		//System.out.println(count+"user(s) added");
		
		/*User usr = dbsrv.getUser(2);
		System.out.println(usr.getId());
		System.out.println(usr.getName());
		System.out.println(usr.getPhn());
		System.out.println(usr.getEmail());*/
		
		ArrayList<User> usrlist= dbsrv.getAllUsers();
		
		for (int i = 0; i < usrlist.size(); i++) 
		{
			User usr1 = usrlist.get(i);
			System.out.println(usr1.getId());
			System.out.println(usr1.getName());
			System.out.println(usr1.getPhn());
			System.out.println(usr1.getEmail());
		}
		
	   } 
       catch (SQLException e) 
       {
		e.printStackTrace();
	   }
	}
}
