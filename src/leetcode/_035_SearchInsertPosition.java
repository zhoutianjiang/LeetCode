package leetcode;

public class _035_SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
        
//		if (nums.length < 1) {
//			return 0;
//		}
//		
//		int i = 0;
//		while (nums[i] < target) {
//			i++;
//			if (i == nums.length) {
//				return nums.length;
//			}
//		}
//		return i;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}

}
