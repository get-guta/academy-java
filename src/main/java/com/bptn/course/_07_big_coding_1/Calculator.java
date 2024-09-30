package com.bptn.course._07_big_coding_1;

import java.util.Scanner;  // Importing the Scanner class for user input

public class Calculator {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating a scanner object to take input from the user
        int continueCalculation = 1;  // Initializing a variable to control the loop for repeated calculations

        do {  // Starting a do-while loop that will run at least once and repeat based on user's input to continue
            double num1, num2, result = 0;  // Declaring variables for two numbers and the result
            int choice;  // Variable to hold the user's menu choice
            
            // Displaying the menu options to the user
            System.out.println("/...Calculator Menu.../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            System.out.print("Enter your choice: ");  // Asking the user for their choice
            choice = sc.nextInt();  // Reading the user's choice
            
            // Performing operations based on user's choice using if-else conditions
            if (choice == 1) {  // If the user chooses addition
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();  // Read the first number
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();  // Read the second number
                result = num1 + num2;  // Perform addition
                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is: " + result);
            } else if (choice == 2) {  // If the user chooses subtraction
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();  // Read the first number
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();  // Read the second number
                result = num1 - num2;  // Perform subtraction
                System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is: " + result);
            } else if (choice == 3) {  // If the user chooses multiplication
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();  // Read the first number
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();  // Read the second number
                result = num1 * num2;  // Perform multiplication
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (choice == 4) {  // If the user chooses division
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();  // Read the first number
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();  // Read the second number
                if (num2 != 0) {  // Checking if the second number is not zero to avoid division by zero
                    double quotient = num1 / num2;  // Calculating quotient
                    double remainder = num1 % num2;  // Calculating remainder
                    System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + quotient);
                    System.out.println("The remainder is " + remainder);
                } else {
                    System.out.println("Cannot divide by zero");  // Error message for division by zero
                }
            } else if (choice == 5) {  // If the user chooses to square a number
                System.out.print("Enter the number to find Square: ");
                num1 = sc.nextDouble();  // Read the number
                result = num1 * num1;  // Calculate square
                System.out.println("The Square of the number " + num1 + " is = " + result);
            } else if (choice == 6) {  // If the user chooses to find the square root
                System.out.print("Enter a number: ");
                num1 = sc.nextDouble();  // Read the number
                if (num1 >= 0) {  // Checking if the number is non-negative (square roots of negative numbers aren't real)
                    result = Math.sqrt(num1);  // Calculate square root using Math.sqrt()
                    System.out.println("The square root of the number " + num1 + " is: " + result);
                } else {
                    System.out.println("Cannot compute square root of negative number");  // Error message for negative input
                }
            } else if (choice == 7) {  // If the user chooses to find the reciprocal
                System.out.println("Enter the number to find Reciprocal: ");
                num1 = sc.nextDouble();  // Read the number
                if (num1 != 0) {  // Checking if the number is not zero to avoid division by zero
                    result = 1 / num1;  // Calculate reciprocal
                    System.out.println("The Reciprocal of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Cannot compute reciprocal of zero");  // Error message for zero input
                }
            } else {
                System.out.println("Invalid choice! Please make a valid choice.");  // Handling invalid menu input
            }
            
            // Asking the user if they want to continue performing more calculations
            System.out.print("To continue calculation Press 1, else press any other number to exit: ");
            continueCalculation = sc.nextInt();  // Read the user's decision to continue or not
        } while (continueCalculation == 1);  // Loop continues if user presses 1
        
        System.out.println("Exiting the calculator. Goodbye!");  // Exiting message
        sc.close();  // Closing the scanner to prevent resource leaks
    }
}
/*
The task was to implement a basic calculator with multiple operations, including addition, subtraction, multiplication, and some advanced ones like square roots and reciprocals. The use of a do-while loop to allow continuous calculations until the user decides to exit was something I hadn't used often, and it was a helpful structure for making the program more user-friendly.
One of the new challenges in this task was handling edge cases like division by zero and computing the square root of negative numbers. I had to ensure the program didn't crash when users input invalid data, which led me to implement proper validation and error handling.
An issue I encountered was with user input; since the user could easily make invalid choices, I had to account for those scenarios and provide feedback. In future projects, I'll make sure to remember the importance of input validation and handling exceptions properly to avoid unexpected errors or crashes. It also reinforced the value of clear prompts and messages for guiding the user, which improves the overall experience of using the program.
*/