package run;

import models.User;
import services.DBService;

public class Mainclass 
{
	public static void main(String[] args) 
	{		
		DBService.startDb();
		DBService dbserv = new DBService();
		for (int i = 1; i <= 5; i++) 
		{
			User u1 = new User();
			u1.setName("user"+i);
			dbserv.addUser(u1);
		}
		
		User usr = new User();
		usr.setName("Sudhakar");
		usr.setUserid(2);
		dbserv.updateUser(usr);
	}
}






