package awttest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login {
Frame f;
Label l1,l2;
Button b1,b2;
TextField t1,t2;

public Login() {

	//component creation
	f=new Frame("Login");
	//disable the default layout
	f.setLayout(null);
	
	l1=new Label("Username :");
	l2=new Label("Password :");
	
	t1=new TextField();
	t2=new TextField();
	
	b1=new Button("Login");
	b2=new Button("Reset");
	
	//setting position of components
	l1.setBounds(20, 50, 100, 30);
	t1.setBounds(140, 50, 100, 30);
	
	l2.setBounds(20, 100, 100, 30);
	t2.setBounds(140, 100, 100, 30);
	
	b1.setBounds(20,150,100,30);
	b2.setBounds(140, 150, 100, 30);
	
	f.addWindowListener(new WindowAdapter(){ 
		@Override
		public void windowClosing(WindowEvent e) {
			
f.dispose();
//System.exit(0);
		}
	});
	
	//adding components into frame
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(b1);
	f.add(b2);
	
	//setting the size of frame
	f.setSize(350, 350);// TODO Auto-generated method stub
	//setting visibility of frame
	f.setVisible(true);
}






	public static void main(String[] args) {
		new Login();

	}

}
