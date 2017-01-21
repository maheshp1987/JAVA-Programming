package com.star;

class DemoFor {
	  public static void main(String[] args) {
	    int row, column;
	 
	    for (row = 1; row <= 5; row++) {
	      for(column = 1; column <= row; column++) {
	        System.out.print(" "+column);
	      }
	      System.out.println(); // Go to next line
	    }
	  }
	}