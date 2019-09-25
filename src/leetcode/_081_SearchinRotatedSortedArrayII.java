package leetcode;

public class _081_SearchinRotatedSortedArrayII {
	
	public boolean search(int[] nums, int target) {
		
		if (nums.length == 0) {
			return false;
		}
		
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return true;
			}
			
			if (nums[left] == nums[mid]) {
				left++;
			}
			else if (nums[left] < nums[mid]) {
				if (nums[left] <= target && target < nums[mid]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			else {
				if (nums[mid] < target && target <= nums[right]) {
					left = mid + 1;
				}
				else {
					right = mid - 1;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,1,1,1};
		_081_SearchinRotatedSortedArrayII solution = new _081_SearchinRotatedSortedArrayII();
		System.out.println(solution.search(nums, 3));
	}

}
