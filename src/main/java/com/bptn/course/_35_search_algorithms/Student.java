package com.bptn.course._35_search_algorithms;

public class Student {
    //Define instance variables name and
    private int rollNumber;
    private String name;
    //Create parameterized constructor
     public Student(int rollNumber, String name) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    // Create getter method for roll number variable which returns rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
    // Create getter method for name variable which returns name
    public String getName() {
        return name;
    }
}
