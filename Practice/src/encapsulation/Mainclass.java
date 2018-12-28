package encapsulation;

class Account 
{
	int acntNo = 12345234;
	double bal = 0.0;

	public Account(double bal) 
	{
		this.bal = bal;
	}
}

public class Mainclass
{
   public static void main(String[] args) 
   {
	 Account a1 = new Account(-5000);
	 a1.bal = -2000;
	 System.out.println(a1.bal);
   }	
}


