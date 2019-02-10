
public class Box {
	private int l,b,h;
	//default constructor
	public Box()
	{
		l=0;b=0;h=0;
	}
	
	//parameterized constructor
	public Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Length :"+l+" Bridth :"+b+" Height :"+h;
	}

}
