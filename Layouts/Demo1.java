package com.demo.calculator;
/*<applet code=demo.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.*;
public class Demo1 extends Applet {
	Button a,b,c,d,e;
	public void init()
	{
		BorderLayout x;
		x=new BorderLayout();
		setLayout(x);
		a=new Button("North");
		add(a,BorderLayout.NORTH);
		b=new Button("South");
		add(b,BorderLayout.SOUTH);
		c=new Button("East");
		add(c,BorderLayout.EAST);
		d=new Button("West");
		add(d,BorderLayout.WEST);
		e=new Button("Center");
		add(e,BorderLayout.CENTER);
	}

}
