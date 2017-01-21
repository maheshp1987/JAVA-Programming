package com.mongodb.app1;
import java.net.UnknownHostException;

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
public class BasicDemo {
   public static void main(String[] args) {
    try {

	Mongo mongo = new Mongo("localhost", 27017);
	DB db = mongo.getDB("dyp");
    String username=JOptionPane.showInputDialog(null,"Enter Username=");
    String passwd=JOptionPane.showInputDialog(null,"Enter password=");
	
	
	boolean auth = db.authenticate(username, passwd.toCharArray());
	if (auth) {
			
		DBCollection table = db.getCollection("user");

		BasicDBObject document = new BasicDBObject();
		document.put("name", "om");
		table.insert(document);
	JOptionPane.showMessageDialog(null, "Login Successfully");

	} else {
		JOptionPane.showMessageDialog(null, "Login Failed");
	}
	System.out.println("Done");

    } catch (UnknownHostException e) {
	e.printStackTrace();
    } catch (MongoException e) {
	e.printStackTrace();
    }
  }
}