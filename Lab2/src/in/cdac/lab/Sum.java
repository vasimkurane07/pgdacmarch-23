package in.cdac.lab;

import java.util.Scanner;

public class Sum {
	
	private static int fun(int n) {
		int sum = 0;
	
		while(n>0)
		{
			int rem = n%10;
			
			sum = sum +rem;
			n =n/10;
		}
	
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the no");
				int x= Sum.fun(sc.nextInt());
				System.out.println(x);

	}

	}
}


	