package leetcode;

public class _034_FindFirstandLastPositionofElementinSortedArray {
	
	public static int[] searchRange(int[] nums, int target) {

		int[] res = {-1, -1};

		if (nums.length == 0) return res;

		if (nums.length == 1 && nums[0] != target) {
			return res;
		}
			
		int left = 0, right = nums.length - 1;
			
		while (left <= right) {
				
			if (nums[left] == target && target == nums[right]) {
				break;
			}
				
			if (nums[left] < target) {
				left++;
			}
				
			if (target < nums[right]) {
				right--;
			}
				
			if (target < nums[left] || nums[right] < target) {
				left = -1;
				right = -1;
				break;
			}
		}
			
		res[0] = left;
		res[1] = right;
			
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int target = 3;
		int[] res = searchRange(nums, target);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}

}
