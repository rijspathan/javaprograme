package awttest;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class MyLoginForm {

	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	MyLoginForm()
	{
		f=new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(null);
		
		l1=new Label("User NAme");
		l2= new Label("PAssword");
		
		t1=new TextField();
		t2=new TextField();
		
		b1=new Button("Login");
		b2=new Button("Reset");
		
		l1.setBounds(20,50,100,30);
		t1.setBounds(140,50,100,30);
		
		l2.setBounds(20,100,100,30);
		t2.setBounds(140,100,100,30);
		
		b1.setBounds(20,150,100,30);
		b2.setBounds(140,150,100,30);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e) {
				
	f.dispose();
	//System.exit(0);
			}
		});
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MyLoginForm();
	}

}
