package typecasting;

interface Card
{
	public void makePayment();
}

class CreditCard implements Card
{
	@Override
	public void makePayment() 
	{
	  System.out.println("payment done by Credit card");
	}
}

class DebitCard implements Card
{
	@Override
	public void makePayment() 
	{
	  System.out.println("payment done by Debit card");
	}
}

class SwipeMachine
{
	public void swipeCard(Card crd)//up-casting
	{
		crd.makePayment();
	}
}

public class Mainclass5 
{
   public static void main(String[] args)
   {
	  CreditCard c1 = new CreditCard();
	  DebitCard  c2 = new DebitCard();
	 
	  SwipeMachine sw = new SwipeMachine();
	  
	  sw.swipeCard(c1);
	  sw.swipeCard(c2);
   }
}