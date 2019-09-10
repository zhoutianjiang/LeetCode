package leetcode;

public class _005_LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
		if (s == "" || s.length() < 1) {
			return s;
		}
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundSenter(s, i, i);
			int len2 = expandAroundSenter(s, i, i+1);
			int len = (len1 > len2) ? len1 : len2;
			if (len > end - start) {
				start = i - (len- 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
    }
	
	public static int expandAroundSenter(String s, int left, int right) {
		while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left -1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaasaa";
		System.out.println(longestPalindrome(s));
	}

}
