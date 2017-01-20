package com.evenodd;

public class CMDEvenOdd {
	public static void main(String[] args) {
		
		String s;
		s=args[0];
		
		int no;
		no=Integer.parseInt(s);
		
		if(no%2==0){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}

	}

}
