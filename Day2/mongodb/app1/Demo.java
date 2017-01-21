package com.mongodb.app1;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.JOptionPane;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**
 * Java + MongoDB in Secure Mode
 * 
 */
public class Demo {
   public static void main(String[] args) {

    try {

	Mongo mongo = new Mongo("localhost", 27017);
	DB db = mongo.getDB("admin");
	String username=JOptionPane.showInputDialog(null,"Enter Username=");
	String passwd=JOptionPane.showInputDialog(null,"Enter Passwd");
	
	boolean auth = db.authenticate(username, passwd.toCharArray());
	if (auth) {
			
		DBCollection table = db.getCollection("user");

		BasicDBObject document = new BasicDBObject();
		document.put("name", "om");
		table.insert(document);
	JOptionPane.showMessageDialog(null, "Login is successful!");
		System.out.println("Login is successful!");
	} else {
		JOptionPane.showMessageDialog(null, "Login is failed!");
		System.out.println("Login is failed!");
	}
	System.out.println("Done");

    } catch (UnknownHostException e) {
	e.printStackTrace();
    } catch (MongoException e) {
	e.printStackTrace();
    }
  }
}