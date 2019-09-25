package leetcode;

//import java.util.Arrays;

public class _088_MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
//		for (int i = 0; i < n; i++) {
//			nums1[m+i] = nums2[i];
//		}
//		Arrays.sort(nums1);
		
		int pos = m + n - 1;
		m--;
		n--;
		while (m >= 0 && n >= 0) {
			nums1[pos--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
		}
		
		while (n >= 0) {
			nums1[pos--] = nums1[n--];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_088_MergeSortedArray solution = new _088_MergeSortedArray();
		int[] nums1 = new int[6];
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		int[] nums2 = {2, 5, 6};
		solution.merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);
		}
	}

}
