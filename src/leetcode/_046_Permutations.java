package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _046_Permutations {
	
	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
		
		if (temp.size() == nums.length) {
			list.add(new ArrayList<Integer>(temp));
		}
		else {
			for (int i = 0; i < nums.length; i++) {
				if (temp.contains(nums[i])) {
					continue;
				}
				temp.add(nums[i]);
				backtrack(list, temp, nums);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		List<Integer> temp = new ArrayList<Integer>();
		backtrack(list, temp, nums);
		return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}

}
