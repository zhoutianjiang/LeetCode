package leetcode;

public class _008_StringtoInteger {
	
	public static int myAtoi(String str) {
		
        if (str.length() < 1) {
			return 0;
		}
		long res = 0;
		int flag = 1;
		while (str.charAt(0) == ' ') {
			if (str.length() <= 1) {
				break;
			}
				str = str.substring(1);
		}
		if (str.charAt(0) == '-') {
			flag = -1;
			str = str.substring(1);
		}
		else if (str.charAt(0) == '+') {
			flag = 1;
			str = str.substring(1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				break;
			}
			else {
				res = res * 10 + (int)str.charAt(i) - 48;
			}
			if (res > Integer.MAX_VALUE) {
				return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}
		res = res * flag;
		return (int)res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9223372022222222222222222";
		System.out.println(myAtoi(s));
		System.out.println((int)'-');
		
	}

}
