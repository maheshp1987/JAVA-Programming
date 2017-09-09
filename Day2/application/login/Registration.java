package com.miniproject.login;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.io.IOException;

class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField text1, text2, text3, text4, text5;
	JPasswordField pass1;
	JLabel lblFrmName;
	JLabel label1, label2, label3, label4, label5, label6;
	JPanel panel;
	JButton button, cmdCancel;

	Registration() throws IOException {
		panel = new JPanel();
		panel.setLayout(null);
		
		text1 = new JTextField(15);
		text2 = new JTextField(15);
		text3 = new JTextField(15);
		pass1 = new JPasswordField(15);
		text4 = new JTextField(15);
		text5 = new JTextField(15);
		lblFrmName = new JLabel("SignUp Form / Create New Account");
		
		label1 = new JLabel("First Name*");
		label1.setBounds(10,30,0,0);
		label2 = new JLabel("Last Name*");
		label3 = new JLabel("Email ID *");
		label4 = new JLabel("Password*");
		label5 = new JLabel("Address*");
		label6 = new JLabel("Mobile Number*");
		button = new JButton("SignUp");
		cmdCancel = new JButton("Cancel");
		
		
		lblFrmName.setBounds(35,10,210,20);
		panel.add(lblFrmName);
		panel.add(label1);
		label1.setBounds(200,30,100,20);
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
		panel.add(cmdCancel);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String value1 = text1.getText();
				String value2 = text2.getText();
				String value3 = text3.getText();
				@SuppressWarnings("deprecation")
				String value4 = pass1.getText().toString();
				String value5 = text4.getText();
				String value6 = text5.getText();

				Connection con = null;
				String url = "jdbc:mysql://localhost:3306/";
				;
				String db = "miniproject";
				String driver = "com.mysql.jdbc.Driver";
				String user = "root";
				String pass = "root";
				String user1 = "";
				String pass1 = "";
				try {
					Class.forName(driver);
					con = DriverManager.getConnection(url + db, user, pass);
					Statement st = con.createStatement();

					int k = st.executeUpdate(
							"insert into register(firstName,lastName,email,password,address,mobile) values('" + value1
									+ "','" + value2 + "','" + value3 + "','" + value4 + "','" + value5 + "','" + value6
									+ "')");
					JOptionPane.showMessageDialog(null, "Data is successfully saved");
				} catch (Exception e) {
				}
			}
		});
		add(panel);
		setSize(500, 800);
		setVisible(true);
	}

	public static void main(String... args) throws IOException {
		Registration regObj = new Registration();
		regObj.setBounds(533, 90, 300, 500);
		regObj.setResizable(true);
		regObj.setVisible(true);
	}
}