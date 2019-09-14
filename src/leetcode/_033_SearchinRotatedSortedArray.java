 package leetcode;

public class _033_SearchinRotatedSortedArray {
	
	public static int search(int[] nums, int target) {

		if (nums.length == 0) {
			return -1;
		}
		
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			
			if (nums[left] <= nums[mid]) {
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
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,4,5,6,0,1,2};
		System.out.println(search(nums, 0));
		
		
	}

}
