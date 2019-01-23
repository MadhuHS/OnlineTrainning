package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Address;
import models.User;
import models.Vehicle;


public class DBService
{
	private static Configuration cfg;
	private static Configuration cfg2;
	private static SessionFactory sf;
	private static Session s1;
	private static Transaction tx;
	
	public static void startDb()
	{
		//start hibernate and read configuration in hibernate.cfg.xml
		cfg = new Configuration();
		
		//load the configuration to hibernate 
		cfg2 = cfg.configure();
		
		//creates connection to db
		sf = cfg2.buildSessionFactory();
		
		//get the connection object to perform optn on db
		s1 = sf.openSession();
		
		tx = s1.getTransaction();
	}
	
	public void addUser(User usr)
	{
	   tx.begin();
	   s1.save(usr);
	   System.out.println("user added");
	   tx.commit();
	}
	
	public void addAddrs(Address addrs)
	{
	   tx.begin();
	   s1.save(addrs);
	   System.out.println("Address added");
	   tx.commit();
	}
	
	public void addVehicle(Vehicle vehicle)
	{
	   tx.begin();
	   s1.save(vehicle);
	   System.out.println("vehicle added");
	   tx.commit();
	}
	
	public void updateUser(User usr)
	{
		tx.begin();
		int id = usr.getUserid();
		String newName = usr.getName();
		
	    User u1 = s1.get(User.class,id);
	    u1.setName(newName);
	    s1.update(u1);
	    tx.commit();
	}
	
	public void deleteUser(int id)
	{
		tx.begin();
	    User u1 = s1.get(User.class,id);
	    s1.delete(u1);
	    tx.commit();
	}
	
	public User getUser(int id)
	{
		tx.begin();
		User u1 = s1.get(User.class,id);
		tx.commit();
		return u1;
	}
}










