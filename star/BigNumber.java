package com.star;
import java.util.*;
class BigNumber
{
	public static void main(String args[])
	{		
		int n1, n2, n3, big;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter No 1: ");
		n1=sc.nextInt();
		System.out.println("Please Enter No 2: ");
		n2=sc.nextInt();
		System.out.println("Please Enter No 3: ");
		n3=sc.nextInt();
		if(n1>n2 && n1>n3)
			big=n1;
		else if(n2>n1 && n2>n3)
			big=n2;
		else
			big=n3;
		System.out.println("Biggest No: " + big);
		sc.close();
	}
}