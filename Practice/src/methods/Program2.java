package methods;

public class Program2 
{
	public static double calcAvg(int n1,int n2,int n3)
	{
		   double sum = 0.0;
		   double avg = 0.0;
	       sum = n1+n2+n3;
	       avg = sum / 3;
	       return avg;
	}
	
	public static void main(String[] args) 
	{  
	   double avg1 = calcAvg(10,20,30);
       System.out.println(avg1 * 3);
       
       double avg2 = calcAvg(2,45,31);
       System.out.println(avg2/5);

	}

}



