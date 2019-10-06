package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _089_GrayCode {

	public List<Integer> grayCode(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for (int i = 0; i < n; i++) {
			int add = 1 << i;
			System.out.println(add);
			for (int j = list.size() - 1; j >= 0; j--) {
				list.add(list.get(j) + add);
			}
		}
		return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_089_GrayCode solution = new _089_GrayCode();
		System.out.println(solution.grayCode(3));
	}

}
