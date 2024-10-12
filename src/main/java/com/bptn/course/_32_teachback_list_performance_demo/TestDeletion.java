package com.bptn.course._32_teachback_list_performance_demo;
import java.util.ArrayList;
import java.util.LinkedList;


public class TestDeletion {
	

	public static void main(String[] args) {
        int n = 50000; // Increase the size to amplify differences
        
        // Prepare the ArrayList and LinkedList with 'n' elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // +++++++++++++++ Test LinkedList deletion from the middle +++++++++++++++
        long startTime = System.nanoTime();
        for (int i = 0; i < n / 10; i++) { // Limit the number of deletions to a smaller fraction
            linkedList.remove(n / 10); 
        }
        long endTime = System.nanoTime();
        System.out.println("LinkedList deletion from middle: " + (endTime - startTime) / 1000000 + " ms");
        
        // +++++++++++++++ Test ArrayList deletion from the middle +++++++++++++++
        // Reset the ArrayList to the original state
        arrayList.clear();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        
        startTime = System.nanoTime();
        for (int i = 0; i < n / 2; i++) { 
            arrayList.remove(n / 6); 
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList deletion from middle: " + (endTime - startTime) / 1000000 + " ms");
    }
}


