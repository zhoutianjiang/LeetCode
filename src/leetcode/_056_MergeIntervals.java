package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _056_MergeIntervals {
	
	

	public static int[][] merge(int[][] intervals) {
		
		List<int[]> res = new ArrayList<int[]>();
		if (intervals.length == 0) {
			return res.toArray(new int[0][]);
		}
		
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		
		int i = 0;
		while (i < intervals.length) {
			int left = intervals[i][0];
			int right = intervals[i][1];
			while (i < intervals.length - 1 && right >= intervals[i+1][0]) {
				i++;
				right = Math.max(right, intervals[i][1]);
			}
			res.add(new int[] {left, right});
			i++;
		}
        return res.toArray(new int[0][]);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intervals = {{1,3},{10,12},{2,10},{15,18}};
		int[][] res = merge(intervals);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
