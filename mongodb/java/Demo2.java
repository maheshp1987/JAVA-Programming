package com.mongodb.java;
import com.mongodb.*;

public class Demo2 {
    public static void main(String[] args) {

 Mongo mongo;

 try {
 mongo = new Mongo("localhost", 27017);
 DB db = mongo.getDB("jitesh");
 System.out.println("Database is created"+db);

 DBCollection books = db.getCollection("demo2");
 System.out.println("Collection is created"+books);
 BasicDBObject b = new BasicDBObject();
 b.put("name", "Understanding JAVA");
 b.put("pages", 100);
 books.insert(b);
  }
 catch(Exception e)
 {
  e.printStackTrace();   
 }
 }
    }