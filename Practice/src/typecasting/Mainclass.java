package typecasting;

public class Mainclass 
{
	public static void main(String[] args) 
	{
      int i1 = 20;
      double  d1 = i1;//widening
      
      System.out.println(i1);
      System.out.println(d1);
      
      double d2 = 34.67;
      int    i2 = (int) d2;// (datatype)var/value--> casting stmnt
                           //narrowing
      System.out.println(i2);
      System.out.println(d2);
      
      float f1 = 21.45f;
      long  ln =(long) f1;
      
      System.out.println(f1);
      System.out.println(ln);
      
      char c1 = 'A';
      int  i3 = c1;
      
      System.out.println(c1);
      System.out.println(i3);
      
      int i4 = 77;
      char c2 = (char)i4;
      System.out.println(i4);
      System.out.println(c2);
      
	}
}





