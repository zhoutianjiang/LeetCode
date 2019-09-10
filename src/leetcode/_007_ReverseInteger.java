package leetcode;

public class _007_ReverseInteger {
	
	public static int reverse(int x) {
		long s = 0;
		while (x != 0) {
			s = s * 10 + (x % 10);
			x = x / 10;
		}
		if (x < 0) {
			s = - s;
		}
        if (s < Integer.MIN_VALUE  || s > Integer.MAX_VALUE) {
			return 0;
		}
		else{
            return (int)s;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -41235555;
		System.out.println(reverse(x));
		System.out.println(Integer.MAX_VALUE+"  "+Integer.MIN_VALUE);
	}

}
