import java.util.Random;
import java.util.Scanner;

class Person
{
	int id;
	String name;
	public Person() {
		// TODO Auo-generated constructor stub
	}
	
	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :"+id+" Name :"+name;
	}
		
}

class Employee extends Person
{
	float salary;
	public Employee() {
		System.out.println("Employee obj created..");
	}
	
	public Employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :"+id+" Name :"+name+" Salary :"+salary;
	}
}

class Student extends Person 
{
	float marks;
	public Student() {
	System.out.println("Strudent obj created..");
	}
	
	public Student(int id,String name,float marks) {
		
		super(id,name);
		this.marks=marks;
	}
}

class Businessman extends Person
{
	String type;
	
	public Businessman() {
	System.out.println("Businessman constructor called");
	}
}

public class EMPTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Person arr[]=new Person[10];
	//for generating random numbers
		Random r=new Random();
	//to create 10 random objects	
		for(int i=0;i<arr.length;i++)
		{
			int rno=r.nextInt(3)+1;
			// it generates random numbers between 0 to 3
			if(rno==1)
			{
				System.out.println("Enter rollno name marks :");
				int rn=sc.nextInt();
				String name=sc.next();
				float marks=sc.nextFloat();
				
				arr[i]=new Student(rn,name,marks);
				
			}
			else if(rno==2)
			{
				arr[i]=new Employee();
			}
			else
				arr[i]=new Businessman();
			
			
		}
		//printing all objects
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
