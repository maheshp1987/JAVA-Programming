package com.miniproject.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestAssign extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		TestAssign frameTabel = new TestAssign();
	}

	JButton blogin = new JButton("Login");
	JPanel panel = new JPanel();
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JTextField txtuser = new JTextField(15);
	JPasswordField pass = new JPasswordField(15);

	TestAssign() {
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
				String paname = txtuser.getText();
				String ppaswd = pass.getText();
				if (paname.equals("admin") && ppaswd.equals("admin")) {
					NewFrame regFace = new NewFrame();
					regFace.setVisible(true);
					dispose();
				} else if (paname.equals("manager") && ppaswd.equals("4567")) {
					//ManagerFrame manager = new ManagerFrame();
					//manager.setVisible(true);
					//dispose();
				} else if (paname.equals("staff") && ppaswd.equals("7890")) {
					//EndUserFrame staff = new EndUserFrame();
					//staff.setVisible(true);
					//dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Password / " + "Username");
					txtuser.setText("");
					pass.setText("");
					txtuser.requestFocus();
				}
			}
		});
	}
}