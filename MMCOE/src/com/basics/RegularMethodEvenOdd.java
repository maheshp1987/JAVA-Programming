package com.basics;

public class RegularMethodEvenOdd {

	public static void main(String[] args) {
		String s=args[0];
		int no=Integer.parseInt(s);
        RegularMethodEvenOdd object=new RegularMethodEvenOdd();
		object.check(no);
	}
	
    void check(int no) {
		if(no%2==0){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}
	}//check() end
}
