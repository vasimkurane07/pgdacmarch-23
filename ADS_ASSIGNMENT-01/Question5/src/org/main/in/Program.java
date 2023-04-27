package org.main.in;

public class Program {
	static int palindrome(int n, int temp) {
		if(n==0)
			return temp;
		temp = (temp * 10) + (n % 10);
		return palindrome(n / 10 , temp);
	}
	public static void main(String[] args) {
		int n = 121;
		int temp = palindrome(n,0);
		if(temp == n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
