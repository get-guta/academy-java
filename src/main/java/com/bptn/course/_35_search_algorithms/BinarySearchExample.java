package com.bptn.course._35_search_algorithms;

import java.util.ArrayList;

public class BinarySearchExample {
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid; // Element found, return its index
            }

            if (list.get(mid) < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Element not found in the ArrayList
    }

    public static void main(String[] args) {
        // Create a sorted ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Define the target element to search for
        int target = 30;

        // Perform a binary search to find the target element in the sorted ArrayList
        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the ArrayList");
        }
    }
}