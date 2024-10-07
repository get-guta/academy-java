package com.bptn.course._15_big_coding_w2;


class Employee {
    // Instance variable to store salary
    private double salary;
    // Instance variable to store hours per day worked by employee
    private float hoursPerDay;

    // Constructor to set instance variables (salary and hoursPerDay) value 
    public Employee(double salary, float hoursPerDay) {
        setSalary(salary);
        setHoursPerDay(hoursPerDay);
    }

    // Set method to update salary
    public void setSalary(double salary) {
        if (salary < 500) {
            this.salary = salary + 10; // Increase salary by 10 if less than 500
        } else {
            this.salary = salary;       // Keep the salary unchanged
        }
    }

    // Set method to update hoursPerDay
    public void setHoursPerDay(float hoursPerDay) {
        this.hoursPerDay = hoursPerDay; // Set the hours worked
        if (hoursPerDay > 6) {
            this.salary += 5; // Increase salary by 5 if hours worked per day is greater than 6
        }
    } 

    // Get method to return salary
    public double getSalary() {
        return salary; // Return the current salary
    }
}




