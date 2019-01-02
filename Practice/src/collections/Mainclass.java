package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       Vector a1 = new Vector();
       a1.add(20);
       a1.add(null);
       a1.add(40);
       a1.add(20);
       a1.add(3.2);
       
       for (int i = 0; i < a1.size(); i++) 
       {
		  System.out.println(a1.get(i));
	   }
	}
}
