package com.bptn.course._17_polymorphism;

public class Add {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));          // Calls the first add method
        System.out.println(obj.add(11, 23, 10));       // Calls the second add method
        System.out.println(obj.add(100.10, 200.5));    // Calls the third add method
    }
}
/*

This task involved implementing method overloading in the Add class to perform addition operations for different types and numbers of parameters, providing a good opportunity to revisit this concept in Java. One issue I encountered was understanding how to correctly define the methods to handle different types (integers and doubles) while keeping the method names the same, which required careful planning to avoid signature conflicts. Additionally, I needed to thoroughly test each overloaded method to confirm they worked as expected with the provided inputs, demanding attention to detail in how the method calls were structured. From this experience, I learned that method overloading is a powerful feature in Java that can enhance code clarity and usability, and I will continue to apply this concept when designing methods that perform similar functions. I also realized the importance of testing overloaded methods with various inputs to ensure they behave as intended, especially when dealing with different data types.
*/