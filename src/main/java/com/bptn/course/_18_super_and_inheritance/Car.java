package com.bptn.course._18_super_and_inheritance;

public class Car extends Vehicle {
    // Declare instance variable
    private String steeringWheel;

       //add parameterized constructor- use super keyword to call parent constructor

    public Car(String colour, String brand, String steeringWheel) {
        super(colour, brand); // Call the parent class constructor
        this.steeringWheel = steeringWheel;
    }

    // Getter method for steeringWheel
    public String getSteeringWheel() {
        return steeringWheel;
    }
}

