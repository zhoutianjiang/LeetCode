package leetcode;

public class _003_LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {
		int num = 0;
        for (int i = 0; i < s.length(); i++) {
        	int x = 0;
        	String temp = "";
        	for (int j = i; j < s.length(); j++) {
        		char c = s.charAt(j);
    			if (temp.contains(c+"") == false) {
    				temp += c;
    				x++;
    			}
    			else {
					break;
				}
        	}
			num = (x > num) ? x : num;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qqqqw";
		
		System.out.println(lengthOfLongestSubstring(s));
	}

}
