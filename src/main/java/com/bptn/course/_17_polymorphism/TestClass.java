package com.bptn.course._17_polymorphism;

public class TestClass {

    // Use the code below for Sanity check
    public static void main(String args[]) {
        Car car = new Car("White", "Audi", "ChromeColored");
        car.print();

        Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
        bike.print();
    }
}