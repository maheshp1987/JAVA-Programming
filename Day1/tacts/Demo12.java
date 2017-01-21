package com.tacts;

public class Demo12 {
public static void main(String a[]){
	int x = 5;
	int y = 10;
	x+= (++y) - (x--);
	System.out.println("x="+x+"   y="+y);
}
}
