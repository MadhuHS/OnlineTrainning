package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Mainclass6 
{
	public static void main(String[] args)
	{
       LinkedHashMap hm1 = new LinkedHashMap();
       hm1.put("Miller",9876654321l);
       hm1.put("Adam",8976421230l);
       hm1.put("Ricky",9765456791l);
      
     
      Set keys = hm1.keySet();
      
      for (Object obj : keys) 
      {
          System.out.println("Key -> "+obj+" Value -> "+hm1.get(obj));
	  }
      
      
      
	}
}





