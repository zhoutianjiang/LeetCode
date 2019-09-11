package leetcode;

public class _014_LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		
		if (strs.length == 0) {
			return "";
		}
		
		String same = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(same) != 0) {
				same = same.substring(0, same.length()-1);
				if (same.isEmpty() == true) {
					return "";
				}
			}
		}
        return same;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = new String[3];
		strs[0] = "abcv";
		strs[1] = "aabc";
		strs[2] = "ab";
		System.out.println(longestCommonPrefix(strs));
	}

}
