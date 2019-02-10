
public class Arith {
	//function overloading
	//we have two or more functions having same name but diff
	//signature(no. of parameters or types of parameters) 
	public int add(int x,int y)
	{
		return x+y;
	}
	
	public float add(float x,float y)
	{
		return x+y;
	}

	public int add(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) {
	
		Arith a1=new Arith();
		int x=10,y=20,z=50;
		float f1=10.5f;
		float f2=20.60f;
		
		System.out.println("Add of 2:"+a1.add(x, y));
		
		System.out.println("Add of 3num :"+a1.add(x, y, z));
		
		System.out.println("Add of float data :"+a1.add(f1, f2));
		
	}
//try to overload main method
}
