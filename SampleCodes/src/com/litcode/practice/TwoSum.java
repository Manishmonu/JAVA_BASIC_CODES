package com.litcode.practice;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,5,7,12};
		int target = 9;
		int[] result =twoSum(nums, target);

	}
	public static int[] twoSum(int[] nums, int target) {
      
		for(int i = 0; i<nums.length; i++) {
			for(int j=0; j<i; j++) {
				if(target == nums[i]+nums[j]) {
					System.out.println("Target found...");
					return new int[]{i, j};
				}
			}
		}
		
		return null;
    }

}
