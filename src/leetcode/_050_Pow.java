package leetcode;

public class _050_Pow {

	public static double myPow(double x, int n) {
		long N = n;
        if (N < 0) {
			x = 1 / x;
			N = -N;
		}
        double res = 1;
        double temp = x;
        for (long i = N; i > 0; i /= 2) {
			if (i % 2 == 1) {
				res = res * temp;
			}
			temp = temp * temp;
		}
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2, 5));
	}

}
