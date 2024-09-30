package com.bptn.course._07_big_coding_1;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a word for encryption
        System.out.print("Enter a word: ");
        String word = sc.nextLine();  // Read the input word
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder encryptedWord = new StringBuilder();

        // Iterate through each character of the input word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);  // Get the current character

            // Check if the character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Shift the character by one position and wrap around if necessary
                if (currentChar == 'z') {
                    encryptedWord.append('a');  // Wrap from 'z' to 'a'
                } else {
                    encryptedWord.append((char) (currentChar + 1));  // Shift to next character
                }
            } 
            // Check if the character is an uppercase letter
            else if (currentChar >= 'A' && currentChar <= 'Z') {
                // Shift the character by one position and wrap around if necessary
                if (currentChar == 'Z') {
                    encryptedWord.append('A');  // Wrap from 'Z' to 'A'
                } else {
                    encryptedWord.append((char) (currentChar + 1));  // Shift to next character
                }
            } 
            // If the character is not an alphabetic letter, keep it unchanged
            else {
                encryptedWord.append(currentChar);  // Append non-alphabetic character as is
            }
        }

        // Print the encrypted word
        System.out.println("Encrypted word: " + encryptedWord.toString()); 

        // Close the scanner to avoid resource leaks
        sc.close();  
    }
}

/*
In this task, I developed a program to encrypt a given word by shifting each letter in the alphabet by one position. The key logic involved iterating through each character, checking if it's a letter, and then performing the shift while handling wrapping cases for 'z' to 'a' and 'Z' to 'A'.

What Was New:
The implementation of character manipulation using ASCII values was a practical exercise in understanding how characters are represented in Java. I also gained experience in handling non-alphabetic characters without altering them.

Issues:
- One challenge was ensuring that I correctly handled the wrap-around logic for both lowercase and uppercase letters. I had to be cautious with the conditions to avoid mistakenly shifting non-letter characters.

Lessons:
- Handling both uppercase and lowercase letters and including non-alphabetic characters.
*/
