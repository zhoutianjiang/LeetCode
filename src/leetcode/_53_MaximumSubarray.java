package leetcode;

public class _53_MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < dp.length; i++) {
			if (dp[i - 1] >= 0) {
				dp[i] = dp[i-1] + nums[i];
			}
			else {
				dp[i] = nums[i];
			}
		}
		
		int max = dp[0];
		
		for (int i = 1; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		
		return max;
		
		//	O(n)
//		int res = nums[0];
//		int sum = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			if (sum > 0) {
//				sum += nums[i];
//			}
//			else {
//				sum = nums[i];
//			}
//			res = res > sum ? res : sum;
//		}
//     
//		return res;
		
		//	O(n^2)
//		int temp = 0;
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < nums.length; i++) {
//			temp = nums[i];
//			if (temp >= max) {
//				max = temp;
//			}
//			for (int j = i+1; j < nums.length; j++) {
//				temp += nums[j];
//				if (temp >= max) {
//					max = temp;
//				}
//			}
//		}
//		
//		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}
