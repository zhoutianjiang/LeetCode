package leetcode;

public class _009_PalindromeNumber {

	public static boolean isPalindrome(int x) {
        
		if (x < 0) {
			return false;
		}
		if (x == 0) {
			return true;
		}
		int res = 0;
		int xx = x;
		while (xx != 0) {
			res = res * 10 + xx % 10;
			xx = xx / 10;
		}
		if (res == x) {
			return true;
		}
		else {
			return false;
		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.println(isPalindrome(x));
	}

}
