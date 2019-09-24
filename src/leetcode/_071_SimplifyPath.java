package leetcode;

import java.util.Stack;

public class _071_SimplifyPath {

	public static String simplifyPath(String path) {
        
		String[] s = path.split("/");
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < s.length; i++) {
			if (!stack.isEmpty() && s[i].equals("..")) {
				stack.pop();
			}
			else if (!s[i].equals("") && !s[i].equals(".") && !s[i].equals("..")) {
				stack.push(s[i]);
			}
		}
		
		if (stack.isEmpty()) {
			return "/";
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < stack.size(); i++) {
			sb.append("/" + stack.get(i));
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/foo";
		System.out.println(simplifyPath(path));
	}

}
