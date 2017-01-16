package com.mongodb.app1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class login_frm extends JFrame implements ActionListener
{

   String psw = "";
   String usr="";

   JLabel title = new JLabel(" Login Form ");
   
   JLabel lus = new JLabel("User Name ");
   JLabel pass = new JLabel("Password");
   
   JTextField tf = new JTextField(30);
   JPasswordField pwf = new JPasswordField(10);

   JButton sub = new JButton("SUBMIT");
   JButton can=new JButton("Exit");
   JTextField log = new JTextField(30);
    
    String cb[] = {"admin","mahesh","test" };
    String cbstatus;
   JComboBox clog = new JComboBox(cb);
   
   
   public login_frm()
   {
   	  super("Login Window");
   	  setVisible(true);
   	  setSize(800,500);
   	  setLocation(200,100);
                  
	   setLayout(null);      	
   	
   	
   	
   	//add(pwf);
   	Font f = new Font(" Times New Roman",Font.BOLD,30);
     title.setFont(f);
     title.setBounds(290,50,300,50);
     add(title);
     
      
      Font f1 = new Font("Arial",Font.BOLD,15);

    lus.setFont(f1);
    lus.setBounds(200,150,120,30);
  	add(lus);
    
    pass.setFont(f1);
   	pass.setBounds(200,200,120,30);
    add(pass);
   	
   	 clog.addActionListener(this);
   	 clog.setBounds(350,150,120,30);
   	 add(clog);
   	
        pwf.setBounds(350,200,120,30);
        pwf.setBackground (Color.yellow);
        
    add(pwf);
    
    tf.setBounds(500,200,120,30);
    //add(tf);
   	
   	sub.setFont(f1);
   	sub.addActionListener(this);
        sub.setBackground (Color.yellow);
    sub.setBounds(300,300,90,20);
    add(sub);
    
    can.setFont(f1);
    can.addActionListener(this);
    can.setBackground (Color.yellow);
    can.setBounds(450,300,90,20);

    add(can);

    pwf.setEchoChar('*');
 
    pwf.addKeyListener(new KeyAdapter() { public void keyReleased(KeyEvent e)
   	{
   				
   	}
   });
   }

   public void actionPerformed(ActionEvent e)
   {
	   JOptionPane.showMessageDialog(null, "Good BYE");

 		if(e.getSource() == sub)
 		{ 		

				
		psw = pwf.getText();
		usr = log.getText();

		int i ;

	      //for(i=0; i<ps.length; i++)
                      {
		if(psw.equals(ps[index]))
 		 		{
 		 		   JOptionPane.showMessageDialog(null,"Welcome Login Successfully");
 		 		    status = 1;
				 	this.dispose();

 		 		}

 		}
                        } //---------------------------------------------   End of for.

	        if(status == 0)
	        {
 		JOptionPane.showMessageDialog(null,"Please, Again,  Enter password.");
		pwf.setText("");
		log.setText("");
		 }

 		if(e.getSource()==can)
 		{
 			System.exit(0);
 		}

 	if(e.getSource() == clog)
	{
	      cbstatus = (String) clog.getSelectedItem();
	      index=clog.getSelectedIndex();
	      //JOptionPane.showMessageDialog(null,"Please - "+ index);
	}
   }

		int status=0, index;
		String us[] = {"admin","mahesh","test"};
		String ps[] = {"admin","mahesh","test"};

}
public class login
{
	 public static void main(String ar[])
	 {
	 	login_frm f = new login_frm();
	 	//f.show();
	 }
}
   

  
   
  

   
