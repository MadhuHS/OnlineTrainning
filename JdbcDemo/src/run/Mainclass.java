package run;

import java.util.ArrayList;

import models.User;
import services.DBService;

public class Mainclass {
	public static void main(String[] args) {
		try 
		{
			DBService.startDb("userdb", "root", "Root$123");
			DBService dbserv =  new DBService();
			
			ArrayList<User> list = dbserv.getAllData("users");
			for (int i = 0; i < list.size(); i++) 
			{
			   System.out.println(list.get(i).getName());
			   System.out.println(list.get(i).getEmail());
			   System.out.println(list.get(i).getPhn());
			}
			
			User usr = new User();
			usr.setName("madhu");
			usr.setEmail("email1");
			usr.setPhn(134456667);
			
			dbserv.updateUser(usr);
			
			
			DBService.stopDb();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
