package arrays;

public class Mainclass 
{
  public static void main(String[] args)
  {
     int[] marks = new int[5];
         
     marks[0] = 20;
     marks[1] = 22;
     marks[2] = 17;
     marks[3] = 13;
     marks[4] = 18;
     
     double sum2 = 0.0;
     
     for (int i = 0; i < marks.length; i++) 
     {
    	   sum2 = sum2 + marks[i];
	 }
      
     double avg2 = sum2 / marks.length;
     
     System.out.println(avg2);

  }
}





