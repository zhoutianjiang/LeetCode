package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _015_3Sum {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		if (nums.length < 3) {
			return res;
		}
		
		Arrays.sort(nums);
		int j, k;
		for (int i = 0; i < nums.length - 2; i++) {
			j = i + 1;
			k = nums.length -1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0 && res.contains(Arrays.asList(nums[i], nums[j], nums[k])) == false) {
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
				}else if (sum < 0) {
					j++;
				}else {
					k--;
				}
			}
		}
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,0,-1,-2,-3};
		System.out.println(threeSum(nums));
	}

}
