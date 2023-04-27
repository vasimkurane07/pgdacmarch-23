package org.main.in;

import java.util.Scanner;

public class Program {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
}
