package com.star;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60 };
		   int arr2[] = new int[5];
		    
		   // copies an array from the specified source array
		   System.arraycopy(arr1, 0, arr2, 0, 4);
		  System.out.println("The element of array two");
		  for(int n=0;n<arr2.length;n++){
			  System.out.println(arr2[n]);
		  }

	}

}
