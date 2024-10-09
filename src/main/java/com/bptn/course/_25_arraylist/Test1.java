package com.bptn.course._25_arraylist;

import java.util.*;

public class Test1 {
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        int counter = list.size()-1;
        for (Integer element: list) {
            reversed.add(list.get(counter));
            counter--;

        }
        return reversed;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        ArrayList<Integer> result = reverse(values);
        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
        System.out.println("Your Result:\t\t " + result);
    }
}

