package leetcode;

public class _059_SpiralMatrixII {

	public static int[][] generateMatrix(int n) {
        
		int[][] matrix = new int[n][n];
		
		int r1 = 0, r2 = n-1;
		int c1 = 0, c2 = n-1;
		
		int t = 1;
		
		while (r1 <= r2 && c1 <= c2) {
			for (int c = c1; c <= c2; c++) {
				matrix[r1][c] =  t;
				t++;
			}
			for (int r = r1+1; r <= r2; r++) {
				matrix[r][c2] = t;
				t++;
			}
			for (int c = c2-1; c >= c1+1; c--) {
				matrix[r2][c] = t;
				t++;
			}
			for (int r = r2; r >= r1+1; r--) {
				matrix[r][c1] = t;
				t++;
			}
			r1++;
			r2--;
			c1++;
			c2--;
		}
		
		return matrix;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = generateMatrix(9);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
