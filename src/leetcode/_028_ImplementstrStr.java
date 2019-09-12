package leetcode;

public class _028_ImplementstrStr {
	
	public static int strStr(String haystack, String needle) {
		
		//return haystack.indexOf(needle);
		
		if (needle.length() == 0 || haystack.equals(needle)) {
			return 0;
		}
		
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (haystack.substring(i, i+needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "mississipipi";
		String needle = "issipi";
		System.out.println(strStr(haystack, needle));
	}

}
