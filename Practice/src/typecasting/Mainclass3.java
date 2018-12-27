package typecasting;

class SuperclassOne 
{
	public void view() 
	{
		System.out.println("this is view() of Superclass");
	}
}

class SubclassOne extends SuperclassOne 
{
	@Override
	public void view() 
	{
		System.out.println("this is view() of Subclass");
	}
}

public class Mainclass3 
{
	public static void main(String[] args) 
	{
        SuperclassOne ref1 = new SubclassOne();
        ref1.view();        
	}
}