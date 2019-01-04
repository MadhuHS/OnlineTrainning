package exceptions;

public class Mainclass 
{
	public static void test(int num) 
	{
		System.out.println("Entering test()");
		int[] a1 = new int[3];
		a1[0] = 20;
		try
		{
		  int res = 50 / num;
		  System.out.println("res = " + res);
		  System.out.println(a1[num]);
		}
		catch(Exception ae)
		{
            ae.printStackTrace();
		}
		
		System.out.println("Exit test()");
	}
	
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
	   test(10);
	   System.out.println("Program ends..");
	}
}





