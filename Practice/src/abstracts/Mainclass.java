package abstracts;

abstract class Account
{
	int x1 = 10;
	
	abstract public void withdraw();
	
	public void createAccount()
	{
		System.out.println("test() of Account");
	}
}

class Savings extends Account
{
	@Override
	public void withdraw()
	{
		System.out.println("withdraw of Savings");
		System.out.println(x1);
	}
}

class FixedDeposit extends Account
{
	@Override
	public void withdraw()
	{
		System.out.println("withdraw of FD");
	}
}
public class Mainclass 
{
	public static void main(String[] args) 
	{
		Account a1;
		Savings s1 = new Savings();
		s1.withdraw();
		s1.createAccount();
		System.out.println(s1.x1);
		
	}
}




