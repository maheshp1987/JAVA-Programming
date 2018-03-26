package com.console.input;

import java.util.Scanner;

public class UserInputEvenOdd {

	public static void main(String[] args) {
      
		int no;
		Scanner sc=new Scanner(System.in);
      
		System.out.print("Enter the Number= ");
		no=sc.nextInt();
		
		if(no%2==0){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}
	}

}
