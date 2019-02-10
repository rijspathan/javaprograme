package com.ioopr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class ReadWrite
{
	RandomAccessFile rd;
	public void readFile(File f,String mode) throws IOException
	{
		rd=new RandomAccessFile(f, mode);
		/*String data=rd.readUTF();
		System.out.println(data);*/
		rd.seek(4);//seek the file of 4th position
		//and start reading by 4th position
		int i;
		while((i=rd.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		System.out.println(".....Reding completed....");
	}
	public void writeFile(File f,String mode) throws IOException
	{
		rd=new RandomAccessFile(f, mode);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data to write :");
		
		String data=sc.nextLine();
		rd.writeUTF(data);
		System.out.println("Writting done..!!");
	}
}
public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		ReadWrite rw=new ReadWrite();
		File f=new File("data.txt");
		//write opr
		rw.writeFile(f, "rw");
		//read opr
		rw.readFile(f, "r");
	}

}
