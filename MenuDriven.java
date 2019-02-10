package com.test;
import java.util.*;
class Product{
	int id;	String name;	float price;
	public Product() {	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public float getPrice() {		return price;	}
	public void setPrice(float price) {		this.price = price;	}
}
public class MenuDriven {
	public static void main(String[] args) {
		List<Product>plist=new ArrayList<Product>();
		Product p1=new Product(101,"Soap",56);
		Product p2=new Product(102,"Oilcan",56);
		plist.add(p2);
		plist.add(p1);
		int ch;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter your choice:1.Add");
				System.out.println("2.remove element by index");
				System.out.println("3.Display all");
				System.out.println("4.search by name :");
				ch=sc.nextInt();
				switch(ch)
		{
		case 1:System.out.println("Enter product detail :[id name price]");
		int id=sc.nextInt();
		String name=sc.next();
		float price=sc.nextFloat();
		Product p=new Product(id,name,price);
		plist.add(p);
		System.out.println("Added ..!!");
		break;
		case 2:
			System.out.println("Enter index :");
			int ind=sc.nextInt();
			plist.remove(ind);
			System.out.println("removed..!@!");
		break;
		case 3:
			System.out.println("All Products ..:");
			System.out.println("ID   Name    Price");
			for(Product pr:plist)
			{
				System.out.println(pr.getId()+" "+pr.getName()+" "+pr.getPrice());
			}
			break;
		case 4:
			System.out.println("Enter product name that you want to search ::");
			String nm=sc.next();
			for(Product pr:plist)
			{
				if(nm.equals(pr.getName()))
				{ 
		System.out.println(pr.getId()+" "+pr.getName()+" "+pr.getPrice());
					break;
				}
			}
			break;
			default:
				System.out.println("Invalid choice..!");
		}
		System.out.println("");
		
		}while(ch<5);
	}
}