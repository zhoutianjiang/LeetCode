package leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _049_GroupAnagrams {
	
//	public static boolean compareStrtoTemp(String a, List<String> t) {
//		if (t.size() == 0) {
//			return true;
//		}
//		
//		String temp = t.get(0);
//		
//		if (a.length() != temp.length()) {
//			return false;
//		}
//		
//		while (!a.isEmpty()) {
//			int c = temp.indexOf(a.substring(0, 1));
//			if (c == -1) {
//				break;
//			}
//			else {
//				a = a.substring(1);
//				if (c == 0) {
//					temp = temp.substring(1);
//				}
//				else {
//					temp = temp.substring(0, c) + temp.substring(c+1);
//				}
//			}
//		}
//		
//		if (a.isEmpty()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> list = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String i : strs) {
			char[] c = i.toCharArray();
			Arrays.sort(c);
			String keyString = String.valueOf(c);
			
			if (!map.containsKey(keyString)) {
				map.put(keyString, new ArrayList<String>());
			}
			map.get(keyString).add(i);
		}
		list.addAll(map.values());
		return list;
//		List<List<String>> list = new ArrayList<List<String>>();
//		boolean[] flag = new boolean[strs.length];
//		
//		for (int j = 0; j < flag.length; j++) {
//			List<String> temp = new ArrayList<String>();
//			for (int i = 0; i < strs.length; i++) {
//				
//				if (flag[i]) {
//					continue;
//				}
//				
//				if (!compareStrtoTemp(strs[i], temp)) {
//					continue;
//				}
//				
//				
//				flag[i] = true;
//				
//				temp.add(strs[i]);
//				
//			}
//			if (temp.size() != 0) {
//				list.add(new ArrayList<String>(temp));
//			}
//		}
//		
//		return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
		
	}

}
