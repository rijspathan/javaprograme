package SWINGTest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuDesign extends JFrame implements ActionListener{

	JMenuBar mb;
	JMenu color,shape;
	JMenuItem r,g,b,rect,cir;
	Color c;
	int s;
	public MenuDesign() {
		s=0;
		c=null;
		
		mb=new JMenuBar();
		
		color=new JMenu("Color");
		shape=new JMenu("Shape");
		
		r=new JMenuItem("REd");
		r.addActionListener(this);
		b=new JMenuItem("Blue");
		b.addActionListener(this);
		g=new JMenuItem("Green");
		g.addActionListener(this);
		
		cir=new JMenuItem("Circle");
		cir.addActionListener(this);
		rect=new JMenuItem("Rect");
		rect.addActionListener(this);
		
		color.add(r);
		color.add(g);
		color.add(b);
		
		shape.add(cir);
		shape.add(rect);
		
		mb.add(color);
		mb.add(shape);
		
		this.setJMenuBar(mb);
		
		this.setVisible(true);
		this.setSize(400, 400);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDesign();

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		super.paint(g);
		if(s==1)
		{
			g.setColor(c);
			g.drawRect(100, 100, 150, 100);
		}
		if(s==2){
			g.setColor(c);
			g.fillOval(100, 100, 100, 100);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==r)
		{
			c=JColorChooser.showDialog(this, "Select color", Color.red);
		}
		else if(e.getSource()==b)
			c=Color.blue;
		else if(e.getSource()==g)
			c=Color.green;
		else if(e.getSource()==rect)
		{
			s=1;
			repaint();
		}
		else{
			s=2;
			repaint();
		}
		
	}

}
