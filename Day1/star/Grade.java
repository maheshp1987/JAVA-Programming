package com.star;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the percentage of the Student=");
            float percentage=sc.nextFloat();
            if(percentage<0 || percentage>100){
            	System.out.println("Enter valid percentage");
            }
            else if(percentage>=80){
            	System.out.println("First Class with A grade");
            }
            else if(percentage>=70){
            	System.out.println("Second Class with B grade");
            }
            else if (percentage>=60){
				System.out.println("C grade");
			}
            else if (percentage>=50) {
				System.out.println("D grade");
			}else{
				System.out.println("Sorry you are fail");
			}
            sc.close();
	}
}
