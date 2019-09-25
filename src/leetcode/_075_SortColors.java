package leetcode;

public class _075_SortColors {

	public static void sortColors(int[] nums) {
        
		int p0 = 0, curr = 0;
		int p2 = nums.length - 1;
		
		int temp;
		while (curr <= p2) {
			if (nums[curr] == 0) {
				temp = nums[p0];
				nums[p0] = nums[curr];
				nums[curr] = temp;
				p0++;
				curr++;
			}
			else if (nums[curr] == 2) {
				temp = nums[p2];
				nums[p2] = nums[curr];
				nums[curr] = temp;
				p2--;
			}
			else {
				curr++;
			}
		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

}
