class Toys
{
	public void play()
	{
		System.out.println("Playing toy..!!");
	}
}
//multiple inheritance in java
class Ball extends Toys implements bouncable
{
	public void move() {
		System.out.println("Moving Ball..!!!!");
	}
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Bouncing Ball");
}
}

public class MultipleInheritanceDemo {
public static void main(String[] args) {
		Ball b1=new Ball();
		b1.move();
		b1.play();
		b1.bounce();
		b1.print();
	}
}
