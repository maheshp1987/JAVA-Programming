package com.assignments;
import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
        EvenOddChecker evenoddobj=new EvenOddChecker();
        AreaFinder areaobj=new AreaFinder();

        int side=0;
        int no=0;
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice=");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			    System.out.println("Enter the number=");
			    no=sc.nextInt();
		        evenoddobj.check(no);  	
			    break;
		case 2:  
			    System.out.println("Enter the Side of Square=");
			    side=sc.nextInt();
			    areaobj.squareArea(side);
			    break;
		default:
			    System.out.println("Enter choice 1 or 2 Thank You");
			    break;
		}
         sc.close(); 
	}
}
