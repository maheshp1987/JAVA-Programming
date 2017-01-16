package com.applet;
/*<applet code=DemoApplet2.class  width=600 height=400>
</applet>
*/
import java.applet.*;
import java.awt.*;

public class DemoApplet2 extends Applet
{
  public void paint (Graphics g)
  {
	  g.setColor(Color.RED);
	  setBackground(Color.YELLOW);
	  
	  Font y=new Font("Serif",Font.BOLD,22);
	  g.setFont(y);
     g.drawString ("Hello World", 25, 50);
  }
}