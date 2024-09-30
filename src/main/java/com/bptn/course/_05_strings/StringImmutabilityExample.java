package com.bptn.course._05_strings;

public class StringImmutabilityExample {
	
    public static void main(String[] args) {
        String str1 = "Hello"; // A String object is created
        
        System.out.println("Original str1: " + str1); // Outputs: Hello
        
        // Attempt to change str1 to uppercase
        str1 = str1.toUpperCase(); // This creates a new String but doesn't change str1
        System.out.println("After toUpperCase: " + str1); // Still outputs: Hello

        // Assign the result of toUpperCase to a new variable
        String str2 = str1.toUpperCase(); // Now str2 references the new String
        System.out.println("New str2: " + str2); // Outputs: HELLO
        System.out.println("Original str1 after assigning to str2: " + str1); // Still outputs: Hello
        
        
    }
}
