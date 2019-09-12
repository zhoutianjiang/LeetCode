package leetcode;

public class _026_RemoveDuplicatesfromSortedArray {

	public static int removeDuplicates(int[] nums) {
		
        int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i+1]) {
				for (int j = i + 1; j < n - 1; j++) {
					nums[j] = nums[j+1];
				}
				i--;
				n--;
			}
		}
		return n;
		
//		if (nums.length == 0) return 0;
//		
//		int n = 0;
//		for (int j = 1; j < nums.length; j++) {
//			if (nums[n] != nums[j]) {
//				n++;
//				nums[n] = nums[j]; 
//			}
//		}
//		return n + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		for (int i = 0; i < removeDuplicates(nums); i++) {
			System.out.print(nums[i]);
		}
	}

}
