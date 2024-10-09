package com.bptn.course._04_arrays;

public class CodeChallenge {

	public static void main(String[] args) {
		int []nums = {2, 7, 11, 15};
		int target = 9;
		
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = i + 1; j < nums.length-1; j++)
			if((nums[i] + nums[j]) == target) {
				System.out.println("[" + i + "," + (i + 1) + "]");
			}
		}

	}

}
