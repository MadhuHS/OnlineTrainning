package threads;

class Superclass
{
	
}

class ThreadOne extends Superclass implements Runnable 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) {
			System.out.println("task one");
		}
	}
	
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
       ThreadOne t1 = new ThreadOne();
       
       Thread th1 = new Thread(t1);
       th1.start();
	}
}




