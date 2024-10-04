package com.bptn.course._13_teachback_variable_scope_demo;

public class FlightManagement {
	// Class-level variable (accessible throughout the class)
	private String flightNumber;
	private String airline;


	public FlightManagement(String flightNumber, String airline) {
		this.flightNumber = flightNumber; // Assigning to class-level variable
		this.airline = airline; // Assigning to class-level variable
				   

	}

	public void managePassengerBoarding(boolean isPostBoarding, String destination) {
	    // Method-level variable for boarding status
	    String boardingStatus;
	    
	    // Block-level variables
	    
	    {
	        String boardingAnnouncement = "\nBoarding for " + airline + " flight number " +  flightNumber + " to " + destination + " has started.";
	        System.out.println(boardingAnnouncement);
	    }
	    

	    // Determine boarding status based on post-boarding condition
	    if (isPostBoarding) {
	        
	    	boardingStatus = "Boarding completed. All passengers are on board.";

	        String flightstatus = "Flight is ready for departure.";
	        System.out.println("Flight Status: " + flightstatus);
	    } else {
	        boardingStatus = "Boarding in progress... ";

	        String flightstatus = "Flight is preparing for boarding.";
	        System.out.println("Flight Status: " + flightstatus);
	    }

	    // Output the boarding status
	    System.out.println(boardingStatus);
	}
	

	
	public static void main(String[] args) {
		FlightManagement flight = new FlightManagement("AI202", "Air Cananda");
		FlightManagement flight1 = new FlightManagement("ET202", "ET");
		flight.managePassengerBoarding(true,"New York");
		flight1.managePassengerBoarding(false,"Addis Ababa");
		
		

	}
}
