package leetcode;

public class _079_WordSearch {
	
	public char[][] board;
	public String word;
	public boolean[][] flag;
	public int[][] dircection = {{-1,0}, {0,-1}, {1,0},{0,1}};
	
	public boolean exist(char[][] board, String word) {
		
		this.board = board;
		this.word = word;
		flag = new boolean[board.length][board[0].length];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(i, j, 0)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean dfs(int i, int j, int start) {
		
		if (start == word.length() - 1) {
			return board[i][j] == word.charAt(start);
		}
		
		if (board[i][j] == word.charAt(start)) {
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
	
	public boolean inArea(int x, int y) {
		
		return x >=0 && x < board.length && y >= 0 && y < board[0].length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {{'A','B','C','E'},
						{'S','F','C','S'},
						{'A','D','E','E'}};
		_079_WordSearch solution = new _079_WordSearch();
		System.out.println(solution.exist(board, "ADEC"));
		
		
	}

}
