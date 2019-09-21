package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _054_SpiralMatrix {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        
		List<Integer> list = new ArrayList<Integer>();

		if (matrix.length == 0) {
			return list;
		}
		
		int r1 = 0, r2 = matrix.length - 1;
		int c1 = 0, c2 = matrix[0].length - 1;
		
		while (r1 <= r2 && c1 <= c2) {
			for (int i = c1; i <= c2; i++) {
				list.add(matrix[r1][i]);
			}
			for (int i = r1 + 1; i <= r2; i++) {
				list.add(matrix[i][c2]);
			}
			if (r1 < r2 && c1 < c2) {
				for (int i = c2 - 1; i >= c1 + 1; i--) {
					list.add(matrix[r2][i]);
				}
				for (int i = r2; i >= r1 + 1; i--) {
					list.add(matrix[i][r1]);
				}
			}
			
			r1++;
			c1++;
			r2--;
			c2--;
		}
		return list;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{ 1, 2, 3 },
				 { 4, 5, 6 },
				 { 7, 8, 9 }};
		System.out.println(spiralOrder(matrix));
		
	}

}
