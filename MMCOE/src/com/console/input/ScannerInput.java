package com.console.input;

import java.util.Scanner;

class ScannerInput
{
 public static void main(String args[])
 {
     // Using Scanner for Getting Input from User
     @SuppressWarnings("resource")
	 Scanner in = new Scanner(System.in);
     System.out.print("Enter the String = ");
     String s = in.nextLine();
     System.out.println("You entered string "+s);

     System.out.print("Enter the Integer = ");
     int a = in.nextInt();
     System.out.println("You entered integer "+a);

     System.out.print("Enter the Float Number = ");
     float b = in.nextFloat();
     System.out.println("You entered float "+b);
 }
}