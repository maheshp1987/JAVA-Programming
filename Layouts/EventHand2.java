package com.demo.calculator;

/*<applet code=EventHand2.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventHand2 extends Applet implements ActionListener {
	Button a,b;
	TextField t;
	public void init()
	{
		t=new TextField(40);
		add(t);
		t.setEnabled(false);
		a=new Button("ENTER");
		this.add(a);
		a.addActionListener(this);
		b=new Button("CLEAR");
		this.add(b);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==a)
			t.setText("Welcome");
		else if(e.getSource()==b)
			t.setText("");
		
	}

}
