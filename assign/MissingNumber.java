package com.assignments;

public class MissingNumber {

	public static void main(String[] args) {
					
			int size=args.length;
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[size-1]);
			int actualSum = 0;
			int calculatedSum = 0;
			
			for (int i = start; i <= end; i++) {
				actualSum = actualSum + i;
			}
			
			for (int i = 0; i < size; i++) {
				calculatedSum = calculatedSum + Integer.parseInt(args[i]);
			}
			
			System.out.println("The Missing Number is="+(actualSum - calculatedSum));
		
	}

}

