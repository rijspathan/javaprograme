
class Operation
{
	//varargs works for 0 to n number parameter length
	public int add(int... arr)
	{
		int s=0;
		 for(int n:arr)
		 {
			 s=s+n;
		 }
		 return s;
	}

}


public class VarArgsTest {

	public static void main(String[] args) {
		Operation o=new Operation();
		System.out.println("for 2 parmeters :"+o.add(10,30));
		System.out.println("for 5 parametrs :"+o.add(1,2,3,4,5));

	}

}
