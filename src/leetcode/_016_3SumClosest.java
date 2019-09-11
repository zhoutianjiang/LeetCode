package leetcode;

import java.util.Arrays;

public class _016_3SumClosest {
	
	public static int threeSumClosest(int[] nums, int target) {
		
//		if (nums.length < 3) {
//			throw new IllegalArgumentException("Numbers are less than three.");
//		}	
//		int min = nums[0] + nums[1] + nums[2];
//		for (int i = 0; i < nums.length - 2; i++) {
//			for (int j = i + 1; j < nums.length - 1; j++) {
//				for (int k = j + 1; k < nums.length; k++) {
//					int sum = nums[i] + nums[j] + nums[k];
//					if (Math.abs(min - target) > Math.abs(sum - target)) {
//						min = sum;
//					}
//				}
//			}
//		}
//		return min;
		
		if (nums.length < 3) {
			throw new Error("Numbers are less than three.");
		}
		
		Arrays.sort(nums);
		int min = nums[0] + nums[1] + nums[2];
		int j, k;
		for (int i = 0; i < nums.length; i++) {
			j = i + 1;
			k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == target) {
					return sum;
				}else if (sum < target) {
					j++;
				}else {
					k--;
				}
				if (Math.abs(min - target) > Math.abs(sum - target)) {
					min = sum;
				}
			}
		}
		return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,4,8,16,32,64,128};
		int target = 82;
		System.out.println(threeSumClosest(nums, target));
	}

}
