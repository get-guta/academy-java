package com.bptn.course._36_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	
	static void bubbleSort(int array[]) {
		int size = array.length;
		
		//loop for every array element
		for(int i = 0; i < size - 1; i++) {
			
			//loop for comparison
			for(int j = 0; j < size - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		
		int[] data = {5, 3, -1, 7, 10, 2};
		System.out.println("Before Sort:" + Arrays.toString(data));
		bubbleSort(data);
		System.out.println("After Sort:" + Arrays.toString(data));
		
	}

}
