package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _060_PermutationSequence {
	
//	public static void backtrack(List<String> list, String t, String s) {
//		
//		if (t.length() == s.length()) {
//			list.add(t);
//		}
//		else {
//			for (int i = 0; i < s.length(); i++) {
//				if (t.indexOf(s.charAt(i)) != -1) {
//					continue;
//				}
//				t += s.charAt(i);
//				backtrack(list, t, s);
//				t = t.substring(0, t.length()-1);
//			}
//		}
//	}

	public static String getPermutation(int n, int k) {
		
		int[] s = new int[n-1];
		int t = 1;
		for (int i = 1; i < n; i++) {
			s[i-1] = t * i;
			t = s[i-1];
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		String res = "";
		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = i+1; j >= 0; j--) {
				if (k - j * s[i] > 0) {
					res += list.remove(j);
					k -= j *s[i];
					break;
				}
			}
		}
		res += list.remove(0);
		return res;
		
//		String s = "";
//		for (int i = 1; i <= n; i++) {
//			s += i;
//		}
//		List<String> list = new ArrayList<String>();
//		backtrack(list, "", s);
//		System.out.println(list);
//		return list.get(k-1);
		
//		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getPermutation(6, 152));
	}

}
