package oops;

class Account
{
	int acnto;
    String owner;
    double bal;
    static String bankName = "ICICI";
    
    public Account(String a1,int b1)
    {
       owner = a1;
       acnto = b1;
    }
    
    public void deposit(int amt)
	{
		bal = bal + amt;
	}
    
    public void withdraw(int amt)
	{
		bal = bal + amt;
	}
    
    public void checkBal()
	{
		System.out.println(bal);
	}
    
    public void showDetails()
	{
    	    System.out.println(owner);
    	    System.out.println(acnto);
		System.out.println(bal);
		System.out.println(bankName);
	}
}
public class Mainclass 
{	
	public static void main(String[] args) 
	{
       Account a1 = new Account("Ajay",12345678);
       a1.showDetails();
       a1.deposit(1000);
       a1.showDetails();
	}
}





