package methods;

public class Program1 
{  
	public static void calcArea(int rad)// 
	{
		double area;
		area = 3.143 * rad * rad;
	    System.out.println(area);
	    return;
	}
	
	public static void main(String[] args) 
	{
      calcArea(4);
      calcArea(8);
      calcArea(2);
	}
}



