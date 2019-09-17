package leetcode;

public class _038_CountandSay {
	
	// read off the same and continuous numbers 
	public static int readOff(String s, char c, int j) {
		
		int i = j;
		while (i < s.length() && s.charAt(i) == c) {
			i++;
		}
		return i-j;
	}

	public static String countAndSay(int n) {
		
        String number = "1";
		for (int i = 1; i < n; i++) {
			String temp = "";
			for (int j = 0; j < number.length(); j++) {
				int x = readOff(number, number.charAt(j), j);
				temp += String.valueOf(x) + number.charAt(j);
				j += x - 1;
			}
			number = temp;
		}
		return number;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		System.out.println(countAndSay(n));
	}

}
