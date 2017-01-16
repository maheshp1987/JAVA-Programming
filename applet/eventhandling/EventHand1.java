package com.applet.eventhandling;
/*<applet code=EventHand1.class  width=600 height=400>
</applet>
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHand1 extends Applet implements ActionListener{
Button cmdwelcome;
public void init(){
	cmdwelcome=new Button("ENTER");
	this.add(cmdwelcome);
	cmdwelcome.addActionListener(this);
}//end init()

public void actionPerformed(ActionEvent e){
	if(e.getSource()==cmdwelcome){
		showStatus("Welcome in Event handling");
	}//end actionPerformed
}
}
