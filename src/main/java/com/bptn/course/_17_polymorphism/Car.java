package com.bptn.course._17_polymorphism;

public class Car extends Vehicle {
    // Declare String steeringWheel variable
    private String steeringWheel;

    // Define a parameterized constructor with color, brand, and steeringWheel as parameters
    public Car(String color, String brand, String steeringWheel) {
        super(color, brand); // Call the parent class constructor
        this.steeringWheel = steeringWheel;
    }

    // Create a print() method that calls the parent’s class print method
    @Override
    public void print() { 
        super.print(); // Call the Vehicle's print method
    }
}
