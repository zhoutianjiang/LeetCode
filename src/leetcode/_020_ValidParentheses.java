package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _020_ValidParentheses {
	
	public static boolean isValid(String s) {
        
		if (s.length() == 0) {
			return true;
		}
		
		if (s.length() % 2 != 0) {
			return false;
		}
		
		Map<Character, Character> bracket = new HashMap<Character, Character>(){{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
		
		// zhan
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (bracket.containsKey(c)) {
				char top = stack.isEmpty() ? 'x' : stack.pop();
				if (bracket.get(c) != top) {
					return false;
				}
			}
			else {
				stack.push(c);
			}
		}
		
//		for (int i = 1; i < s.length(); i++) {
//			
//			if (bracket.containsKey(s.charAt(i)) && bracket.get(s.charAt(i)) == s.charAt(i - 1)) {
//				if (i - 1 == 0) {
//					s = s.substring(i + 1);
//				}
//				else {
//					s = s.substring(0, i - 1) + s.substring(i + 1);
//				}
//				i = 0;
//			}
//		}
		
		if (stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(){}{}";
		System.out.println(isValid(s));
	}

}
