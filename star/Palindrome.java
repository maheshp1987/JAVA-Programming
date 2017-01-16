package com.star;

public class Palindrome {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("RAM");
		StringBuffer sb1=new StringBuffer(s);
		sb1.reverse();
		   		
		String str1=s.toString();
		String str2=sb1.toString();
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}

	}

}
