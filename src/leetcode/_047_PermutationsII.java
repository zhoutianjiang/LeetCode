package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _047_PermutationsII {
	
	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] flag) {
		
		if (temp.size() == nums.length) {// && list.contains(temp) == false) {
			list.add(new ArrayList<Integer>(temp));
		}
		else {
			for (int i = 0; i < nums.length; i++) {
				if (flag[i] == true) {
					continue;
				}
				if (i > 0 && nums[i] == nums[i-1] && flag[i-1] == false) {
					continue;
				}
				flag[i] = true;
				temp.add(nums[i]);
				backtrack(list, temp, nums, flag);
				temp.remove(temp.size() - 1);
				flag[i] = false;
			}
		}
		
	}
	
	public static List<List<Integer>> permuteUnique(int[] nums) {
        
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return list;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,2};
		System.out.println(permuteUnique(nums));
		
	}

}
