package com.miniproject.login;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class Registration extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTextField text1,text2,text3,text4,text5;
JPasswordField pass1;
JLabel label1,label2,label3,label4,label5,label6;
JPanel panel;
JButton button;
Registration() {
text1=new JTextField(15);
text2=new JTextField(15);
text3=new JTextField(15);
pass1=new JPasswordField(15);
text4=new JTextField(15);
text5=new JTextField(15);
label1=new JLabel("First Name");
label2=new JLabel("Last Name");
label3=new JLabel("User Name");
label4=new JLabel("Password");
label5=new JLabel("Address");
label6=new JLabel("Phone No");
button=new JButton("Save");
panel=new JPanel(new GridLayout(7,2));
panel.add(label1);
panel.add(text1);
panel.add(label2);
panel.add(text2);
panel.add(label3);
panel.add(text3);
panel.add(label4);
panel.add(pass1);
panel.add(label5);
panel.add(text4);
panel.add(label6);
panel.add(text5);
panel.add(button);

button.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
String value1=text1.getText();
String value2=text2.getText();
String value3=text3.getText();
@SuppressWarnings("deprecation")
String value4=pass1.getText();
String value5=text4.getText();
String value6=text5.getText();

Connection con = null;
String url = "jdbc:mysql://localhost:3306/";;
String db = "test";
String driver = "com.mysql.jdbc.Driver";
String user = "root";
String pass = "root";
String user1="";
String pass1="";
try{
Class.forName(driver);
con = DriverManager.getConnection(url+db, user, pass);
Statement st = con.createStatement();

int k=st.executeUpdate("insert into login(firstname,lastname,username,password,address,contactno) values('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"','"+value6+"')");
JOptionPane.showMessageDialog(null,"Data is successfully saved");
}
catch(Exception e){}
}
});
add(panel);
setSize(300,400);
setVisible(true);
}
public static void main(String... args){
	Registration regObj=new Registration();
}
}