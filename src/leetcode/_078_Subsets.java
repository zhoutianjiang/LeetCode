package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _078_Subsets {

	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start) {
		
		list.add(new ArrayList<Integer>(temp));
		
		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtrack(list, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
		
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(), nums, 0);
		return list;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}

}
