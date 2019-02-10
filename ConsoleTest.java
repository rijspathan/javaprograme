package com.ioopr;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console c=System.console();
		
		System.out.println("data :");
		String st=c.readLine();
		System.out.println("Enter number ");
		int n=Integer.parseInt(c.readLine());
		System.out.println(st+" "+n);
	}

}
