package leetcode;

public class _058_LengthofLastWord {
	
	public static int lengthOfLastWord(String s) {
		
		int end = s.length() - 1;
		while (end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		if (end < 0) {
			return 0;
		}
		int start = end;
		while (start >= 0 && s.charAt(start) != ' ') {
			start--;
		}
		return end - start;
//		while (s.length() != 0) {
//			int i = s.lastIndexOf(' ');
//			if (i == s.length() - 1) {
//				s = s.substring(0, i);
//			}
//			else if (i == -1){
//				break;
//			}
//			else {
//				s = s.substring(i+1);
//				break;
//			}
//		}
//		
//		if (s.length() == 0) {
//			return 0;
//		}
//		else {
//			return s.length();
//		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc aaa  ddd  ";
		System.out.println(lengthOfLastWord(s));
		
	}

}
