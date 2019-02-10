package com.test;
import java.util.Collections;
import java.util.HashSet;
public class StudentDemo {
	public static void main(String[] args) {
	HashSet<Integer> i=new HashSet<Integer>();
		i.add(10);		i.add(20);		i.add(30);		i.add(20);
		System.out.println(i);
		Student s=new Student(10, "ABC", 80);
		Student s1=new Student(20, "pBC", 80);
		Student s2=new Student(30, "hBC", 80);
		Student s3=new Student(30, "hBC", 80);
		HashSet<Student> std=new HashSet<Student>();
		std.add(s);		std.add(s1);		std.add(s1);		std.add(s2);
		std.add(s3);
		for(Student t:std)
		{			System.out.println(t);		}
	}

}
