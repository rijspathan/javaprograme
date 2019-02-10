
public class SingleTone {
	
	private static SingleTone obj=new SingleTone();
	
	private SingleTone()
	{
		
	}
	
	public static SingleTone getInstance()
	{
		return obj;
	}

}
