package com.star;

public class ReverseString {
  public static void main(String args[]){
	  String s=new String("RAM");
	 
		   StringBuilder sb = new StringBuilder();
		   for(int i = s.length() - 1; i >= 0; --i){
		     sb.append(s.charAt(i));
		       }
		   System.out.println("The reverse string is ="+sb.toString());
		}
}
