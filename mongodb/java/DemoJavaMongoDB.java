package com.mongodb.java;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class DemoJavaMongoDB {

	public static void main(String[] args) {
		DB db;  
		MongoClient mongoclient = null;
		try {
			mongoclient = new MongoClient("localhost",27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	       db = mongoclient.getDB("Kiran11233");
	       System.out.println("Connection Successfully with test DB");
	       db.getCollection("demo2");
	       System.out.println("Conncted to collection demo2");
	      
	}

}
