package run;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.User;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		User u1 = new User();
		u1.setUserid(1);
		u1.setName("user1");
		
		//start hibernate and read configuration in hibernate.cfg.xml
		Configuration cfg = new Configuration();
		
		//load the configuration to hibernate 
		Configuration cfg2 = cfg.configure();
		
		//creates connection to db
		SessionFactory sf = cfg2.buildSessionFactory();
		
		//get the connection object to perform optn on db
		Session s1 = sf.openSession();
		
		 Transaction tx = s1.getTransaction();
		 tx.begin();
		 s1.save(u1);
		 tx.commit();
	}
}





