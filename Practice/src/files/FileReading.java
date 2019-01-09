package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) 
	{
		File f1 = new File("‎⁨/⁨Users⁩/⁨Madhu⁩/Desktop/DemoFolder/Test.txt");
        try 
        {
			FileReader fr = new FileReader(f1);
			int len = (int)f1.length();
			char[] c1 = new char[len];
			fr.read(c1);
			System.out.println(c1);
			String str = String.valueOf(c1);
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
