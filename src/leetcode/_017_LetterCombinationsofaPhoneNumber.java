package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _017_LetterCombinationsofaPhoneNumber {
	
	static Map<String, String> phone = new HashMap<String, String>(){{
		put("2", "abc");
		put("3", "def");
		put("4", "ghi");
		put("5", "jkl");
		put("6", "mno");
		put("7", "pqrs");
		put("8", "tuv");
		put("9", "wxyz");
	}};
	
	static List<String> res = new ArrayList<String>();
	
	public static void fun(String combine, String next_digits) {
		// if there is no more digits to check
		if (next_digits.length() == 0) {
			res.add(combine);
		}
		else {
			// iterate over all letters which map 
		    // the next available digit
			String digit = next_digits.substring(0, 1);
			String letters = phone.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				// append the current letter to the combination
		        // and proceed to the next digits
				String letter = letters.substring(i, i+1);
				fun(combine + letter, next_digits.substring(1));
			}
		}
	}
	
	public static List<String> letterCombinations(String digits) {
        
		if (digits.length() != 0) {
			fun("", digits);
		}
		return res;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String digits = "233";
		System.out.println(letterCombinations(digits));
	}

}
