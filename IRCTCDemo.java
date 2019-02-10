
abstract class IRCTC 
{
	public IRCTC()
	{
		System.out.println("Welcome to IRCTC Booking...");
	}
		
	public abstract  void getTicket(int p,float charges);
}

class AC extends IRCTC
{
	public AC()
	{
		//child constructor contains a first line calling to
		//super class constructor
		super();
		System.out.println("You selected AC Class :");
	}
	
	@Override
	public void getTicket(int p, float charges) {
		// TODO Auto-generated method stub
	float totalcharges=p*charges;
	
	System.out.println("pay your bill :"+totalcharges);
	System.out.println("Booked successfully");
	}
}
class General extends IRCTC
{
	public General()
	{
		System.out.println("You selected General class:");
	}
	@Override
	public void getTicket(int p, float charges) {
		// TODO Auto-generated method stub
		float totalcharges=p*charges;
		System.out.println("Booked successfully");
		System.out.println("pay Total bill :"+totalcharges);
	}
}

public class IRCTCDemo {

	public static void main(String[] args) {
		//implement it using menu driven way
		General a1=new General();
		a1.getTicket(5, 500);

	}

}
