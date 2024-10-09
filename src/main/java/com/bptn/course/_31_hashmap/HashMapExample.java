package com.bptn.course._31_hashmap;

import java.util.HashMap;


public class HashMapExample {
    public static void main(String[] args) {

        // Creating a HashMap and populating it with initial key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John",25);
        map.put("Jane", 30);
        map.put("Jack", 35);

        // Iterating a HashMap using the keySet() method.
        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Using the put() and get() methods to update the value for an existing key
        map.put("John", map.get("John") + 5);
        System.out.println("John's new age: " + map.get("John"));
        
        // Using the containsKey() method to check if a key exists in the map.
        if (map.containsKey("Jane")) {
            System.out.println("The key 'Jane' exists in the map");
        }
        
        // Using the containsValue() method to check if a value exists in the map.
        if (map.containsValue(30)) {
            System.out.println("The value '30' exists in the map");
        }
        
        // Using the putIfAbsent() method to add a key-value pair only if the key is not present in the map
        map.putIfAbsent("Mike", 42);
        System.out.println("Mike's age: " + map.get("Mike"));
    }
}