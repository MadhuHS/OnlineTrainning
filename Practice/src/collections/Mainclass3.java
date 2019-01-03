package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
      TreeSet<Integer> h1 = new TreeSet<Integer>();
      h1.add(40);
      h1.add(10);
      h1.add(60);
      h1.add(30);
      h1.add(10);
      h1.add(50);
      h1.add(20);
          
   
      double sum = 0.0;
      
      for(Integer i : h1) 
      {
    	    if(i != null)
    	    {
    	    	 System.out.println(i);
		 sum = sum + i;
    	    }
      }
      
      System.out.println(sum);
      
      double sum1 = 0;
     
     Iterator<Integer> itr =  h1.iterator();
     
     while(itr.hasNext())
     {
    	    Integer int1 = itr.next();
    	    System.out.println(int1);
   		sum1 = sum1 + int1;
     }
     
     System.out.println(sum1);
	}
}



