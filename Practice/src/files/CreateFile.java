package files;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args) 
	{
		File f1 = new File("‎⁨/⁨Users⁩/⁨Madhu⁩/Desktop/DemoFolder/Test.txt");

		try {
			
			boolean b1 = f1.createNewFile();

			if (b1 == true) 
			{
				System.out.println("file created");
			} 
			else 
			{
				System.out.println("error in file creation");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
