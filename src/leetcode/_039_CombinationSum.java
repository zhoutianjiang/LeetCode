package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _039_CombinationSum {

	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int remain, int start) {
		
		if (remain < 0) {
			return;
		}
		else if (remain == 0) {
			list.add(new ArrayList<Integer>(temp));
		}
		else {
			for (int i = start; i < nums.length; i++) {
				temp.add(nums[i]);
				backtrack(list, temp, nums, remain - nums[i], i);
				temp.remove(temp.size()-1);
			}
		}
		
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candidates = {2,3,4,5};
		int target = 8;
		System.out.println(combinationSum(candidates, target));
	}

}
