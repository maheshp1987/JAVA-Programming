package com.demo.calculator;
/*<applet code=demo.class width=600 height=400></applet>*/
import java.applet.Applet;
import java.awt.*;
public class Demo2 extends Applet{
Label l;
TextField t;
public void init()
{
setLayout(null);
l=new Label("Enter the no.");
l.setBounds(75,75,100,20);
add(l);
t=new TextField(15);
t.setBounds(175,75,100,20);
add(t);
}
}
