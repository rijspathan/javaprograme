




public class SingleToneTest {

	public static void main(String[] args) {
		SingleTone o1=SingleTone.getInstance();
		SingleTone o2=SingleTone.getInstance();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());

	}

}
