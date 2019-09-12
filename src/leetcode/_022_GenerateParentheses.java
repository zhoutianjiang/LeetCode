package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _022_GenerateParentheses {
	
	public static List<String> generateParenthesis(int n) {
		
		List<String> list = new ArrayList<String>();
		backtrack(list, "", 0, 0, n);
		return list;
    }
	
	public static void backtrack(List<String> list, String s, int open, int close, int max) {
		
		// »ØËİ·¨
		if (s.length() == max * 2) {
			list.add(s);
			return;
		}
		
		if (open < max) {
			backtrack(list, s+"(", open+1, close, max);
		}
		if (close < open) {
			backtrack(list, s+")", open, close+1, max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(generateParenthesis(3));
	}

}
