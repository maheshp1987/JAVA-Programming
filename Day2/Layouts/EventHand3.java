package com.demo.calculator;
/*<applet code=EventHand2.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHand3 extends Applet implements ActionListener{
Label msg;
Button a;
TextField t1,t2;
public void init()
{
msg=new Label("Enter the number");
add(msg);
t1=new TextField(10);
add(t1);
t2=new TextField(30);
add(t2);
t2.setEnabled(false);
a=new Button("EvenOddChecker");
this.add(a);
a.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==a)
{
int no;
String s=t1.getText();
no=Integer.parseInt(s);
if(no%2==0)
{
t2.setText(no+"is Even");	
}
else
{
	t2.setText(no+"is Odd");
}
}
}
}
