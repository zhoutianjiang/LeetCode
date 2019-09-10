package leetcode;

public class _001_TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int x[] = {i, j};
					return x;
				}
			}
		}
		throw new IllegalArgumentException("No such combination.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		int s[] = twoSum(nums, target);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			if (i < s.length-1) {
				System.out.print(",");
			}
		}
	}

}
