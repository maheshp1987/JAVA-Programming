package com.assignment;

public class MinMax1{

public static void main(String[] args){

String a[] = args;
System.out.println(" Using Simple Iteration");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("largest Number is : " + Max(a));
System.out.println("Smallest Number is : " + Min(a));
}



   public static int Max(String[] array){
 		int maxval = Integer.parseInt(array[0]);

			for(int i = 0; i < array.length;i++){

				if(Integer.parseInt(array[i]) > maxval)
					maxval = Integer.parseInt(array[i]);

               }

           return maxval;
}

 

     public static int Min(String[] array){

                        int minval = Integer.parseInt(array[0]);

                        for(int i = 0; i < array.length; i++){

                        		if(Integer.parseInt(array[i]) < minval)

                        			minval = Integer.parseInt(array[i]);

                           }

           return minval;
}
}