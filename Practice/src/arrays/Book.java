package arrays;

public class Book extends Object {
	String title;
	String author;
	double price;

	public Book(String title, String author, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void showBookDetails()
	{
	  System.out.println("Title  : "+title);
	  System.out.println("Author : "+author);
	  System.out.println("Price  : "+price);
	}
	
	@Override
	public String toString() 
	{
	   String info = "Title : "+title+" Author : "+author+" Price : "+price;	
	   return info;
	}

}
