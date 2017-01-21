package com.application;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calc1 extends Applet implements ActionListener{

	TextField result;
	boolean start=true;
	String operator="=";
	double argument=0;
	public void init()
	{
		setLayout(new BorderLayout());
		result=new TextField("0");
		add(result,BorderLayout.NORTH);
		Panel p=new Panel();
		p.setLayout(new GridLayout(5,4));
		String s="789/456*123-0=+";
		
		System.out.println(s.length());
		int i;
		for(i=0;i<s.length();i++)
		{
			createbuttons(p,s.substring(i,i+1));
		}
		createbuttons(p,"sin");
		createbuttons(p,"cos");
		createbuttons(p,"tan");
		createbuttons(p,"sqrt");
		add(p,BorderLayout.CENTER);
		
		
	}
	public void createbuttons(Panel c,String t)
	{
		Button b=new Button(t);
		c.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		char ch;
		String s=e.getActionCommand();
		ch=s.charAt(0);
		if(ch>='0'&&ch<='9'||ch=='.')
		{
			if(start==true)
			{
				result.setText(s);
			}
			else
			{
				result.setText(result.getText()+s);
				
			}
			start=false;
		}
		else
		{
			calculate(Double.parseDouble(result.getText()));
			operator=s;
			start=true;
		}
	}
	public void calculate(double n)
	{
		if(operator.equals("+"))
		{
			argument=argument+n;
		}
		else if(operator.equals("-"))
		{
			argument=argument-n;
			
		}
		else if(operator.equals("*"))
		{
			argument=argument*n;
		}
		else if(operator.equals("/"))
		{
			argument=argument/n;
		}
		else if(operator.equals("sin"))
		{
			argument=Math.sin(argument*3.14/180);
		}
		else if(operator.equals("cos"))
		{
			argument=Math.cos(argument*3.14/180);
		}
		else if(operator.equals("tan"))
		{
			argument=Math.tan(argument*3.14/180);
		}
		else if(operator.equals("sqrt"))
		{
			argument=Math.sqrt(argument);
		}
		else if(operator.equals("="))
		{
			argument=n;
		}
		result.setText(""+argument);
		
	}
	
	}
	
	


