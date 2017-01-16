package com.basic;

public class TypeCastExample {
	public static void main(String arg[])
{   String str="37";
    int i=Integer.parseInt(str);
    System.out.println("The String to Number is="+i);
    float val=99.9f;
    int number=(int) val;
    System.out.println("The number is "+number);
    float no=(float)number;
    System.out.println("The float number="+no);
}
}