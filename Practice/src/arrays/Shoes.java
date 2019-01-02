package arrays;

public class Shoes extends Object
{
	String brand;
	String color;
	double price;
	public Shoes(String brand, String color, double price) 
	{
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void showShoesDetails()
	{
	  System.out.println("Brand  : "+brand);
	  System.out.println("Color  : "+color);
	  System.out.println("Price  : "+price);
	}
	
	@Override
	public String toString() 
	{
	   String info = "Brand : "+brand+" Color :  "+color+" Price : "+price;	
	   return info;
	}
}
