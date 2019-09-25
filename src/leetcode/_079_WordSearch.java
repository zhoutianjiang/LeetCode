package leetcode;

public class _079_WordSearch {
	
	public static char[][] bd;
	public static String wd;
	public static boolean[][] flag;
	public static int[][] dircection = {{-1,0}, {0,-1}, {1,0},{0,1}};
	
	public static boolean exist(char[][] board, String word) {
		
		bd = board;
		wd = word;
		flag = new boolean[bd.length][bd[0].length];
		
		for (int i = 0; i < bd.length; i++) {
			for (int j = 0; j < bd[0].length; j++) {
				if (dfs(i, j, 0)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean dfs(int i, int j, int start) {
		
		if (start == wd.length() - 1) {
			return bd[i][j] == wd.charAt(start);
		}
		
		if (bd[i][j] == wd.charAt(start)) {
			flag[i][j] = true;
			for (int k = 0; k < 4; k++) {
				int newX = i + dircection[k][0];
				int newY = j + dircection[k][1];
				if (inArea(newX, newY) && !flag[newX][newY]) {
					if (dfs(newX, newY, start + 1)) {
						return true;
					}
				}
			}
			flag[i][j] = false; 
		}
		
		return false;
	}
	
	public static boolean inArea(int x, int y) {
		
		return x >=0 && x < bd.length && y >= 0 && y < bd[0].length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {{'A','B','C','E'},
						{'S','F','C','S'},
						{'A','D','E','E'}};
		System.out.println(exist(board, "ADEC"));
		
	}

}
