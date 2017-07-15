package com.constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class SetProperty {
  public static void main(String[] args) throws IOException {
	
	Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("C:\\Users\\gs-0851\\Desktop\\config.properties");

		// set the properties value
		prop.setProperty("NAME", "MIT");
		prop.setProperty("DATABASE", "localhost");
		prop.setProperty("DBPWD", "password");

		// save properties to project root folder
		//prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		output.close();
		}

	}
  }
