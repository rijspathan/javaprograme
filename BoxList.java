import java.util.Scanner;

public class BoxList {

	public static void main(String[] args) {
		/*Box b1=new Box();//default constructor called
		
		Box b2=new Box(10,20,30);//parameterized constructor called
		System.out.println(b1);
		System.out.println(b2);

		*/
		
		Scanner sc=new Scanner(System.in);
				
		//array of objects
		int size=3;
		//declaration
		Box barr[]=new Box[size];
		for(int i=0;i<barr.length;i++)
		{
			System.out.println("Enter length bridth and height :");
			int l=sc.nextInt();
			int b=sc.nextInt();
			int h=sc.nextInt();
			//every object will be initialized separately
			barr[i]=new Box(l,b,h);
		}
		
		System.out.println("--------My objects-----");
		for(int i=0;i<barr.length;i++)
		{
			System.out.println(barr[i]);
		}
		
	}

}
