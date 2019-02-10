import java.util.Scanner;

class Box
{
	 int length,bridth,height;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBridth() {
		return bridth;
	}

	public void setBridth(int bridth) {
		this.bridth = bridth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double volume(){
		return length*bridth*height;
	}
	
	//it is used to print string representation of object
	//when we print the objects JVM implicitly calls the toString()
	@Override
	public String toString() {
		
		return length+" "+bridth+" "+height;
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		//it is used to read user input from console
		//it is belongs to java.util.Scanner
		
		Scanner sc=new Scanner(System.in);
		
		Box b1=new Box();
		Box b2=new Box();
		
//changing the state of object using setters
		b1.setBridth(2);
		b1.setHeight(5);
		b1.setLength(5);
		
		System.out.println("Enter length :");
		//primitive data type specific methods
		//sc.nextFloat(),sc.next(),sc.nextDouble()
		//sc.nextByte(),sc.nextLong(),sc.nextLine()
		int l=sc.nextInt();
		System.out.println("Enter bridth and height :");
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		b2.setBridth(b);
		b2.setHeight(h);
		b2.setLength(l);
		
		System.out.println("My objects :");
		System.out.println(b2);
		System.out.println(b1);
		System.out.println("volume of b1:"+b1.volume());
		
		System.out.println("Volume of b2 :"+b2.volume());
		System.out.println(b1 instanceof Box);

	}

}
