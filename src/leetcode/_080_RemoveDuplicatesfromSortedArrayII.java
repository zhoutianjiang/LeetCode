package leetcode;

public class _080_RemoveDuplicatesfromSortedArrayII {
	
	public int removeDuplicates(int[] nums) {
		
		if (nums.length <= 2) {
			return nums.length;
		}
		
		int current = 1;
		for (int i = 2; i < nums.length; i++) {
			if (nums[current-1] != nums[i]) {
				current++;
				nums[current] = nums[i];
				
			}
		}
		
		return current + 1;
		
//		int flag = 1;
//		int n = nums.length;
//		for (int i = 1; i < n; i++) {
//			if (nums[i] == nums[i-1]) flag++;
//			else flag = 1;
//			if (flag > 2) {
//				for (int j = i; j < n - 1; j++) {
//					nums[j] = nums[j+1];
//				}
//				n--;
//				i--;
//			}
//		}
//		return n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1,2,2,2,3,3,3};
		_080_RemoveDuplicatesfromSortedArrayII solution = new _080_RemoveDuplicatesfromSortedArrayII();
		int n = solution.removeDuplicates(nums);
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i]);
		}
	}

}
