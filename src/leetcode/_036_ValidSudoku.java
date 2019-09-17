package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _036_ValidSudoku {

//	public static boolean isValid(char[] s) {
//		
//		for (int i = 0; i < s.length; i++) {
//			if (s[i] == '.') {
//				continue;
//			}
//			
//			for (int j = i + 1; j < s.length; j++) {
//				if (s[j] == '.') {
//					continue;
//				}
//				
//				if (s[i] == s[j]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//	
//	public static boolean isValidbyRow(char[][] board) {
//		
//		for (int i = 0; i < 9; i++) {
//			if (isValid(board[i]) == false) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	public static boolean isValidbyColumn(char[][] board) {
//		
//		char[][] b =  new char[9][9];
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				b[i][j] = board[j][i]; 
//			}
//		}
//		
//		for (int i = 0; i < 9; i++) {
//			if (isValid(b[i]) == false) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static boolean isValidbyBoxes(char[][] board) {
//		
//		char[][] b = new char[9][9];
//		int l = 0;
//		for (int r = 0; r < 9; r++) {
//			for (int i = r / 3 * 3; i < r / 3 * 3 + 3; i++) {
//				if (r % 3 == 0) {
//					for (int j = 0; j < 3; j++) {
//						b[r][l++] = board[i][j];
//					}
//				}
//				else if (r % 3 == 1) {
//					for (int j = 3; j < 6; j++) {
//						b[r][l++] = board[i][j];
//					}
//				}
//				else {
//					for (int j = 6; j < 9; j++) {
//						b[r][l++] = board[i][j];
//					}
//				}
//				
//			}
//			l = 0;
//		}
//		
//		for (int i = 0; i < 9; i++) {
//			if (isValid(b[i]) == false) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	
	public static boolean isValidSudoku(char[][] board) {
        
		Set seen = new HashSet();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char number = board[i][j];
				if (number != '.') {
					if (!seen.add(number + "in row" + i) ||
						!seen.add(number + "in column" + j) ||
						!seen.add(number + "in block" + i/3 + "-" + j/3)) {
						return false;
					}
				}
			}
		}
		return true;
		
//		return isValidbyRow(board) && isValidbyColumn(board) && isValidbyBoxes(board);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = {	{'8','3','.','.','7','.','.','.','.'},
							{'6','.','.','1','9','5','.','.','.'},
							{'.','9','3','.','.','.','.','6','.'},
							{'5','.','.','.','6','.','.','.','3'},
							{'4','.','.','8','.','3','.','.','1'},
							{'7','.','.','.','2','.','.','.','6'},
							{'.','6','.','.','.','.','2','8','.'},
							{'.','.','.','4','1','9','.','.','5'},
							{'.','.','.','.','8','.','.','7','9'}};
		
		
		System.out.println(isValidSudoku(board));
	}

}
