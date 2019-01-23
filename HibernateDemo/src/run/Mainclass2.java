package run;

import java.util.List;

import models.Address;
import models.User;
import models.Vehicle;
import services.DBService;

public class Mainclass2 {
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setName("user1");

		Address addrs = new Address();
		addrs.setPin(54321);
		addrs.setCity("Blr");
		addrs.setState("kar");
		
		List<Vehicle> a1 = u1.getVehicles();
		Vehicle v1 = new Vehicle();
		v1.setName("Car");
		v1.setUsr(u1);
		
		Vehicle v2 = new Vehicle();
		v2.setName("jeep");
		v2.setUsr(u1);
		
		a1.add(v1);
		a1.add(v2);

		u1.setAddrs(addrs);
		u1.setVehicles(a1);

		DBService.startDb();
		DBService dbsrv = new DBService();
		
		dbsrv.addAddrs(addrs);
		dbsrv.addVehicle(v1);
		dbsrv.addVehicle(v2);
		
		dbsrv.addUser(u1);

	}
}
