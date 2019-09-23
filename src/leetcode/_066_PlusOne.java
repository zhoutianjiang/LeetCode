package leetcode;

public class _066_PlusOne {

	public static int[] plusOne(int[] digits) {
        
		int i = digits.length - 1;
		while (i >= 0) {
			if (digits[i] + 1 < 10) {
				digits[i] += 1;
				return digits;
			}
			else {
				digits[i] = 0;
			}
			i--;
		}
		
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
		
//		if (digits[0] == 0) {
//			int[] new_digits = new int[digits.length + 1];
//			new_digits[0] = 1;
//			return new_digits;
//		}
//		else {
//			return digits;
//		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits = {9};
		digits = plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i] + " ");
		}
	}

}
