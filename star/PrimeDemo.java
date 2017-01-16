package com.star;

import java.util.Scanner;
class PrimeDemo
{
	public static void main(String args[])
	{		
		int n, i, res;
		boolean flag=true;
		//This line used for create obj of scanner 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter a No.");
		n=sc.nextInt();
		
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
		sc.close();
	}
}
      
