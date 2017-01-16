package com.exception;

import java.io.IOException;

public class DemoThrow {

	public static void main(String[] args) {
		DemoThrow obj=new DemoThrow();
		obj.display();
	}
	
	void display()
	{
		try{
			throw new IOException("Explicit IOException created by user");
		}
		catch(IOException e){
			System.out.println("Exception is "+e);
		}
	}

}
