package leetcode;

public class _067_AddBinary {
	
	public static String addBinary(String a, String b) {
        
		String res = "";
        int flag = 0;
        int m = a.length(), n = b.length();
        for (int i = m - 1, j = n - 1; i >= 0 || j >= 0; i--, j--) {
        	int x, y;
        	if (i < 0) x = 0;
        	else x = a.charAt(i) - '0';
        	if (j < 0) y = 0;
        	else y = b.charAt(j) - '0';
        	
        	int t = x + y + flag;
			if (t < 2) {
				res = t + "".concat(res);
				flag = 0;
			}
			else {
				res = t - 2 + "".concat(res);
				flag = 1;
			}
		}
        
        if (flag == 1) {
        	res = flag + "".concat(res);
		}
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "0";
		String b = "10";
		System.out.println(addBinary(a, b));
	}

}
