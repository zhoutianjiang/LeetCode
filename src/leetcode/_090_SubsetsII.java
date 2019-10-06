package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _090_SubsetsII {

	public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, int start) {
		
//		if (!list.contains(temp)) {
		list.add(new ArrayList<Integer>(temp));
//		}
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i-1]) {
				continue;
			}
			temp.add(nums[i]);
			backtrack(nums, list, temp, i + 1);
			temp.remove(temp.size() - 1);
		}
		
	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
    
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(nums, list, new ArrayList<Integer>(), 0);
		return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_090_SubsetsII solution = new _090_SubsetsII();
		int[] nums = {4,4,4,1,4};
		System.out.println(solution.subsetsWithDup(nums));
	}

}
