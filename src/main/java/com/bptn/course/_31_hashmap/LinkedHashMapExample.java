package com.bptn.course._31_hashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

        // Creating a HashMap and populating it with initial key-value pairs
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jack", 35);

        // Iterating a LinkedHashMap using the keySet() method.
        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Using the get() method to access a value
        System.out.println("John's age: " + map.get("John"));

        // Using the put() method to update the value for a given key
        map.put("John", 30);
        System.out.println("John's new age: " + map.get("John"));

        // Using the remove() method to remove a key-value pair
        map.remove("Jane");
        System.out.println("Jane's age: " + map.get("Jane"));

        // Using the keySet() method to access the keys in the LinkedHashMap
        System.out.println("Keys in the LinkedHashMap: " + map.keySet());

        // Using the values() method to access the values in the LinkedHashMap
        System.out.println("Values in the LinkedHashMap: " + map.values());

        // Using the entrySet() method to access the key-value pairs in the LinkedHashMap
        System.out.println("Key-value pairs in the LinkedHashMap: " + map.entrySet());
    }
}
