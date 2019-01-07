package threads;

class TaskOneThread extends Thread 
{
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("task one");
		}
	}
}

class TaskTwoThread extends Thread {
	@Override
	public void run() {
		for (int j = 1; j <= 3; j++) {
			System.out.println("task two");
		}
	}
}

public class Mainclass {
	public static void main(String[] args) {
		System.out.println("Main starts...");

		TaskOneThread t1 = new TaskOneThread();
		t1.start();

		TaskTwoThread t2 = new TaskTwoThread();
		t2.start();

		System.out.println("Main ends...");

	}
}
