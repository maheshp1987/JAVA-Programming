package com.constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
 
public class PropertyAccess {
  public static void main(String[] args) {
 
	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 
		input = new FileInputStream("C:\\Users\\Mahesh\\Desktop\\MMIT Java\\config.properties");
 
				
		// load a properties file
		prop.load(input);
		
 
		// get the property value and print it out
		System.out.println(prop.getProperty("IP"));
		System.out.println(prop.getProperty("PORT"));
		System.out.println(prop.getProperty("URL"));
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
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