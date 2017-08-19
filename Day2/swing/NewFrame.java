package com.miniproject.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewFrame extends JFrame{

    public static void main(String[] args){
        NewFrame frameTabel = new NewFrame();
    }
    JLabel welcome = new JLabel("******Welcome to MIT ******", 
            SwingConstants.CENTER);
    JLabel dms = new JLabel("Student Information Management System");
    JPanel panel = new JPanel();

    NewFrame(){
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