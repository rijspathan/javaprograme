abstract class GraphicsObject
{
	//it contains abstract as well as non abstract methods
	//it has all types of members
	//private,public,protected,final,static
	public abstract void draw();//abstract method
	public void moveTo(int x,int y)//non abstract method
	{
		System.out.println("Moving shape at position :("+x+","+y+")");
	}
}
class Star extends GraphicsObject
{
	@Override
	public void draw() {
	System.out.println("drawing star************");
	}
}
class Rectangle extends GraphicsObject
{
	@Override
	public void draw() {
System.out.println("Drawing rectangle===========");
		
	}
}
class Circle extends GraphicsObject
{
	@Override
	public void draw() {
	System.out.println("Drawing circle OOOOOOOOOOOOO");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		GraphicsObject s1=new Circle();
		s1.draw();
		s1.moveTo(40, 50);
		
		GraphicsObject s2=new Star();
		s2.draw();
		s2.moveTo(50, 60);
		
		System.out.println("checking object types");
		System.out.println(s1 instanceof Circle);
		System.out.println(s1 instanceof Rectangle);
	}

}
