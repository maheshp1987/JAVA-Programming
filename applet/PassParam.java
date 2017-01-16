package com.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class PassParam extends Applet{
	String message=null;
	public void init(){
		message=getParameter("msg");
		if(message==null){
			message="Sorry no parameter Found";
		}
	}
	public void paint (Graphics g)
	   {
	      g.drawString (message, 25, 50);
	   }
}
