package com.eventhandling;
/*<applet code=EventHand3.class  width=600 height=400>
</applet>
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHand3 extends Applet implements ActionListener{
	Label msg;
Button cmdcheck;
TextField txtno,txtresult;
public void init(){
	msg=new Label("Enter the Number=");
	add(msg);
	txtno=new TextField(10);
	add(txtno);
	txtresult=new TextField(10);
	add(txtresult);
	txtresult.setEnabled(false);
	cmdcheck=new Button("EVENODD Checker");
	this.add(cmdcheck);
	cmdcheck.addActionListener(this);
	
}//end init()

public void actionPerformed(ActionEvent e){
	if(e.getSource()==cmdcheck){
		int no;
		String s=txtno.getText();
		no=Integer.parseInt(s);
		if(no%2==0){
		txtresult.setText(no+" is even");
		}
		else{
		txtresult.setText(no+" is odd");
		}
	}//end actionPerformed
	
}
}
