package com.bptn.course._07_big_coding_1;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Define the target number that the user needs to guess
        int targetNumber = 23;
        // Create a Scanner object to receive input from the user
        Scanner sc = new Scanner(System.in);
        
        int guess; // Variable to store the user's guess

        // Prompt the user for their first guess
        System.out.println("\n Welcome to the Number Guessing Game! \n");
        
        do {
            System.out.print("Guess a number between 1 and 100: ");
            
            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                System.out.print("Guess a number between 1 and 100: ");
                sc.next(); // Consume the invalid input
            }
            guess = sc.nextInt(); // Read the user's guess

            // Validate the input range
            if (guess < 1 || guess > 100) {
                // If the guess is outside the valid range, prompt for valid input
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) {
                // If the guess is too low, provide feedback
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                // If the guess is too high, provide feedback
                System.out.println("Too high! Try again.");
            } else {
                // If the guess is correct, congratulate the user
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        } while (guess != targetNumber); // Repeat until the correct guess

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

/*
Summary:
In this task, I created a number guessing game where the user guesses a predefined target number, which is 23. The program checks the user's guess against this target number and provides feedback on whether the guess is too high, too low, or correct.

What Was New:
- This task helped in my understanding of loops and conditional statements in Java. I also learned about input validation, ensuring that user guesses fall within a specified range.

Issues:
- One challenge was ensuring that the program correctly validates input and provides appropriate feedback. I had to test different scenarios, including edge cases like guesses that are exactly 1 or 100, as well as guesses outside the valid range.

Lessons:
- I will remember the importance of input validation and user feedback in interactive programs. Properly guiding the user through their inputs can significantly enhance the user experience. Additionally, using loops effectively allows for repeated prompts until a desired condition is met.
*/