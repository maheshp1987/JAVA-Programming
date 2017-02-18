package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MissingNumber {

    public static void main(String[] args) {
   	 try {
   		File file = new File("C:\\Users\\gs-0851\\Desktop\\Number.txt");
   		 InputStream in = new FileInputStream(file);
   		 int content;
   		 int j = 0;
   		 while ((content = in.read()) != -1) {
   			 if ((char) content != ',' && (char) content != '\n') {
   				 j++;
   			 }
   		 }
   		 in.close();
   		 int numbersarr[] = new int[j];
   		 int i = 0;
   		 in = new FileInputStream(file);
   		 while ((content = in.read()) != -1) {
   			 if ((char) content != ',' && (char) content != '\n') {
   				 numbersarr[i] = Integer.parseInt("" + (char) content);
   				 i++;
   			 }
   		 }
   		 int start = numbersarr[0];
   		 int end = numbersarr[numbersarr.length - 1];
   		 int actualSum = 0;
   		 int calculatedSum = 0;
   		 for (i = start; i <= end; i++) {
   			 actualSum = actualSum + i;
   		 }
   		 for (i = 0; i < numbersarr.length; i++) {
   			 calculatedSum = calculatedSum + numbersarr[i];
   		 }
   		 System.out.println(actualSum - calculatedSum);
   	 } catch (IOException e) {
   		 e.printStackTrace();
   	 }
    }

}

