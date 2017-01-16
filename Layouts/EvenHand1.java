package com.demo.calculator;
import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EvenHand1 extends Applet implements ActionListener {
Button b,b1;
public void init()
{
b=new Button("Enter");	
this.add(b);
b.addActionListener(this);
b1=new Button("Exit");
this.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{	showStatus("welcome we are starting Event Handling");}
if(e.getActionCommand()=="Exit")
{ showStatus("exit from program");}

}

}
