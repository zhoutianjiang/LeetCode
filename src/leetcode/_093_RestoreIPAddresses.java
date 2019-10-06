package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _093_RestoreIPAddresses {

	public List<String> restoreIpAddresses(String s) {
        
		List<String> list = new ArrayList<String>();
//		int len = s.length();
//		for (int i = 0; i < 3; i++) {
//			for (int j = i + 1; j < i + 4; j++) {
//				for (int k = j + 1; k < j + 4; k++) {
//					if (i < len && j < len && k < len) {
//						String temp1 = s.substring(0, i + 1);
//						String temp2 = s.substring(i + 1, j + 1);
//						String temp3 = s.substring(j + 1, k + 1);
//						String temp4 = s.substring(k + 1);
//						if (helper(temp1) && helper(temp2) && helper(temp3) && helper(temp4)) {
//							list.add(temp1 + "." + temp2 + "." + temp3 + "." + temp4);
//						}
//					}
//				}
//			}
//		}
		backtrack(list, "", s, 0, 4);
		return list;
    }
	
//	public boolean helper(String temp) {
//		
//		if (temp.length() == 0 || temp.length() > 3 || 
//				(temp.charAt(0) == '0' && temp.length() > 1) ||
//				Integer.valueOf(temp) > 255) {
//			return false;
//		}
//		
//		return true;
//	}

	public void backtrack(List<String> list, String temp, String s, int start,  int flag) {
		
		if (start == s.length() && flag == 0) {
			list.add(temp.substring(0, temp.length() - 1));
			return;
		}
		
		if (flag < 0 || start > s.length()) {
			return;
		}
		
		for (int i = start; i < start + 3; i++) {
			if (i < s.length()) {
				if (i == start && s.charAt(i) == '0') {
					backtrack(list, temp + s.charAt(i) + ".", s, i + 1, flag - 1);
					break;
				}
				if (Integer.valueOf(s.substring(start, i + 1)) < 256) {
					backtrack(list, temp + s.substring(start, i + 1) + ".", s, i + 1, flag - 1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_093_RestoreIPAddresses solution = new _093_RestoreIPAddresses();
		String s = "222222";
		System.out.println(solution.restoreIpAddresses(s));
	}

}
