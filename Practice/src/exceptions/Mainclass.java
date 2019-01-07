package exceptions;

public class Mainclass 
{
	//called method 
	public static void test(int num) throws InterruptedException
	{
		System.out.println("Entering test()");

	    Thread.sleep(1000);

		System.out.println("Exit test()");
	}

	public static void main(String[] args)//calling method 
	{
		System.out.println("Program starts...");
		
		try 
		{
			test(0);
		} 
		catch (Exception e) 
		{
		  e.printStackTrace();
		}
		
		System.out.println("Program ends..");
	}
}




