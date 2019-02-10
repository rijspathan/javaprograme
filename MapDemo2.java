package com.test;

import java.util.*;
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Student,Dept>smap=new HashMap<Student,Dept>();
		smap.put(new Student(1002,"Priya",95),new Dept(100,"CS"));
	smap.put(new Student(400,"Leena",85), new Dept(45,"It"));
		//iterating using entry set
		Set<Map.Entry<Student, Dept>>sset=smap.entrySet();
System.out.println("all Student details :");
		for(Map.Entry<Student, Dept>e:sset){
			Student s=e.getKey();
			Dept d=e.getValue();
			System.out.println("Student detail :"+s);
			System.out.println("Dept detail :"+d);
		}
	}}