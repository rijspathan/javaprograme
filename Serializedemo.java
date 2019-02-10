package com.ioopr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializedemo {

public static void main(String[] args) throws IOException, ClassNotFoundException {
FileOutputStream fout=new FileOutputStream("stddata.txt");
ObjectOutputStream o=new ObjectOutputStream(fout);
		
		Student s1=new Student(122,"Leena",85);
		Student s2=new Student(133,"Kiran",84);
		
		o.writeObject(s1);
		o.writeObject(s2);
		
		System.out.println("...Writing done..!!");
		o.close();
		
ObjectInputStream fin=new ObjectInputStream(new FileInputStream("stddata.txt")) ;
		Student s11=(Student)fin.readObject();
		Student s22=(Student)fin.readObject();
		System.out.println(s11);
		System.out.println(s22);
		System.out.println("...Reading done..!!");
		fin.close();
		
	}

}
