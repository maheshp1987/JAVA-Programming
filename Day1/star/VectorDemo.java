package com.star;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector list=new Vector();
		int len=args.length;
		for(int i=0;i<len;i++){
			list.addElement(args[i]);
		}
		int size=list.size();
		//create and define size of array
		String DemoArray[]=new String[size];
		//convert vector to array
		list.copyInto(DemoArray);
		System.out.println("List of Subjects");
		for(int i=0;i<len;i++){
			System.out.println(DemoArray[i]);
			
			
		}
     
	}

}
