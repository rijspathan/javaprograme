
public class String2Demo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Profound");
		sb.append(" Edutech");
		System.out.println(sb);
		
		System.out.println("Reverse :"+sb.reverse());
		
		sb.reverse();
		System.out.println("insert :"+sb.insert(5, "444"));
		
		
	}

}
