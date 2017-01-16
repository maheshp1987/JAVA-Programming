package com.demo.calculator;
/*<applet code=demo.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.*;
public class Demo extends Applet{
	Button a,b,c,d;
	public void init()
	{
		GridLayout x;
		x=new GridLayout(2,2);
		setLayout(x);
		a=new Button("add");
		add(a);
		b=new Button("modify");
		add(b);
		c=new Button("save");
		add(c);
		d=new Button("cancel");
		add(d);
		
	}

}
