package com.bptn.course._18_super_and_inheritance;

public class Bike extends Vehicle {
	   //Declare an instance variable- String bikeHandle
	    private String bikeHandle;

	    //add parameterized constructor- use super keyword to call parent constructor
	    public Bike(String colour, String brand, String bikeHandle) {
	        super(colour, brand); 
	        this.bikeHandle = bikeHandle;
	    }

	    // Getter method for bikeHandle
	    public String getBikeHandle() {
	        return bikeHandle;
	    }
	}
