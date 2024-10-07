package com.bptn.course._18_super_and_inheritance;

public class Vehicle {
    // Declare instance variables
    private String colour;
    private String brand;

    // Parameterized constructor
    public Vehicle(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    // Getter methods for colour and brand
    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }
       //Do not modify this code as we have parameters that pass the test case
    public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

    }
}
