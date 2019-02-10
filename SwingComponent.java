package SWINGTest;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingComponent extends JFrame implements ItemListener{
	JTabbedPane tab;
	JPanel p1,p2;
	JRadioButton r1,r2;
	JComboBox<String> cb1;
	JLabel l1,l2,l3;
	public SwingComponent() {
	
		p1=new JPanel();
		p2=new JPanel();
		
		l1=new JLabel("Select gender :");
		l2=new JLabel("Select City");
		l3=new JLabel();
		
		r1=new JRadioButton("Female");
		r2=new JRadioButton("Male");
		
		cb1=new JComboBox<>();
		cb1.addItem("Pune");
		cb1.addItem("Mumbai");
		cb1.addItem("Nagpur");
		cb1.addItemListener(this);
		
		
		p1.add(l1);
		p1.add(r1);
		p1.add(r2);
		
		p2.add(l2);
		p2.add(cb1);
		p2.add(l3);
		
		tab=new JTabbedPane();
		tab.addTab("Select Gender", p1);
		tab.addTab("Select city", p2);
		
		
		this.add(tab);
		
		this.setVisible(true);
		this.setSize(400, 400);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingComponent();

	}




	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()>1){
	System.out.println(e.getItem().toString());
		}
		
		
	}

}
