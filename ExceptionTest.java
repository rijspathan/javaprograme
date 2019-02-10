package com;

import java.util.Scanner;
public class ExceptionTest 
{
	public static void main(String[] args) {
		System.out.println("Welcome to my Application...");
		String str=null;
		Scanner sc=new Scanner(System.in);
		int a=10,b=5;
		try{
			//null pointer exception
			System.out.println("Length :"+str.length());
		System.out.println("Enter index to read data :");
		int index=sc.nextInt();
		//ArrayindexoutofBounds exception
		System.out.println("Data :"+args[index]);
		//divide by zero exception
		int div=a/(b-5);
		System.out.println("Div :"+div);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Cant divide a number by zero");
		System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e){
			//it will print all details
			//like file name ,line number where exception occure
			e.printStackTrace();
		}
		System.out.println("Thank you..!!");
	}
}
