package com.miniproject.login;

import java.sql.*;
import javax.swing.*;

import com.miniproject.basic.ConnectionUtil;

import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Login frameTabel = new Login();
	}

	JButton blogin = new JButton("Login");
	JPanel panel = new JPanel();
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JTextField txtuser = new JTextField(15);
	JPasswordField pass = new JPasswordField(15);

	Login() {
		super("Login Authentication");
		setSize(400, 300);
		setLocation(500, 280);
		setResizable(false);
		panel.setLayout(null);

		username.setBounds(80, 65, 100, 20);
		password.setBounds(80, 110, 100, 20);
		txtuser.setBounds(155, 65, 150, 20);
		pass.setBounds(155, 110, 150, 20);
		blogin.setBounds(160, 180, 80, 20);

		panel.add(blogin);
		panel.add(username);
		panel.add(password);
		panel.add(txtuser);
		panel.add(pass);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		actionlogin();
	}

	public void actionlogin() {
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String email = txtuser.getText();
				String password = pass.getText().toString();
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
					preparedStatement.setString(1, email);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					preparedStatement.setString(2, password);
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
						JOptionPane.showMessageDialog(null, "Invalid Password / " + "Username");
						txtuser.setText("");
						pass.setText("");
						txtuser.requestFocus();
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