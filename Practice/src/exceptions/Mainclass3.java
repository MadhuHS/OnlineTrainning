package exceptions;

class Account {
	private int acntNo = 12345;// Global var
	private double bal = 0.0;

	public int getAcntNo() {
		return acntNo;
	}

	public void setBal(double amt) 
	{
		bal = amt;
	}

	public double getBal(int acntNo)// local var
	{
		if (this.acntNo == acntNo) {
			return bal;
		} else {
			return -777;
		}
	}
}

class Transaction 
{
	public void deposit(Account act, int amt) throws InvalidAmountException
	{
		if (amt > 0) 
		{
			int acntNo = act.getAcntNo();
			double bal = act.getBal(acntNo);
			bal = bal + amt;
			act.setBal(bal);
		} 
		else 
		{
			throw new InvalidAmountException();
		}
	}

	public void withdraw()
	{

	}
}

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		Transaction tx = new Transaction();
		
		try
		{
		    tx.deposit(a1,-1000);
		}
		catch(InvalidAmountException e)
		{
			e.printStackTrace();
		}
	}
}




