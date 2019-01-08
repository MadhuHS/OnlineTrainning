package threads;

class Thread_One extends Thread 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 8; i++) 
		{
			if(i==2)
			{
				try 
				{
					System.out.println("t1 going to sleep state");
					Thread.sleep(3000);
					System.out.println("t1 coming back from sleep state");
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else
			{	
			System.out.println("task one");
			}
		}
	}
}

class Thread_Two extends Thread
{
	@Override
	public void run() {
		for (int j = 1; j <= 3; j++) {
			System.out.println("task two");
		}
	}
}

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		Thread_One t1 = new Thread_One();
		Thread_Two t2 = new Thread_Two();
		
		t1.setPriority(8);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		
	}
}