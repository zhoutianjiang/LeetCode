package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _077_Combinations {

	public static void backtrack(List<List<Integer>> list, List<Integer> temp, int n, int k, int start) {
		
		if (k == temp.size()) {
			list.add(new ArrayList<Integer>(temp));
		}
		else {
			for (int i = start; i <= n; i++) {
				temp.add(i);
				backtrack(list, temp, n, k, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public static List<List<Integer>> combine(int n, int k) {
		
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtrack(list, new ArrayList<Integer>(), n, k, 1);
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(combine(4, 2));
	}

}
