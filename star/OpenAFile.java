package com.star;

import java.io.FileInputStream;

class OpenAFile {
	
	OpenAFile(String filename) {
        try {
            aFile = new FileInputStream(filename);
            System.gc();
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Could not open file " + filename);
        }
    }
	
    FileInputStream aFile = null;
    public static void main (String a[]){
    OpenAFile obj=new OpenAFile("1.txt");
    }
    

protected void finalize () throws Throwable {
    if (aFile != null) {
    	 System.out.println("Thank You");
    	aFile.close();
       
        aFile = null;
    }
}
}