package com.bptn.course._07_big_coding_1;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from the user
        Scanner sc = new Scanner(System.in);
        int amt = -1; // Initialize the amount to -1 to enter the loop

        // Prompt the user to enter a non-negative integer
        while (amt < 0) {
            System.out.print("Enter a non-negative integer: ");
            // Check if the next input is an integer
            if (sc.hasNextInt()) {
                amt = sc.nextInt(); // Read the integer input
                if (amt < 0) {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid non-negative integer.");
                sc.next(); // Clear the invalid input
            }
        }

        sc.nextLine(); // Consume the newline character after the integer input

        // Prompt the user to enter a valid string
        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();  // Read the word input
        // Determine the plural form of the word
        String pluralWord;
        if (amt == 1) {
            pluralWord = word;  // Keep the word as is if the amount is 1
        } else {
            // Handle the pluralization rules based on the ending of the word
            if (word.endsWith("fe")) {
                pluralWord = word.substring(0, word.length() - 2) + "ves";  // Replace "fe" with "ves"
            } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") && !word.endsWith("oy") && !word.endsWith("uy")) {
                pluralWord = word.substring(0, word.length() - 1) + "ies";  // Replace "y" with "ies"
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                pluralWord = word + "es";  // Add "es" for words ending in "sh" or "ch"
            } else if (word.endsWith("us")) {
                pluralWord = word.substring(0, word.length() - 2) + "i";  // Replace "us" with "i"
            } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                pluralWord = word + "s";  // Add "s" for words ending in these cases
            } else {
                pluralWord = word + "s";  // General rule for pluralization
            }
        }

        // Print the result
        System.out.println(amt + " " + pluralWord);
        
        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

/*
In this task, I created a program that pluralizes nouns based on user input, following specific rules for different word endings. The program validates the input and applies the correct pluralization rules for various cases.

What Was New:
- I learned how to implement multiple conditions and rules for string manipulation in Java. This task emphasized the need for thorough handling of special cases in pluralization.

Issues:
- One challenge was ensuring that all edge cases were addressed correctly. I had to carefully order the conditions to make sure that exceptions like words ending in "y" were handled before general cases.

Lessons:
- This task helped me understand how to apply string functions effectively to manipulate text and create different forms of words. It assessed my ability to use nested conditions for handling multiple logic checks, which is important for ensuring accuracy in programming. I learned the significance of correctly structuring these conditions, especially when dealing with special cases in language rules. This experience will remind me to carefully plan my logic checks and use string functions in future coding tasks to create more robust solutions. In future i would add validations to only accept string values for the second word input.
*/
