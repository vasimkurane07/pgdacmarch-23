package org.main.in;

import java.util.Scanner;

public class Program {
	static int i = 0;
	public static void Table(int n) {
		if(i<10) {
		i++;
		int res = n*i;
		System.out.println(n+" * "+i+" = "+res);
		Table(n);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		Table(n);
	}
}
