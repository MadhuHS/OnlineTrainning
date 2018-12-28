package com.jspiders.pkg1;

public class Sample 
{
	public int v1 = 10;

	public void test1() 
	{
		System.out.println("public-test1() of Sample in pkg1");
	}
	
	protected void test2() 
	{
		System.out.println("protected-test2() of Sample in pkg1");
	}
	
	void test3() 
	{
		System.out.println("pkg-level-test3() of Sample in pkg1");
	}
	
	private void test4() 
	{
		System.out.println("private-test4() of Sample in pkg1");
	}

	public static void main(String[] args) 
	{
       Sample s1 = new Sample();
       s1.test1();
       s1.test2();
       s1.test3();
       s1.test4();
	}
}



