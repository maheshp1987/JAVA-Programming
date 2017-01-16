package com.assignments;
interface Car{
	void start();
	void stop();
}
class Demo
{
	void display(){
		System.out.println("Hello we are in Demo Class");
	}
}
public class MultipleInheritance extends Demo implements Car{
	public static void main(String[] args) {
		MultipleInheritance a=new MultipleInheritance();
		a.display();
		a.start();
		a.stop();
	}
	public void start(){
		System.out.println("Car is started");
	}
	public void stop(){
		System.out.println("Car is stopped");
	}
}
