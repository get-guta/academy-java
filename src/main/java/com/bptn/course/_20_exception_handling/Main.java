package com.bptn.course._20_exception_handling;

public class Main {
    
    // Method to demonstrate exception propagation
    public void method1() {
        int[] arr = {1, 2, 3, 4}; // Declare and initialize array
        System.out.println(arr[4]); // Attempt to access index out of bounds
    }
    
    // Method to handle exception and demonstrate propagation
    public void method2() {
        try {
            method1(); // Calling method1 which causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the exception from method1
            System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
        }
    }
    
    // main() method to run the program
    public static void main(String args[]) {
        Main exceptionSolutionObject = new Main();
        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
}

