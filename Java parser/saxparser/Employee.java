package com.demo.saxparser;

public class Employee {
	   private int id;
	   private String firstname;
	   private String lastname;
	   private int age;
	   private String role;

	   public int getId() {
	      return id;
	   }

	   public void setId(int id) {
	      this.id = id;
	   }

	   public String getFirstname() {
	      return firstname;
	   }

	   public void setFirstname(String firstname) {
	      this.firstname = firstname;
	   }

	   public String getLastname() {
	      return lastname;
	   }

	   public void setLastname(String lastname) {
	      this.lastname = lastname;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public String getRole() {
	      return role;
	   }

	   public void setRole(String role) {
	      this.role = role;
	   }

	   @Override
	   public String toString() {
	      return "Employee ID=" + this.id + ", First Name=" + this.firstname + ", Last Name=" + 
	             this.lastname + ", Age=" + this.age + ", Role=" + this.role;
	   }
	}
