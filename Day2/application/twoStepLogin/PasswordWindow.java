package com.miniproject.twoStepLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasswordWindow extends JFrame{
    
	public static void main(String[] args) {
		PasswordWindow obj1 = new PasswordWindow();
	}
	
    JButton blogin = new JButton("Submit");
	JPanel panel = new JPanel();
	JLabel password = new JLabel("Enter Password:");
	JPasswordField txtPassword = new JPasswordField(15);
	
	PasswordWindow(String email) {
		super("Password Verification");
		setSize(400, 300);
		setLocation(500, 280);
		setResizable(false);
		panel.setLayout(null);
		String str= "Welcome "+ " "+email;
		JLabel lblObj=new JLabel(str);
		lblObj.setBounds(40, 30, 500, 20);
		password.setBounds(40, 65, 100, 20);
		txtPassword.setBounds(155, 65, 150, 20);
		blogin.setBounds(160, 180, 80, 20);
		
        
        panel.add(lblObj);
        panel.add(blogin);
		panel.add(password);
		panel.add(txtPassword);
	    System.out.println("Email="+email);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		actionlogin(email);
	}

	public PasswordWindow() {
		// TODO Auto-generated constructor stub
	}

	public void actionlogin(final String mail) {
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String pwd = txtPassword.getText().toString();
				System.out.println("Email is="+mail);
				System.out.println("Password is="+pwd);
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				connection = ConnectionUtil.connectdb();

				String sql = "SELECT * FROM register WHERE email = ? and password = ?";

				try {
					preparedStatement = connection.prepareStatement(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					preparedStatement.setString(1, mail);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					preparedStatement.setString(2, pwd);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					resultSet = preparedStatement.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					if (resultSet.next()) {
     		            setVisible(false);
     		            dispose();
						AdminView adminViewObj=new AdminView();
					} else {
						JOptionPane.showMessageDialog(null, "Please enter correct Password");
						txtPassword.setText("");
						txtPassword.requestFocus();
					}
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}