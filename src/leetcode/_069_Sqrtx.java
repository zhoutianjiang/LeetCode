package leetcode;

public class _069_Sqrtx {
	
	public static int mySqrt(int x) {
		
		
		
		//	牛顿迭代法
//		long a = x;
//		while (a * a > x) {
//			a = (a + x / a) / 2;
//		}
//		
//		return (int)a;
		
		//	二分法
        if (x == 0 || x == 1) {
			return x;
		}
        long left = 1;
        long right = x / 2;
        while (left < right) {
			long mid = (left + right + 1) / 2;
			if (mid * mid > x) {
				right = mid - 1;
			}
			else {
				left = mid;
			}
		}
		return (int)(left);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(4));
	}

}
