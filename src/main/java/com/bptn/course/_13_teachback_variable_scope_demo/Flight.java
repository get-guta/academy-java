
package com.bptn.course._13_teachback_variable_scope_demo;
import java.util.Objects;

public class Flight {//
	
	// Class-level variable (accessible throughout the class)
	private String flightNumber;
	private String airline;
	

	public Flight(String flightNumber, String airline) {
		this.flightNumber = flightNumber; // Assigning to class-level variable
		this.airline = airline; // Assigning to class-level variable

	}

	// Override toString() to provide a meaningful representation of the Flight object
@Override
	public String toString() {
		return "Flight{" + "flightNumber='" + flightNumber + '\'' + ", airline='" + airline+"}";
	}

	
	 //Override equals() to compare two Flight objects based on their flightNumber and airline
	@Override
	public boolean equals(Object obj) {

		// Cast obj to Flight
		Flight flight = (Flight) obj;
		// Check for value-based equality using simple if checks
		if (!flightNumber.equals(flight.flightNumber))  // string comparison
			return false;
		if (!airline.equals(flight.airline))
			return false;

		return true;
	}

    
    
	public static void main(String[] args) throws CloneNotSupportedException {
		Flight f1 = new Flight("AI202", "Air Cananda");
		Flight f2 = new Flight("ET1202", "Ethiopian Airlines");
		Flight f3 = f1;
		
		
		//2. Compares objects memory address
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		

		// Compare the two flight objects using the equals() method
//        System.out.println(f1.equals(f2) ? "Flights are equivalent." : "Flights are not equivalent.");
//        System.out.println(f1.equals(f3) ? "Flights are equivalent." : "Flights are not equivalent.");

      
        // 1. Print details using toString()
        
//      System.out.println("Flight 1: " + f1);        
//      System.out.println("Flight 2: " + f2.toString());
//        System.out.println("Flight 3: " + f3.toString());
        
        
        System.out.println("Hash code: "+ f1.getClass());

	}
}
