package com.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CapitalLetter {
public static void main(String[] agrs){
	System.out.println("Type some text and press Enter");
	String str="";
	int flag=1;
	InputStreamReader input=new InputStreamReader(System.in);
	BufferedReader reader=new BufferedReader(input);
	try{
		str=reader.readLine();
	}
	catch(Exception e){
		
	}
	char[] cArray=str.toCharArray();
	for(char c:cArray)
	{
		if(flag==1){
			System.out.print((char)(c-32));
			flag=0;
		}
		else{
			System.out.print(c);
		}
		if(c==' '){
			flag=1;
		}
	}
}
}
