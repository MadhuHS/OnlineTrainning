package collections;

import java.util.ArrayList;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
	  double sum = 0.0 ,avg = 0.0;
	  ArrayList<Student> slist = new ArrayList<Student>();
      slist.add(new Student("Smith",123,23));
      slist.add(new Student("Blake",342,18));
      slist.add(new Student("Martin",721,16));
      
      for (int i = 0; i < slist.size(); i++) 
      {
    	    //Student s1 = (Student)slist.get(i);
    	  	sum = slist.get(i).marks + sum;
    	  	System.out.println("adding marks of "+slist.get(i).name);
	  }
      avg = sum / slist.size(); 
      System.out.println(avg);
      
      
	}
}
