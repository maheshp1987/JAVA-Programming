package com.star;

import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		 int number=0, reverse = 0;
          System.out.println("Enter the number to reverse");
	      Scanner sc = new Scanner(System.in);
	      number = sc.nextInt();
	 
	      while( number != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + number%10;
	          number = number/10;
	      }
	    System.out.println("Reverse of entered number is "+reverse);
        sc.close();
	}

}
