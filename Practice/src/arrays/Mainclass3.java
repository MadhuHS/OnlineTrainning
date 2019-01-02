package arrays;

public class Mainclass3 {
	public static void displayCartProds(Object[] cart) 
	{
		for (int i = 0; i < cart.length; i++) 
		{
			if (cart[i] instanceof Book) 
			{
				Book b1 = (Book) cart[i];
				b1.showBookDetails();
			}
			else
			{
				Shoes s1 = (Shoes) cart[i];
				s1.showShoesDetails();
			}
			
			System.out.println("-----------------");
		}
	}
	
	public static void showAllProdsDetails(Object[] cart)
	{
		for (int i = 0; i < cart.length; i++) 
		{
			System.out.println(cart[i].toString());
		}
	}

	public static void main(String[] args) {
		Object[] cart = new Object[6];
		cart[0] = new Book("Life is What You Make it", "Shenoy Preeti", 90);
		cart[1] = new Shoes("Nike", "blue", 1200);
		cart[2] = new Book("Everyone Has A Story ", "Savi Sharma", 125);
		cart[3] = new Shoes("Reebok", "red", 2000);
		cart[4] = new Book("Train to Pakistan ", "Singh Khushwant", 144);
		cart[5] = new Shoes("Puma","black", 1400);
		//displayCartProds(cart);
		showAllProdsDetails(cart);

	}
}
