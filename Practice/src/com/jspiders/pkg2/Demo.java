package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;

public class Demo extends Sample
{
	public static void main(String[] args) 
	{
       Sample s1 = new Sample();
       
       System.out.println(s1.v1);
       s1.test1();
       
       Demo d1 = new Demo();
       d1.test2();
        
	}
}


