package leetcode;
 

public class _048_RotateImage {
	
	
	
	public static void rotate(int[][] matrix) {
		
        int n = matrix.length;
        boolean[][] flag = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (flag[i][j]) {
					continue;
				}
				int t = matrix[j][flag.length-1-i];
				matrix[j][flag.length-1-i] = matrix[i][j];
				matrix[i][j] = t; 
				flag[j][flag.length-1-i] = true;
			}
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},
				  		  {4,5,6},
				  		  {7,8,9}};
		
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
