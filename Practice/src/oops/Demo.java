package oops;

class Sample
{
	static double z1 = 2.45;
	long k1 = 123456765433l;
	
	public static void display()
	{
		System.out.println("display() of Sample");
	}
	
	public void view()
	{
		System.out.println("view() of Sample");
	}
}

public class Demo 
{
	static int x1 = 10;//static data member
	int a1 = 234;//non static data member
	
	public static void test()//static func. member
	{
		System.out.println("test() executed");
	}
	
	public void count()//non-static func. member
	{
		System.out.println("count() executed");
	}
	
	public static void main(String[] args)
	{
       System.out.println(x1);
       test();
       
       System.out.println(Sample.z1);
       Sample.display();
       
       Demo ref1 = new Demo();
       System.out.println(ref1.a1);
       ref1.count();
       
       Sample ref2 = new Sample();
       System.out.println(ref2.k1);
       ref2.view();
       
	}
}




