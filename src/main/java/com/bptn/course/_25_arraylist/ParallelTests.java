package com.bptn.course._25_arraylist;

import java.util.*;

public class ParallelTests {
    public static void main(String[] args) {
        // Create two ArrayLists to hold grades for two tests
        ArrayList<Integer> test1Grades = new ArrayList<Integer>();
        ArrayList<Integer> test2Grades = new ArrayList<Integer>();

        // Add grades for Test 1
        test1Grades.add(100);
        test1Grades.add(80);
        test1Grades.add(70);
        // Print current grades for Test 1
        System.out.println("Test 1 Grades: " + test1Grades);

        // Add grades for Test 2
        test2Grades.add(100);
        test2Grades.add(70);
        test2Grades.add(90);
        // Print current grades for Test 2
        System.out.println("Test 2 Grades: " + test2Grades);

        // Initialize a variable to hold the total of all grades
        double total = 0;

        // Loop through the grades of both tests
        for (int i = 0; i < test1Grades.size(); i++) {
            // Add the grades from both tests to the total
            total += test1Grades.get(i) + test2Grades.get(i);
            // Print the current total after adding each pair of grades
            System.out.println("After adding grades for index " + i + ": Total = " + total);
        }

        // Calculate the total number of grades (2 for each student)
        int numberOfGrades = test1Grades.size() * 2;

        // Print the calculated average
        System.out.println("Average over two tests: " + total / numberOfGrades);
    }
}