package com.eventhandling;
/*<applet code=EventHand2.class  width=600 height=400>
</applet>
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHand2 extends Applet implements ActionListener{
Button cmdwelcome,cmdclear;
TextField txtmessage;
public void init(){
	txtmessage=new TextField(40);
	add(txtmessage);
	txtmessage.setEnabled(false);
	cmdwelcome=new Button("ENTER");
	this.add(cmdwelcome);
	cmdwelcome.addActionListener(this);
	cmdclear=new Button("CLEAR");
	add(cmdclear);
	cmdclear.addActionListener(this);
}//end init()

public void actionPerformed(ActionEvent e){
	if(e.getActionCommand()=="ENTER"){
		txtmessage.setText("Welcome in Event handling");
	}//end actionPerformed
	else if(e.getSource()==cmdclear){
		txtmessage.setText("");
	}
}
}
