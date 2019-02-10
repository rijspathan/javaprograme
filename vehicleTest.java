
 class Vehicle
{
	//final variable
	final int speed=100;
public final void display()
{
	//final variable can't reinitialize
	//speed=150;
	
}
}

class Car extends Vehicle
{
	//display is a final method
	//so i can't override this
	/*@Override
	public void display() {
	System.out.println("Car display");
	}*/
}


public class vehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
