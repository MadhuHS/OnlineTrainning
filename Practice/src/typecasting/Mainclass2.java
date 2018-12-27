package typecasting;

class Superclass {
	int z1 = 23;

	public void view() {
		System.out.println("this is view() of Superclass");
	}
}

class Subclass extends Superclass {
	String str1 = "hello";

	public void count() {
		System.out.println("this is count() of Subclass");
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
        Subclass ref1 = new Subclass();
   
        Superclass ref2 = ref1;//upcasting
       
        System.out.println(ref2.z1);
        ref2.view();
        
        Subclass ref3 = (Subclass) ref2;//downcasting
        
        System.out.println(ref3.z1);
        ref3.view();
        System.out.println(ref3.str1);
        ref3.count();
	}
}




