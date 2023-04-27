package org.main.in;

public class Program1 {
	public static boolean checkPalindrome(String str, int index) {
		if(index >= str.length()/2)
			return true;
		if(str.charAt(index) != str.charAt(str.length()-index-1)) {
			return false;
		}
		return checkPalindrome(str, index +1);
	}
	public static void main(String[] args) {
		String str = "abababa";
		System.out.print(Program1.checkPalindrome(str,0));
	}
}
