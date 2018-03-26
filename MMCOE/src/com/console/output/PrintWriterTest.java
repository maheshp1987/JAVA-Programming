package com.console.output;
import java.io.*;                                                               
class PrintWriterTest {                                                         
 public static void main(String args[]) {                                       
  PrintWriter pw = new PrintWriter(System.out, true);                           
  pw.println("This is Demo Program");                                         
  pw.println("The number is = "+ 100);                                                                                                                          
 }                                                                              
} 
