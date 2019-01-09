package files;

import java.io.File;

public class CreateFolder 
{
	public static void main(String[] args) 
	{
       File f1 = new File("‎⁨/⁨Users⁩/⁨Madhu⁩/Desktop/DemoFolder⁩"); 
       
       boolean b1 = f1.mkdirs();
       
       if(b1 == true)
       {
    	     System.out.println("folder created");
       }
       else
       {
    	     System.out.println("error in folder creation");
       }
	}
}



