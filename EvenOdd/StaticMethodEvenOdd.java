package com.evenodd;

public class StaticMethodEvenOdd {

	public static void main(String[] args) {
		
		String s=args[0];
		int no=Integer.parseInt(s);
        check(no);
	}//main end
	
	static void check(int no) {
		
		if(no%2==0){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}
	}//check() end

}
