package com.demo.jsonparser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParsing {

	public static void main(String[] args) {
		String employeeString = "{\"name\": \"Nikhil\",\"Organization\":"
				+ "\"xyz\",\"skills\":\"Java\"}";
		// 1. Parse Input string and display Organization name of nikhil
		readStringAndParse(employeeString);
		// 2. Parse Input file and display employee name of first employee
		readInputFileAndParse();
	}

	public static void readStringAndParse(String employeeString) {
		JSONObject jsonObject = (JSONObject) JSONValue.parse(employeeString);
		// Check whether jsonObject contains key "Organization"
		if (jsonObject.containsKey("skills")) { // Get Organization value
			System.out.println(jsonObject.get("Organization"));
		}
	}

	public static void readInputFileAndParse() {
		// Read input file from resources folder.
		ClassLoader classLoader = JSONParsing.class.getClassLoader();
		File inputFile = new File(
				"C:\\Zeal\\ParserImplStrategies\\src\\com\\demo\\jsonparser\\input.json");
		// Create JSON parser Object
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			// parse input file
			obj = parser.parse(new FileReader(inputFile));
			// Type cast Object into JSONObject
			JSONObject inputTestDataObject = (JSONObject) obj;
			// get employees array from JSONObject
			JSONArray empList = (JSONArray) inputTestDataObject
					.get("employees");
			// Display employeeName of first Object- get(0)
			System.out.println(((JSONObject) empList.get(0))
					.get("employeeName"));
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}