package com.exception;

public class CMDEvenOdd {
	public static void main(String[] args) {
		try{
		String s;
		s=args[0];
		
		int no;
		no=Integer.parseInt(s);
		
		if(no%2==0){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Please Run again & enter the command line input");
		}
		catch(NumberFormatException e1){
			e1.printStackTrace();
			System.out.println("Plese input only number");
		}

	}

}
