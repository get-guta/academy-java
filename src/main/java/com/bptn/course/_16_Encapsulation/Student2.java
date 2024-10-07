package com.bptn.course._16_Encapsulation;

public class Student2 {
    private String name;
    private String email;
    private int id;

    public Student2(String initName, String initEmail, int initId) {
        name = initName;
        email = initEmail;
        id = initId;
    }

    // toString() method
    public String toString() {
      return id + ": " + name + ", " + email; // Replace the empty String with the format specified in the instructions above.
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Skyler", "skyler@sky.com", 123456);
        System.out.println(s1);
    }
}
