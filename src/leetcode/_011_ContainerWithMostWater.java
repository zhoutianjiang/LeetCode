package leetcode;

public class _011_ContainerWithMostWater {
	
	public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int bottom = j - i;
				int top = height[i] < height[j] ? height[i] : height[j];
				max = max < bottom * top ? bottom * top : max;
			}
		}		
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
