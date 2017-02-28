package com.assignments;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MissingNumber1 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\gs-0851\\Desktop\\Number.txt");
			InputStream in = new FileInputStream(file);
			int content;
			int j = 0;
			String txt="";
			while ((content = in.read()) != -1) {
				txt +=(char)content;	//read whole string
			}
			in.close();
					
			String[] lineVector;
			lineVector = txt.split(",");
			
			j=0;
			for(String s:lineVector){
				j++;
			}
			int numbersarr[] = new int[j];
			int i = 0;
			
			for(String s:lineVector){
				numbersarr[i]=Integer.parseInt(s);
				i++;
			}
		
			
			int start = numbersarr[0];
			int end = numbersarr[j-1];
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