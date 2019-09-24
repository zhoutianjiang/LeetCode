package leetcode;

public class _070_ClimbingStairs {

//	public static double factorial(int x) {
//		
//		double sum = 1;
//		for (int i = 1; i <= x; i++) {
//			sum *= i;
//		}
//		return sum;
//	}
	
	public static int climbStairs(int n) {
        
		//	动态规划
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
		//	排列组合方法
//		double sum = 0;
//		for (int i = 0; i < n / 2 + 1; i++) {
//			int t = n - i;
//			double x = factorial(t) / (factorial(i) * factorial(t-i));
//			sum += x;
//		}
//		
//		return (int)sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(30));
	}

}
