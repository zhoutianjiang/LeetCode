package leetcode;

import java.util.HashSet;
import java.util.Set;


public class _073_SetMatrixZeroes {
	
	public static void setZeroes(int[][] matrix) {
        
		int m = matrix.length, n = matrix[0].length;
		
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (rows.contains(i) || cols.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{0,1,2,0},
				  {3,4,5,2},
				  {1,3,1,5}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		setZeroes(matrix);
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
