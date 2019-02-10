package com.test;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
		//make it generic to reduce runtime errors
	// jdk 1.5 provide autoBoxing
	list.add(50);//boxing done here
		list.add(20);
		list.add(70);
		list.add(80);
		list.add(150);
	System.out.println(list);
		Collections.sort(list);
		System.out.println("Size :"+list.size());
	if(list.contains(80))
		{
			System.out.println("Found");
		}
		else
			System.out.println("not found");
	System.out.println(list);
	list.remove(4);
		System.out.println(list);
		ListIterator<Integer>li=list.listIterator();
		System.out.println("Forward  traversing");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Backward traversing :");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
