package exceptions;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
      System.out.println("Program starts...");
      
       try 
       {
		Thread.sleep(2000);
	   } 
       catch (InterruptedException e) 
       {
		e.printStackTrace();
	   }
      
      System.out.println("Program ends...");
	}

}
