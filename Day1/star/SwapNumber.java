package com.star;
import java.util.Scanner;

class SwapNumber
{
   public static void main(String args[])
   {
      int x, y;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter x=");
      x = sc.nextInt();
      System.out.println("Enter y=");
      y = sc.nextInt();
      
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
      x = x + y;
      y = x - y;
      x = x - y;
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
      sc.close();
   }
}
