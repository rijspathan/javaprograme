package com;
class VoterApp
{
	public void voteHere(int age)throws InvalidAgeException
	{
		if(age<18)
		{
	throw new InvalidAgeException("Age below 18 not allowed..!!   You can vote after completing 18");
		}
		else
		{
			System.out.println("Vote successfull..!!");
		}
	}
}
public class VoterAppDemo {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Voting at Maharashtra..!!");	
		int age=15;
		VoterApp v=new VoterApp();
		try
		{
			v.voteHere(age);
		} catch (InvalidAgeException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("it always executed..!!");
			System.out.println("closing files and connections");
		}
		System.out.println("Thank you !!!..");
	}

}
