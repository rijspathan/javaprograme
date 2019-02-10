package com.ioopr;

import java.io.Serializable;

public class Student implements Serializable{
int rno;
String name;
transient float marks;
public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int rno,String name,float marks) {
	// TODO Auto-generated constructor stub
	this.rno=rno;
	this.name=name;
	this.marks=marks;
}

@Override
public String toString() {
	return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
}



}
