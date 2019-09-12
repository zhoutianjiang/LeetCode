package leetcode;

public class _027_RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
        
		if (nums.length == 0) return 0;
		
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		
		return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,2,23,2,2,3,3};
		int target = 3;
		int n = removeElement(nums, target);
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i]);
		}
		
	}

}
