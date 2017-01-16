package com.mongodb.app2;

import java.util.Scanner;
import com.mongodb.Mongo;

public class DemoApp2 {

	public static void main(String[] args) {
		try {
			MongoCRUD mongoobj=new MongoCRUD();
			Scanner sc =new Scanner(System.in);
			Mongo mongo = new Mongo("localhost", 27017);
			
			System.out.println("Connect Successfully to Mongo Server");
			System.out.println("Choose Option from following Option:");
			System.out.println("1) Create Database");
			System.out.println("2) Display Existing Databases");
			System.out.println("3) Create Collection");
			System.out.println("4) Create Document");
			System.out.println("5) Display all Documents");
			System.out.println("6) Delete Document");
			System.out.println("7) Update Document");
			System.out.println("8) Delete All Document");
			System.out.print("Enter Your Choice:=");
			int choice=sc.nextInt();
			
			switch(choice){
			case 1:
				   System.out.print("Enter datababse Name:=");
				   String dbname=sc.next();
				   mongoobj.createDatabase(dbname);
				   break;
			case 2:
				   mongoobj.listDatabases();
				   break;
			case 3:
				   System.out.print("Enter Collection Name:=");
				   String collname=sc.next();
				   mongoobj.cretCollection(collname);
				   break;
			case 4:
				   mongoobj.createDocu();
				   break;
			case 5:
				   mongoobj.displayDocuments();
				   break;
			case 6:
				  System.out.println("Enter key and value to delete document");
				  System.out.print("The key is=");
				  String key=sc.next();
				  System.out.print("The value is=");
				  String val=sc.next();
				  mongoobj.deleteDoc(key,val);
					    
				   break;
			case 7:
				   mongoobj.updateDoc();
				   break;
			case 8:
				   mongoobj.deleteAllDoc();
				   break;
			default:
				   System.out.println("Thanks for using MongoDB CRUD");
				   break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
