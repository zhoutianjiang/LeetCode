package leetcode;

public class _043_MultiplyStrings {
	
	public static String multiply(String num1, String num2) {
        
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		
		int m = num1.length(), n = num2.length();
		int[] pro = new int[m + n];
		
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int num = temp + pro[p2] + pro[p1] * 10;
				pro[p2] = num % 10;
				pro[p1] = num / 10;
			}
			
		}
		
		String res = "";
		if (pro[0] != 0) {
			res += String.valueOf(pro[0]);
		}
		
		for (int i = 1; i < pro.length; i++) {
			res += String.valueOf(pro[i]);
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = "1111111111111111";
		String num2 = "222";
		System.out.println(multiply(num1, num2));
		
	}

}
