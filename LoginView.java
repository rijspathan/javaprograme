package SWINGTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginView extends JFrame implements ActionListener{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2;

	public LoginView() {
	
		//set layout manager
		this.setLayout(new GridLayout(4,2,10,10));
		
		//create all components
		l1=new JLabel("Username :");
		l2=new JLabel("Password :");
		l3=new JLabel();
		
		t1=new JTextField();
		t2=new JTextField();
		
		b1=new JButton("Login");
		b2=new JButton("Reset");
		
		this.add(l1);
		this.add(t1);
		
		this.add(l2);
		this.add(t2);
		
		//event handling
		//register event sources with respective listener
		this.add(b1);
		b1.addActionListener(this);
		this.add(b2);
		b2.addActionListener(this);
		this.add(l3);
		
		
		
		setVisible(true);
		setSize(350, 350);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button clicked");
		if(e.getSource()==b1)
		{
if(t1.getText().equals("profound")&& t2.getText().equals("123"))
			{
				l3.setText("Welcome "+t1.getText());
			}
			else
			{
				l3.setText("Invalid user.!!");
			}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
	}

	public static void main(String[] args) {
		
new LoginView();
	}

}
