package threads;

class ResourceOne
{
	
}

class ResourceTwo
{
	
}


class TaskOne extends Thread 
{
	ResourceOne r1;
	ResourceTwo r2;
	
	public TaskOne(ResourceOne r1,ResourceTwo r2) 
	{
	   this.r1 = r1;
	   this.r2 = r2;
	}

	@Override
	public void run() 
	{
		System.out.println("t1 starts...");
		synchronized(r1)
		{
		    System.out.println("t1 locked r1");
			synchronized (r2)
			{
				System.out.println("t1 locked r2");
			}
		}
		
		System.out.println("t1 ends...");
	}
}

class TaskTwo extends Thread 
{
	
	ResourceOne r1;
	ResourceTwo r2;
	
	public TaskTwo(ResourceOne r1,ResourceTwo r2) 
	{
	   this.r1 = r1;
	   this.r2 = r2;
	}

	@Override
	public void run() 
	{
		System.out.println("t2 starts...");
		synchronized(r2)
		{
			System.out.println("t2 locked r2");
			synchronized (r1)
			{
				System.out.println("t2 locked r1");
			}
		}
		
		System.out.println("t2 ends...");
	}
}

public class Mainclass5 
{
	public static void main(String[] args)
	{
		ResourceOne res1 = new ResourceOne();
		ResourceTwo res2 = new ResourceTwo();
		
		TaskOne t1 = new TaskOne(res1, res2);
		TaskTwo t2 = new TaskTwo(res1, res2);
		
		t1.start();
		t2.start();

	}
}



