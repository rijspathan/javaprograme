package com;
import java.io.*;
class TDemo
{
	 public TDemo()
	{
		try(FileInputStream fis=new FileInputStream("f1.txt");
		FileOutputStream fos=new  FileOutputStream("f1.txt"))    		
		{
			String s="Java is developed by James Gosling";
			fos.write(s.getBytes());
			DataInputStream dis=new DataInputStream(fis);
			int i;
			while((i=dis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
public class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TDemo  t=new TDemo();

	}

}
