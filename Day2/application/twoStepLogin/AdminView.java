package com.miniproject.twoStepLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminView extends JFrame{

    public static void main(String[] args){
        AdminView frameTabel = new AdminView();
    }
    JLabel welcome = new JLabel("******Welcome to My World ******", 
            SwingConstants.CENTER);
    JLabel dms = new JLabel("Student Information Management System");
    JPanel panel = new JPanel();

    AdminView(){
        super("Welcome!");
        setSize(400,300);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        welcome.setBounds(60, 70, 300, 60);
        dms.setBounds(125, 100, 300, 60);

        panel.add(welcome);
        panel.add(dms);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}