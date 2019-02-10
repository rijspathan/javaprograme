package com.ioopr;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/pepl/Desktop/DJTP/DataTest.java");
		
		FileInputStream fin=new FileInputStream(f);
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
