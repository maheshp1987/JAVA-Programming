package com.exception;

public class ArithmeticExDemo1 {

	public static void main(String[] args) {
		try{
			int x=5,y=0;
			int c=x/y;
			System.out.println("The result is="+c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("This is due to divide by zero");
		}

	}

}
