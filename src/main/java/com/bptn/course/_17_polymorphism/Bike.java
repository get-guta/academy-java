package com.bptn.course._17_polymorphism;

public class Bike extends Vehicle {
    // Declare String bikeHandle variable
    private String bikeHandle;

    // Define a parameterized constructor with color, brand, and bikeHandle as parameters
    public Bike(String color, String brand, String bikeHandle) {
        super(color, brand); // Call the parent class constructor
        this.bikeHandle = bikeHandle;
    }

    // Create a print() method that calls the parent class’s print method
    @Override
    public void print() { 
        super.print(); // Call the Vehicle's print method
        // No additional output for bike handle
    }
}