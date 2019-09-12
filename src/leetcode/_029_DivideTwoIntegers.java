package leetcode;

public class _029_DivideTwoIntegers {
	
	public static int divide(int dividend, int divisor) {
		
		if (divisor == 0) {
			throw new Error("divisor is zero.");
		}
		
		if (dividend == 0) {
			return 0;
		}
		
		if (dividend == divisor) {
			return 1;
		}
		
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}

		if (divisor == 1) {
			return dividend;
		}
		
		if (divisor == -1) {
			return -dividend;
		}
		
		if (divisor == Integer.MIN_VALUE) {
			return 0;
		}
		
		long res = 0;
		int flag = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			flag = -1;
		}
		
		long div1 = Math.abs((long)dividend);
		long div2 = Math.abs((long)divisor);
		
		
		while (div1 >= div2) {
			res++;
			div1 -= div2;
		}
		if (flag < 0) {
			String minus = "-";
			res = Integer.parseInt(minus.concat(String.valueOf(res)));
		}
		return (int)res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividend = -222;
		int divisor = 2;
		System.out.println(divide(dividend, divisor));
	}

}
