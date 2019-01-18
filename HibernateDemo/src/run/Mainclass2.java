package run;

import models.Address;
import models.User;
import services.DBService;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		User u1 = new User();
		u1.setName("user1");
		
		Address addrs = new Address();
		addrs.setPin(54321);
		addrs.setCity("Blr");
		addrs.setState("kar");
		
		u1.setAddrs(addrs);
		
		DBService.startDb();
		DBService dbsrv = new DBService();
		dbsrv.addUser(u1);
		dbsrv.addAddrs(addrs);
		
	}
}


