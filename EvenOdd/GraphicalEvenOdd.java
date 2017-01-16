package com.evenodd;

import javax.swing.JOptionPane;

public class GraphicalEvenOdd {

	public static void main(String[] args) {
	
		int no;
	    String input;
	//showInputDialog used to take input from user in Dialog format
	
	
    input=JOptionPane.showInputDialog(null,"Enter the number");
	no=Integer.parseInt(input);
	
	if(no%2==0){
		JOptionPane.showMessageDialog(null,no+" is Even");
	}
	else{
		JOptionPane.showMessageDialog(null,no+" is Odd");
	}
  }

}
