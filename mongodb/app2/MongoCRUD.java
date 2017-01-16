package com.mongodb.app2;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class MongoCRUD {
	
	public void createDatabase(String dbname) throws UnknownHostException {
		MongoClient mongoClient= new MongoClient("localhost",27017);
		DB demoDB = mongoClient.getDB(dbname);  
		System.out.println("DB Create Successfully");
		
	}

	public void listDatabases() throws UnknownHostException {
		MongoClient mongoClient= new MongoClient("localhost",27017);
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		
	}

	public void cretCollection(String collname) throws UnknownHostException {
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);  
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		DBCollection personCollection = demoDB.getCollection(collname);  
		System.out.println("Collection "+collname+ "is created in "+dbname);
		
	}

	public void createDocu() throws UnknownHostException {
				
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		System.out.print("Enter Collection Name:=");
		String coll=sc.next();
		DBCollection personCollection = demoDB.getCollection(coll);  
		
		System.out.println("Enter the document in JSON format:");
		String json="{'database' : 'my','table' : 'hosting'," +
					  "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}}";
		
		DBObject dbObject = (DBObject)JSON.parse(json);
		personCollection.insert(dbObject);
		System.out.println("document inserted successfully");
	}

	public void displayDocuments() throws UnknownHostException {
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		System.out.print("Enter Collection Name:=");
		String coll=sc.next();
		DBCollection personCollection = demoDB.getCollection(coll); 
		//print all person records  
		
		DBCursor personCursor = personCollection.find();  
		                      
		while(personCursor.hasNext()){  
		  System.out.println(personCursor.next());  
		}  
		
	}

	public void deleteDoc(String key, String val) throws UnknownHostException {
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		System.out.print("Enter Collection Name:=");
		String coll=sc.next();
		DBCollection personCollection = demoDB.getCollection(coll); 
        
		DBObject queryObject = new BasicDBObject(key,val);  
		  
		personCollection.remove(queryObject);  
		System.out.println("Delete Successfully");
	}

	public void updateDoc() throws UnknownHostException {
		
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		System.out.print("Enter Collection Name:=");
		String coll=sc.next();
		DBCollection personCollection = demoDB.getCollection(coll); 
		System.out.println("Enter key and value to update document");
		  System.out.print("The key is=");
		  String key=sc.next();
		  System.out.print("The value is=");
		  String val=sc.next();
		  System.out.print("The New key is=");
		  String newkey=sc.next();
		  System.out.print("The New value is=");
		  String newval=sc.next();
		  
		//update record  
		BasicDBObject queryObject = new BasicDBObject(key,val);  
		BasicDBObject updateObject = new BasicDBObject("$set", new BasicDBObject(newkey,newval));  
		                      
		personCollection.update(queryObject, updateObject);  
		System.out.println("Updated Suucessfully");
		
	}

	public void deleteAllDoc() throws UnknownHostException {
		Scanner sc =new Scanner(System.in);
		MongoClient mongoClient= new MongoClient("localhost",27017);
		System.out.println("Select Database from");
		List<String> databaseNames = mongoClient.getDatabaseNames();  
		for (String dbName : databaseNames) {  
		  System.out.println("Database : " + dbName);  
		}  
		System.out.print("Enter datababse Name:=");
		String dbname=sc.next();
		DB demoDB = mongoClient.getDB(dbname);
		System.out.println("Connect to DB "+dbname+" Successfully");
		
		System.out.print("Enter Collection Name:=");
		String coll=sc.next();
		DBCollection personCollection = demoDB.getCollection(coll); 
        
		DBObject queryObject = new BasicDBObject();  
		  
		personCollection.remove(queryObject);  
		System.out.println("Delete ALL Successfully");
		
	}

}
