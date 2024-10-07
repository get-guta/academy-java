package com.bptn.course._21_java_collections;

import java.util.*; // REQUIRED IMPORT for ArryaList and List

public class WrapperBasics {
    public static void main(String[] args) {

       // DECLARE, INITIALIZE, SIZE, and PRINT
       ArrayList<Integer> numbers = null;
       System.out.println(numbers);

       numbers = new ArrayList<Integer>();
       System.out.println(numbers);
       System.out.println("size is " + numbers.size());
       
       // ADD w/o index
       numbers.add(1);                  // Autoboxing example
       System.out.println(numbers);
       numbers.add(3);
       System.out.println(numbers);
       numbers.add(4);
       System.out.println(numbers);
       numbers.add(Integer.valueOf(5));     // no boxing necessary
       System.out.println(numbers);
       System.out.println("size is " + numbers.size());
 
       // ADD w/ index
       numbers.add(1, 2); 
       System.out.println(numbers);
       System.out.println("size is " + numbers.size());

       // GET
       int x = numbers.get(2);      // Unboxing example
       System.out.println("number at index 2 is " + x);

       // SET
       numbers.set(3, 100);
       System.out.println(numbers);
       System.out.println("size is " + numbers.size());

       // REMOVE
       numbers.remove(3);
       System.out.println(numbers);
       System.out.println("size is " + numbers.size());
    }
 }