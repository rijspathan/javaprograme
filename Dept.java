package com.test;
public class Dept {
int id;
String name;
public Dept() {
	// TODO Auto-generated constructor stub
}
public Dept(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Dept [id=" + id + ", name=" + name + "]";
}

}
