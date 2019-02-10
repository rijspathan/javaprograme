package com.ioopr;

import java.io.*;

public class FileReadWriteDemo {

	public static void main(String[] args) throws IOException {
		
		File f=new File("abc.txt");
		System.out.println(f.exists());
		
		OutputStream fout=new FileOutputStream(f,true);
		//where first parameter is file name or file object
		//and second parameter is file opening in append mode
		
		String data="welcome to file operation..1!!";
		
		byte[]arr=data.getBytes();
		
		fout.write(arr);
		System.out.println("Write successfull");
		fout.close();
		
		InputStream fin=new FileInputStream(f);
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
			
			
			
		}

	}

}
