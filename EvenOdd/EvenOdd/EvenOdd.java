package com.evenodd.demo;

public class EvenOdd {

	public static void main(String[] args) {
		
		int no=Integer.parseInt(args[0]);
		EvenOddChecker obj=new EvenOddChecker();
		obj.check(no);

	}

}
