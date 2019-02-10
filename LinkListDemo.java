package com.test;
import java.util.*;
public class LinkListDemo {
	public static void main(String[] args) {
		List<Dept> l=new LinkedList<Dept>();
		l.add(new Dept(10,"AAA"));
		l.add(new Dept(50,"BBB"));
		l.add(new Dept(40,"CCC"));
		l.add(new Dept(20,"DDD"));
		for(Dept d:l)
			System.out.println(d);
		l.remove(1);
		System.out.println("After Removing............");
		for(Dept d:l)
			System.out.println(d);
}
}
