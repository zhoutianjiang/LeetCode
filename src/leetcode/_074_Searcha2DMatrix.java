package leetcode;

public class _074_Searcha2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
        
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		
		int m = matrix.length, n = matrix[0].length;
		int left = 0, right = m * n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (matrix[mid/n][mid%n] == target) {
				return true;
			}
			else if (matrix[mid/n][mid%n] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1},{2},{6}};
		System.out.println(searchMatrix(matrix, 4));
	}

}
