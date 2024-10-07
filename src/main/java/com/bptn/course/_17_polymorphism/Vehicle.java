package com.bptn.course._17_polymorphism;

public class Vehicle {
    // Declare String color and String brand
    private String color;
    private String brand;

    // Define a parameterized constructor with color and brand as parameters
    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    // Create a print() method
    public void print() {  
        System.out.println(this.color + " " + this.brand); 
    }
}