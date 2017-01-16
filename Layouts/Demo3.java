package com.demo.calculator;
/*<applet code=demo.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.*;

public class Demo3 extends Applet {
	private Panel p1;
	private Panel p2;
	private Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
	public void init()
	{
		p1=new Panel();
		GridLayout a;
		a=new GridLayout(2,2,5,5);
		p1.setLayout(a);
		l1=new Label("rollNo");
		p1.add(l1);
		t1=new TextField();
		p1.add(t1);
		l2=new Label("name");
		p1.add(l2);
		t2=new TextField();
		p1.add(t2);
		
		p2=new Panel();
		GridLayout b;
		b=new GridLayout(1,2);
		p2.setLayout(b);
		
		b1=new Button("Save");
		p2.add(b1);
		b2=new Button("Cancel");
		p2.add(b2);
		
		BorderLayout z;
		z=new BorderLayout();
		setLayout(z);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		
	}
	

}
