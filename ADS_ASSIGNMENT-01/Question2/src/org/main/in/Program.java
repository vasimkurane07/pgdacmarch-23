package org.main.in;

import java.util.Scanner;

public class Program {
	public static int sum(int num) {
		if(num <= 1)
			return num;
		return num + sum(num - 1);
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println("result : "+sum(num));
	}
}
