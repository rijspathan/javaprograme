
public class ForEachTest {

	public static void main(String[] args) {
	int arr[]={10,20,30,40,50};
	
	
	//enhanced for loop or foreach
	System.out.println("Reading own array");
	for(int n:arr)
	{
		System.out.println("Data :"+n);
	}
	
	System.out.println("Reading command line args");
	for(String s:args)
	{
		System.out.println("arg :"+s);
	}

	}

}
