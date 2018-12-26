package oops;

public class Strings 
{
	public static void main(String[] args) 
	{
		String s1 = "jspiders";
		String s2 = "JSPIDERS";
		String s3 = new String("jspiders");
		
		String strUp = s1.toUpperCase();
		String strLow = s2.toLowerCase();
		System.out.println(s1);
		System.out.println(strUp);
		
		System.out.println(s2);
		System.out.println(strLow);
		
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);//compares address
		System.out.println(s1.equals(s3));//compare char of strings
	
	    String n1 = "100";
	    String n2 = "100";
	    
	    String n3 = "2.5";
	    String n4 = "2.5";
	    
	    System.out.println(n1+n2);
	    
	    int i1 = Integer.parseInt(n1);
	    int i2 = Integer.parseInt(n2);
	    int res = i1+i2;
	    
	    double d1 = Double.parseDouble(n3);
	    double d2 = Double.parseDouble(n4);
	    double res2 = d1+d2;
	    
	    System.out.println(res);
	    System.out.println(res2);
	    
	    String str = String.valueOf(res);
	    System.out.println(str);
	    
	
	}
}




