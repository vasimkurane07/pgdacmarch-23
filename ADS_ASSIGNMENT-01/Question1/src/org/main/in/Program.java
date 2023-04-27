package org.main.in;

public class Program {
	public static void print(int n) {
		if(n<=100) {
		System.out.print(n+" ");
		
		print(n+1);
		}
	}
	public static void main(String[] args) {
		print(0);
	}
}
