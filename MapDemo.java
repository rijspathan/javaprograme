package com.test;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> tlist=new HashMap<Integer,String>();
		tlist.put(1111, "Jaysh");		tlist.put(2222,"Preeti");
		tlist.put(3333, "John");		tlist.put(444, "Rohan");
		tlist.put(1111, "Jaysh");
		System.out.println("Size :"+tlist.size());
		if(tlist.containsKey(1111))
		{			System.out.println("Found");		}
		else
			System.out.println("Not found");
		//keyset()
		System.out.println("iterating using keyset()");
		Set<Integer>tkeys=tlist.keySet();
		for(Integer i:tkeys)
		{			int tno=i;
//map of get() method takes object key as parameter and return value			
System.out.println("Tele No :"+tno+" Name :"+tlist.get(tno));		}
	}
}
