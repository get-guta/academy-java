package com.bptn.course._07_big_coding_1;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Initialize Scanner to get user input
        int choice = 0;  // Variable to store the user's menu choice
        int continueChoice = 0;  // Separate variable to store the continuation decision

        do {  // Start of the do-while loop to keep the program running until the user exits
            // Display the menu
            System.out.println("/...String Menu.../");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.print("Enter the option: ");
            
            choice = sc.nextInt();  // Get the user's choice
            sc.nextLine();  // Consume the newline left by nextInt()

            if (choice == 1) {  // Palindrome check
                System.out.println("Palindrome Check \n");
                System.out.print("Enter a string: \n");
                String str = sc.nextLine();
                
                String reversed = new StringBuilder(str).reverse().toString();  // Reverse the string using built-in method
                if (str.equals(reversed)) {  // Check if the original string equals the reversed one
                    System.out.println(str + " is a palindrome");
                } else {
                    System.out.println(str + " is not a palindrome");
                }

            } else if (choice == 2) {  // Reverse a string
                System.out.println("Reverse a String \n");
                System.out.print("Enter a string: \n");
                String str = sc.nextLine();
                String reversed = "";

                // Reverse the string using a loop
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }

                System.out.println("The reversed string is: " + reversed);  // Output the reversed string
            } else if (choice == 3) {  // Concatenate two strings
                System.out.println("Concatenate Two Strings \n");
                System.out.print("Enter First string: \n");
                String firstString = sc.nextLine();
                System.out.print("Enter Second string: \n");
                String secondString = sc.nextLine();
                
                System.out.println(firstString + secondString);  // Output the concatenated strings

            } else if (choice == 4) {  // String comparison
                System.out.println("String Comparison \n");
                System.out.print("Enter First string: \n");
                String str1 = sc.nextLine();
                System.out.print("Enter Second string: \n");
                String str2 = sc.nextLine();
                
                if (str1.equals(str2)) {  // Compare the strings using built-in equals() method
                    System.out.println("The entered strings are equal");
                } else {
                    System.out.println("The entered strings are not equal");
                }

            } else if (choice == 5) {  // Calculate the length of a string
                System.out.println("Length of a String \n");
                System.out.print("Enter a string: \n");
                String str = sc.nextLine();
                
                System.out.println("The length of the entered string is: " + str.length());  // Use length() method

            } else {  // Handle invalid choices
                System.out.println("Invalid choice! Please make a valid choice.");
            }

            // Ask the user if they want to continue with more operations
            System.out.print("To continue with other operations, press 1. To exit, press any other number: ");
            continueChoice = sc.nextInt();  // Get user input for whether to continue or not
            sc.nextLine();  // Consume the newline
        } while (continueChoice == 1);  // Repeat the loop if the user presses 1

        System.out.println("Exiting the program. Goodbye!");  // Exit message
        sc.close();  // Close the Scanner
    }
}
/*
This task involved building a menu-driven program to perform various string operations like palindrome checking, string reversal, concatenation, comparison, and length calculation. One of the main challenges was making sure the program flowed smoothly while allowing the user to perform multiple operations or exit the program.
What Was New?
The structure of this kind of repetitive menu system was something I hadn't implemented in a while. The challenge came from ensuring the user could easily switch between tasks without breaking the flow of the program.
Issues Encountered:
- Initially, I was using the same variable (choice) for both the menu selection and to check if the user wanted to continue or exit. This led to confusion, as it would mix up the logic. I solved this by introducing a separate variable (continueChoice) to control the loop.
- Switching between nextInt() and nextLine() required a bit of attention to avoid leaving behind newlines that could cause input issues. It’s a small detail but one that can easily trip up the program.
Lessons:
- Reusing variables for different purposes can cause subtle bugs, so I’ll be more careful to use distinct variables for different tasks in the future.
- Handling input in Java, especially when switching between numbers and strings, needs close attention. I’ll be more mindful of consuming newlines to avoid unexpected behavior.
*/