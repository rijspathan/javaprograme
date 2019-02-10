package SWINGTest;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class MovingDemo extends JFrame implements KeyListener{
	JLabel l1;

	public MovingDemo() {
	this.setLayout(null);
	
	l1=new JLabel("Moving Text");
	
	l1.setBounds(100, 150, 150, 50);
	
	this.add(l1);
	
	this.addKeyListener(this);
	
	this.setVisible(true);
	this.setSize(500, 500);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  MovingDemo();

	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			l1.setText("Moving up");
			l1.setBounds(l1.getX(),l1.getY()-5,150,50);
			
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			l1.setText("Moving down");
			l1.setBounds(l1.getX(), l1.getY()+5, 150,50);
		}
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
