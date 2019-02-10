
public class StaticBlocktest {
static int x;

	static{
		x=50;
		System.out.println("Static block executed..");
		System.out.println("my initialized data :"+x);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method executed..!!");
		System.out.println("X inside main :"+x);
	}

}
