import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r=new Random();
		
		for(int i=0;i<=10;i++)
		{
			int no=r.nextInt(100)+1;
			System.out.println(no);
		}

	}

}
