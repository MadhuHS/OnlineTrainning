package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritting 
{
	public static void main(String[] args) 
	{
		File f1 = new File("‎⁨/⁨Users⁩/⁨Madhu⁩/Desktop/DemoFolder/Test.txt");
        try 
        {
			FileWriter fw = new FileWriter(f1);
			fw.write("this is file handling class");
			fw.flush();
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
	}
}
