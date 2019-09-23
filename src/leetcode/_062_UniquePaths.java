package leetcode;


public class _062_UniquePaths {

//	public static int factorial(int n) {
//		int sum = 1;
//		for (int i = 1; i <= n; i++) {
//			sum = sum * i;
//		}
//		return sum;
//	}
	
	public static int uniquePaths(int m, int n) {
		
		int[][]dp = new int[m][n];
        for (int i = 0; i < n; i++) {
			dp[0][i] = 1;
		}
        for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];  
			}
		}
		return dp[m-1][n-1];
        
//		return  factorial(m+n-2)/(factorial(m-1)*factorial(n-1));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniquePaths(3, 4));
	}

}
