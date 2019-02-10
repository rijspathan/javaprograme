import java.util.Scanner;

public class ArrDemo {

	public static void main(String[] args) {
		String starr[]=new String[5];
		//String starr1[]={"a","b","c"};
		
		System.out.println("Enter 5 string objects ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<starr.length;i++)
		{
			starr[i]=sc.next();
		}
		
		for(String s:starr)
		{
			StringBuffer sb=new StringBuffer(s);
			System.out.println(sb.reverse());
		}
		sc.close();

	}

}
