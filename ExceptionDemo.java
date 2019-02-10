package com;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		System.out.println("Application Starts......");
		int i=10;
		int j=5;
			try
			{
				int r=i/(j-5);
				System.out.println("Result : "+r);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		System.out.println("Applications End....");
	}

}
