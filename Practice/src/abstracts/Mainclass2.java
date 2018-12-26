package abstracts;

interface Run1
{
     int num = 100;
	 public void test();
}

interface Run2 extends Run1
{
     int num = 100;
	 public void display();
}

class Sample implements Run2
{
	@Override
	public void test() 
	{
	  System.out.println("overriding test() in Sample");
	}
	
	@Override
	public void display() 
	{
	  System.out.println("overriding display() in Sample");
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
       Sample s1 = new Sample();
       s1.display();
       s1.test();
	}
}
