package leetcode;

public class _091_DecodeWays {

	public int numDecodings(String s) {
		
		if (s.length() == 0) {
			return 0;
		}
		
		int[] dp = new int[s.length()+1];
		dp[s.length()] = 1;
		if (s.charAt(s.length() - 1) == '0') {
			dp[s.length() - 1] = 0;
		}
		else {
			dp[s.length() - 1] = 1;
		}
		
		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) == '0') {
				dp[i] = 0;
				continue;
			}
			if ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') <= 26) {
				dp[i] = dp[i + 1] + dp[i + 2]; 
			}
			else {
				dp[i] = dp[i + 1];
			}
			
		}
		
		return dp[0];
//		return getRes(s, 0);
    }
	
//	public int getRes(String s, int start) {
//		
//		if (start == s.length()) {
//			return 1;
//		}
//		
//		if (s.charAt(start) == '0') {
//			return 0;
//		}
//		
//		int res1 = getRes(s, start + 1);
//		int res2 = 0;
//		if (start + 1 < s.length()) {
//			int ten = (s.charAt(start) - '0') * 10;
//			int one = s.charAt(start + 1) - '0';
//			if (ten + one <= 26) {
//				res2 = getRes(s, start + 2);
//			}
//		}
//		
//		return res1 + res2;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_091_DecodeWays solution = new _091_DecodeWays();
		String s = "2226";
		System.out.println(solution.numDecodings(s));
	}

}
