package inheritance;

class Superclass extends Object
{
	int x1 = 100;
	
	public void display()
	{
	  System.out.println("this is display() of Superclass");	
	}
}
class Subclass extends Superclass
{
	int x1 = 234;
	
	@Override
	public void display()
	{
	  System.out.println("this is display() of Subclass");	
	}
	
	public void test()
	{
		System.out.println("this is test() of Subclass");
		System.out.println("x1 = "+x1);
		System.out.println("x1 = "+super.x1);
		
		display();
		super.display();
	}
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Subclass ref1 = new Subclass();
		ref1.test();
	}
}



