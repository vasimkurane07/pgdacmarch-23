package org.main.in;

public class Program1 {
	public static void print(int n) {
		if(n>=0) {
			System.out.print(n+" ");
			print(n-1);
		}	
	}
	public static void main(String[] args) {
		print(100);
	}
}

