package com.bptn.course._32_teachback_list_performance_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int n = 100000; // Number of elements
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        // Test insertion at the end
      for (int i = 0; i <  n; i++) {
            arrayList.add(i);
        }
     
        System.out.println("ArrayList insertion at end: " + (endTime - startTime) / 1000000 + " ms");
       
        // LinkedList implementation
      startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList insertion at end: " + (endTime - startTime) / 1000000 + " ms");
       
       
       //////////////////////////////////////////////////////////////
         // ++++++++++++ Test insertion at the beginning +++++++++++++++
//        
//        startTime = System.nanoTime();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(0, i);
//        }
//        endTime = System.nanoTime();
//        System.out.println("ArrayList insertion at beginning: " + (endTime - startTime) / 1000000 + " ms");
//
//        startTime = System.nanoTime();
//        for (int i = 0; i < n; i++) {
//            linkedList.add(0, i);
//        }
//        endTime = System.nanoTime();
//        System.out.println("LinkedList insertion at beginning: " + (endTime - startTime) / 1000000 + " ms");
////     
        
  
        /////////////////////////////////////////////////////////////
        
//        // +++++++++ Test random access ++++++++++++
        
//        startTime = System.nanoTime();
//        for (int i = 0; i < n; i++) {
//            arrayList.get(i);
//        }
//        endTime = System.nanoTime();
//        System.out.println("ArrayList random access: " + (endTime - startTime) / 1000000 + " ms");
//
//        startTime = System.nanoTime();
//        for (int i = 0; i < n; i++) {
//            linkedList.get(i);
//        }
//        endTime = System.nanoTime();
//        System.out.println("LinkedList random access: " + (endTime - startTime) / 1000000 + " ms");

//        
        //////////////////////////////////////////////////////////////
        
      
     // +++++++++++++++ Test deletion from the middle +++++++++++++++
        
       
        startTime = System.nanoTime();
        for (int i = n / 2; i < n; i++) { // Start from the middle to the end
            linkedList.remove(n / 2); // Always remove the current middle element
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList deletion from middle: " + (endTime - startTime) / 1000000 + " ms");
  
        startTime = System.nanoTime();
        for (int i = n / 2; i < n; i++) { // Note: We start from the middle to the end
            arrayList.remove(n / 2); // Always remove the current middle element
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList deletion from middle: " + (endTime - startTime) / 1000000 + " ms");
//
//        
    }
}
