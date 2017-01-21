package com.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Editor1 extends JFrame implements ActionListener
{
	JTextArea text;
	JMenuBar MB;
	JMenu FILE,EDIT;
	JMenuItem FILENEW,FILEOPEN,FILESAVE,FILEEXIT;
	JMenuItem EDITCOPY,EDITCUT,EDITPASTE;
	JFileChooser jf;
	boolean opened=false;
	String filename;
	public Editor1()
	{
		super("editor");
		text=new JTextArea(0,0);
		MB=new JMenuBar();
		FILE=new JMenu("File");
		EDIT=new JMenu("Edit");
		
		FILENEW=new JMenuItem("New");
		FILEOPEN=new JMenuItem("Open");
		FILESAVE=new JMenuItem("Save");
		FILEEXIT=new JMenuItem("Exit");
		
		EDITCOPY=new JMenuItem("Copy");
		EDITCUT=new JMenuItem("Cut");
		EDITPASTE=new JMenuItem("Paste");
		
		FILE.add(FILENEW);
		FILE.add(FILEOPEN);
		FILE.add(FILESAVE);
		FILE.add(FILEEXIT);
		
		EDIT.add(EDITCOPY);
		EDIT.add(EDITCUT);
		EDIT.add(EDITPASTE);
		
		MB.add(FILE);
		MB.add(EDIT);
		
		EDITCOPY.addActionListener(this);
		EDITCUT.addActionListener(this);
		EDITPASTE.addActionListener(this);
		
		FILENEW.addActionListener(this);
		FILEOPEN.addActionListener(this);
		FILESAVE.addActionListener(this);
		FILEEXIT.addActionListener(this);
		
		setJMenuBar(MB);
		setSize(600,600);
		add(text,BorderLayout.CENTER);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==FILE)
		{
			text.setText("");
			opened=false;
			
		}
		else if(e.getSource()==EDIT)
		{
			text.setText(null);
			jf=new JFileChooser();
			jf.showOpenDialog(new JPanel());
			filename=String.valueOf(jf.getSelectedFile());
			opened=true;
			String s;
			FileReader r;
			BufferedReader b;
			try
			{
				r=new FileReader(filename);
				b=new BufferedReader(r);
				while((s=b.readLine())!=null)
				{
					text.append(s);
					text.append("\n");
				}
				b.close();
				r.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
	     }
		else if(e.getSource()==FILESAVE)
		{
			if(opened==true)
			{
				try
				{
					FileWriter fw=new FileWriter(filename);
					fw.write(text.getText());
					fw.close();
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
			else
			{
				JFileChooser jfc=new JFileChooser();
				jfc.showSaveDialog(new JPanel());
				filename=String.valueOf(jfc.getSelectedFile());
				try
				{
					FileWriter fr=new FileWriter(filename);
					fr.write(text.getText());
					fr.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		}
	}
	public static void main (String[] args)
	{
		Editor1 y;
		y=new Editor1();
	}
	
}
