package com.test;

import java.util.Comparator;
//decides custom ordering of elements

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

}
