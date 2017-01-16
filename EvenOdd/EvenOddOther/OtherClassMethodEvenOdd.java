package com.another;

public class OtherClassMethodEvenOdd {

	public static void main(String[] args) {
		
		String s=args[0];
		int no=Integer.parseInt(s);
		EvenOddChecker object=new EvenOddChecker();
		object.check(no);
	}

}
