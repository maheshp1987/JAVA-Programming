package com.constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class PropertyAccess {
  public static void main(String[] args) {
 	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 		input = new FileInputStream("C:\\Users\\Mahesh\\Desktop\\config.properties");
 		// load a properties file
		prop.load(input);
	   	// get the property value and print it out
		System.out.println(prop.getProperty("COLLEGE_NAME"));
		System.out.println(prop.getProperty("PORT"));
		System.out.println(prop.getProperty("hjkhjh"));
	} catch(FileNotFoundException fileNOtFound){
		System.err.println("This is file not found exception");
	}
	catch (IOException ex) {
		ex.printStackTrace();
	} 
	
	finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
  }
}