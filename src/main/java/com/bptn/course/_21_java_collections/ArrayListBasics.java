package com.bptn.course._21_java_collections;

import java.util.*; // This is the required import for an ArryaList and/or List

public class ArrayListBasics {
    public static void main(String[] args) {

       // DECLARE, INITIALIZE, SIZE, and PRINT
       ArrayList<String> nameList = null; /* Declare */
       System.out.println(nameList);

       nameList = new ArrayList<String>(); /* Allocate memory*/
       System.out.println(nameList);
       System.out.println("size is " + nameList.size());
       
       // ADD w/o index
       nameList.add("Andrea");
       System.out.println(nameList);
       nameList.add("Bob");
       System.out.println(nameList);
       nameList.add("Carrie");
       System.out.println(nameList);
       nameList.add("Eduardo");
       System.out.println(nameList);
       System.out.println("size is " + nameList.size());
 
       // ADD w/ index
       nameList.add(3, "Dierdre");
       System.out.println(nameList);
       System.out.println("size is " + nameList.size());

       // GET
       System.out.println("name at index 2 is " + nameList.get(2));

       // SET
       nameList.set(1, "Tori");
       System.out.println(nameList);
       System.out.println("size is " + nameList.size());

       // REMOVE
       nameList.remove(3);
       System.out.println(nameList);
       System.out.println("size is " + nameList.size());
    }
 }