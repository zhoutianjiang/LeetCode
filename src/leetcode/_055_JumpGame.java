package leetcode;

public class _055_JumpGame {

	public static boolean canJump(int[] nums) {
        
		if (nums.length == 0) {
			return false;
		}
		
		int flag = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= flag) {
				flag = i;
			}
		}
		return flag == 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,0,1,6};
		System.out.println(canJump(nums));
	}

}
