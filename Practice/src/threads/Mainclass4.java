package threads;

class Counter// Thread safe class
{
	private int v1 = 0;

	public void increment() {
		v1++;
	}

	public void decrement() {
		v1--;
	}

	public void showValue() {
		System.out.println("v1 = " + v1);
	}
}

class Thread_TaskOne extends Thread {
	Counter c1;

	public Thread_TaskOne(Counter c1) {
		this.c1 = c1;
	}

	@Override
	public void run() {
		synchronized (c1) {
			c1.increment();
			c1.showValue();
		}
	}
}

class Thread_TaskTwo extends Thread 
{
	Counter c1;

	public Thread_TaskTwo(Counter c1) 
	{
		this.c1 = c1;
	}

	@Override
	public void run() 
	{
		synchronized (c1)
		{
			c1.decrement();
			c1.showValue();
		}
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Counter ctr = new Counter();

		Thread_TaskOne t1 = new Thread_TaskOne(ctr);
		Thread_TaskTwo t2 = new Thread_TaskTwo(ctr);


		t1.start();
		t2.start();

	}
}