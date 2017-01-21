package com.basics;

class A{
	A(){
		System.out.println("In A class");
	}
}

class B extends A{
	B(){
		System.out.println("In B class");
	}
}

class C extends B{
	C(){
		System.out.println("In C class");
	}
}

public class ConstructorTest {
	public static void main(String []a){
		System.out.println("Constructor Starts");
	   C c1=new C();
	   System.out.println("Constructor End");
}
}
