package com.bptn.course._31_hashmap;

//Import the HashMap class
import java.util.HashMap;

public class HashMapDemo {

 public static void main(String[] args) {
     HashMap<String, Integer> people = new HashMap<>();
     people.put("Angie", 33);
     people.put("Steve", 30);
     people.put("John", 32);
     for(String i : people.keySet()){
         System.out.println("Name: " + i + ", " + "Age: " + people.get(i));
     }

 }
}

