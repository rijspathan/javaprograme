package com.test;
import java.util.*;
public class StdList {
	public static void main(String[] args) {
		//Set<Student>stdset=new TreeSet<Student>();
		//Sorting by custom mechanism
		Set<Student>stdset=new TreeSet<>(new NameComparator());
		stdset.add(new Student(101,"Kiran",50));	
		stdset.add(new Student(105,"swati",50));
		stdset.add(new Student(102,"Jyoti",58));
		stdset.add(new Student(103,"Manoj",96));
		stdset.add(new Student(101,"Kiran",50));//duplicate object
	Iterator<Student>i=stdset.iterator();
		while(i.hasNext())
		{
			Student s=i.next();
			System.out.println(s);
		}
	
		System.out.println("iterate by using foreach..");
		
		for(Student s:stdset)
		{
			System.out.println(s);
		}
		
		
		System.out.println("searching object by contains ..");
		if(stdset.contains(new Student(101,"Kiran",50)))
				{
			System.out.println("found");
				}
		else
			System.out.println("not found");
		
	}

}
