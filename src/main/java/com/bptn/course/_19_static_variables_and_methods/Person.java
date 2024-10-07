package com.bptn.course._19_static_variables_and_methods;

public class Person {
	   // instance variables
	   private String name;
	   private String email;
	   private String phoneNumber;

	   // Static counter variable
	   public static int personCounter = 0;

	   // static method to print out counter
	   public static void printPersonCounter() {
	        System.out.println("Person counter: " + personCounter);
	   }

	   // constructor: construct a Person copying in the data into the instance variables
	   public Person(String initName, String initEmail, String initPhone) {
	      name = initName;
	      email = initEmail;
	      phoneNumber = initPhone;
	      personCounter++;
	   }

	   // toString() method
	   public String toString() {
	     return  name + ": " + email + " " + phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args) {
	      // call the constructor to create a new person
	      Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
	      Person p2 = new Person("Sena", "sena@gmail.com", "124-456-7890");

	      // add another person here
	      Person.printPersonCounter();
	   }
	}

