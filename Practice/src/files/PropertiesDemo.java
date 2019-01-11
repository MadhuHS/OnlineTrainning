package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo 
{
	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		String us = s1.next();
		System.out.println(us);
		
		try 
		{
			FileReader fr = new FileReader("Demo.properties");
			Properties p1 = new Properties();
			p1.load(fr);
			
			String str = p1.getProperty("key1");
			System.out.println(str);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
