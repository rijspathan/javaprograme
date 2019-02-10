
public class StaticTest {

	//class variable or static variable
	static int x;
	
	//instace variable
	int y;
	
	public static void greet()
	{
		System.out.println("Hello friends..!!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest s=new StaticTest();
		s.y=50;
		
		x=10;
		System.out.println("X= "+x);
		System.out.println("y ="+s.y);
		greet();
	}

}
