
public interface Movable {
	//all data members are implicitly public static and final
	//it has all public and abstract methods
void move();
}
 interface bouncable extends Movable
{
	 void bounce();
	default void print()
	 {
		 System.out.println("default Method of Interface");
	 }
	static void show()
	{
		System.out.println("Static method in Interface");
	}
}
