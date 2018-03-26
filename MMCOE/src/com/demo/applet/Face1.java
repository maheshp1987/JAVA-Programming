package com.demo.applet;
/*<applet code=Face1.class   width=800 height=800/>*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Face1 extends Applet
{
public void paint (Graphics g)
{
g. drawRect(100,100,500,500);
g.setColor(Color.red);
g.fillRect(200,200,100,50);
g.fillRect(400,200,100,50);
g.setColor(Color.blue);
int x[]={350,450,250};
int y[]={300,400,400};
g.fillPolygon(x,y,3);
g.setColor(Color.yellow);
g.fillOval(250,500,200,100);
}
}
