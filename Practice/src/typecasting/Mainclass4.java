package typecasting;

interface DemoInt
{
	public void display();
}

class Demo implements DemoInt
{
	@Override
	public void display() 
	{
	  System.out.println("Overriding display() in Demo class");
	}
}

abstract class Run 
{
	abstract public void test();
}

class Sample extends Run
{
    @Override
    public void test() 
    {
    	  System.out.println("Overriding test() in Sample");
    }	
}

public class Mainclass4
{
	public static void main(String[] args) 
	{
         Run r1 = new Sample();//upcasting
         r1.test();
         
         DemoInt d1 = new Demo();//upcasting
         d1.display();
      
	}
}





