package leetcode;

public class _013_Roman_to_Integer {
	
	public static int romanToInt(String s) {
        
		int res = 0;
		while (s.length() > 1) {
			switch (s.charAt(0)) {
			case 'M':
				res += 1000; s = s.substring(1); break;
			case 'D':
				res += 500; s = s.substring(1); break;
			case 'C':
				if (s.charAt(1) == 'M') {
					res += 900; s = s.substring(2);
				}else if (s.charAt(1) == 'D') {
					res += 400; s = s.substring(2);
				}else {
					res += 100; s = s.substring(1);
				}
				break;
			case 'L':
				res += 50; s = s.substring(1); break;
			case 'X':
				if (s.charAt(1) == 'C') {
					res += 90; s = s.substring(2);
				}else if (s.charAt(1) == 'L') {
					res += 40; s = s.substring(2);
				}else {
					res += 10; s = s.substring(1);
				}
				break;
			case 'V':
				res += 5; s = s.substring(1); break;
			case 'I':
				if (s.charAt(1) == 'X') {
					res += 9; s = s.substring(2);
				}else if (s.charAt(1) == 'V') {
					res += 4; s = s.substring(2);
				}else {
					res += 1; s = s.substring(1);
				}
				break;
			default:
				break;
			}
		}
		if (s.length() == 1) {
			switch (s.charAt(0)) {
			case 'M':
				res += 1000; break;
			case 'D':
				res += 500; break;
			case 'C':
				res += 100; break;
			case 'L':
				res += 50; break;
			case 'X':
				res += 10; break;
			case 'V':
				res += 5; break;
			case 'I':
				res += 1; break;
			default:
				break;
			}
		} 
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "II";
		System.out.println(romanToInt(s));
	}

}
