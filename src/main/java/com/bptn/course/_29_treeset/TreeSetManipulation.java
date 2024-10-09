package com.bptn.course._29_treeset;

import java.util.TreeSet;
public class TreeSetManipulation {
    public static void main(String[] args) {
// Create a TreeSet and populate it with the elements A, B and C.
       TreeSet<String> set = new TreeSet<>();
       set.add("A");
       set.add("B");
       set.add("C");

        // Print the size of the set
        System.out.println("Set size: "+set.size());

        // Print the elements in the set
        System.out.println("Elements in set: "+set);

        // Use the first() method to get the first element in the set, then print it out.
        System.out.println("First element: "+set.first());

        // Use the last() method to get the last element in the set, then print it out.
        System.out.println("Last element: "+set.last());
// Use the headSet() method to get the elements in the set that are strictly less than the element B.  
        System.out.println("Elements less than 'B': "+set.headSet("B"));
        
        // Use the tailSet() method to get the elements in the set that are greater than or equal to B.
        System.out.println("Elements greater than or equal to 'B': "+set.tailSet("B"));

               System.out.println("Elements between 'A'(inclusive) and 'C'(exclusive): "+set.subSet("A", "C"));

        // Use contains() method to check if B exists in the set.
        System.out.println("Does the set contain 'B'? "+ set.contains("B"));
        
        // Use remove() method to remove B from the set.
        set.remove("B");

        // Print the set to show that the element B has been removed.
       System.out.println("Set after removing 'B': "+set);
    }
}

