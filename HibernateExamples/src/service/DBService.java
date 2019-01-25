package service;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.User;

public class DBService 
{
	   Configuration cfg1;
	   Configuration cfg2;
	   SessionFactory sf;
       Transaction tx;
 	   Session s1;
	   public void startDb() 
	   {
		   //start hibernate framework
		   cfg1 = new Configuration();  
		   
		   cfg2 = cfg1.configure();//read and load the config to hibernate
		   sf   = cfg2.buildSessionFactory();//built sessionfactory to get sessions
		   s1   = sf.openSession();
		   tx   = s1.getTransaction();
	   }
	   
	   public void addUser(User usr) throws SQLException
	   {
		   tx.begin();
		   s1.save(usr);
		   tx.commit();
		   System.out.println("user added");
	   }
	   
	   public User getUser(int id) throws SQLException
	   {
		   tx.begin();
		   User u1 = s1.get(User.class,id);
		   tx.commit();
		   return u1;
	   }
}







