package arrays;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
	  double sum = 0.0 ,avg = 0.0;
	  Student[] slist = new Student[3];
      slist[0] = new Student("Smith",123,23);
      slist[1] = new Student("Blake",342,18);
      slist[2] = new Student("Martin",721,16);
      
      for (int i = 0; i < slist.length; i++) 
      {
    	  	sum = slist[i].marks + sum;
    	  	System.out.println("adding marks of "+slist[i].name);
	  }
      avg = sum / slist.length; 
      System.out.println(avg);
      
      
	}
}
