package leetcode;

public class _006_ZigZagConversion {
	
	public static String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		int m = numRows-1, n = s.length();
		String c = "";
        for (int r = 0; r <= m; r++) {
			for (int i = 0; i < n; i++) {
				if (i % (2 * m) == r || i % (2 * m) == 2 * m - r) {
					c += s.charAt(i);
				}
			}
		}
		return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int numRows = 4;
		System.out.println(convert(s, numRows));
	}

}
