package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018_4Sum {
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if (nums.length < 4) {
			return res;
		}
		
		Arrays.sort(nums);
		
		int k, l;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				k = j + 1;
				l = nums.length - 1;
				while (k < l) {
					int sum = nums[i] + nums[j] + nums[k] + nums[l];
					if (sum == target && res.contains(Arrays.asList(nums[i], nums[j], nums[k], nums[l])) == false) {
						res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
					}
					else if (sum < target) {
						k++;
					}
					else {
						l--;
					}
				}
			}
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		System.out.println(fourSum(nums, target));
	}

}
