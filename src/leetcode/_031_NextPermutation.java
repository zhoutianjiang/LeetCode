package leetcode;

import java.util.Arrays;

public class _031_NextPermutation {
	
	public static void nextPermutation(int[] nums) {
		
		if (nums.length <= 1) {
			return;
		}
		
		int i = nums.length - 1;	// i is first permutation point
		int j = i - 1;				// j is second point
		
		// get ascending order
		// find the first smaller number
		// from the back to the front
		while (j >= 0) {
			if (nums[j] < nums[j+1]) {
				i = j;
				break;
			}
			j--;
		}
		
		// if the order is  descending order		
		if (j == -1) {
			Arrays.sort(nums);
			return;
		}
		
		
		// get the second point
		for (int k = i+1; k < nums.length; k++) {
			if (nums[k] > nums[i]) {
				j = k;
			}
		}
		
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
		
		Arrays.sort(nums, i+1, nums.length);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2};
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i<nums.length - 1) {
				System.out.print(",");
			}
		}
		
		System.out.print(" -> ");
		
		nextPermutation(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i<nums.length - 1) {
				System.out.print(",");
			}
		}
	}

}
