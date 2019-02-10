

public class StringTest {

	public static void main(String[] args) {
		String s1="Profound";
		String s2=s1.concat(" Edutech");
		System.out.println(s1);
		System.out.println("after concatenation :"+s2);
		System.out.println("uppercase :"+s2.toUpperCase());
		System.out.println("LowerCase :"+s2.toLowerCase());
		System.out.println("Substring :"+s2.substring(7));
		String s3="I like java very much";
		//String arr[]=s3.split("\\s");
		String arr[]=s3.split("\\s",4);
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
