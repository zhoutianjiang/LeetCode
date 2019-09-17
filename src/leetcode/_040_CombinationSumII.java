package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _040_CombinationSumII {

	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int remains, int start) {
		if (remains < 0) {
			return;
		}
		else if (remains == 0) {
//			if (list.contains(temp) != true) {
				list.add(new ArrayList<Integer>(temp));
//			}
		}
		else {
			for (int i = start; i < nums.length; i++) {
				if (i > start && nums[i] == nums[i-1]) {
					continue;
				}
				temp.add(nums[i]);
				backtrack(list, temp, nums, remains - nums[i], i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backtrack(res, new ArrayList<Integer>(), candidates, target, 0);
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candidates = {2,5,1,2,1};
		int target = 5;
		System.out.println(combinationSum2(candidates, target));		
	}

}
