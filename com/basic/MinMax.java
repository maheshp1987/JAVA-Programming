package com.basic;

public class MinMax{

public static void main(String[] args){

int a[] = {3,5,5,1,4,5,4,33};
System.out.println(" Using Simple Iteration");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("largest Number is : " + Max(a));
System.out.println("Smallest Number is : " + Min(a));
}



   public static int Max(int[] array){
 		int maxval = array[0];

			for(int i = 0; i < array.length;i++){

				if(array[i] > maxval)
					maxval = array[i];

               }

           return maxval;
}

 

     public static int Min(int[] array){

                        int minval = array[0];

                        for(int i = 0; i < array.length; i++){

                        		if(array[i] < minval)

                        			minval = array[i];

                           }

           return minval;
}
}