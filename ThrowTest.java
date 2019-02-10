package com;

public class ThrowTest {
	public static void main(String[] args) {
		System.out.println("Application started");
		int a=10,b=5;
		int d=b-5;
		try{
		if(d==0)
		{
		throw new ArithmeticException();
		}
		else
		{
			int div=a/d;
			System.out.println("Div :"+div);
		}
			try
			{
				throw  new Exception();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{System.out.println(e);}
		finally
		{
			System.out.println("This Block always Executed");
		}
		System.out.println("Done all operations..!!");
	}
}
