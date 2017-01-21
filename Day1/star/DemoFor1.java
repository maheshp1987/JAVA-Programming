package com.star;

class DemoFor1 {
	  public static void main(String[] args) {
	    int row, numberOfStars;
	 
	    for (row = 5; row >= 1; row--) {
	      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
	        System.out.print("*");
	      }
	      System.out.println(); // Go to next line
	    }
	  }
	}