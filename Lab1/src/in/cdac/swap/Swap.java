package in.cdac.swap;

import java.util.Scanner;

public class Swap {
	
	private static void Swap(int a, int b)
	{
		// TODO Auto-generated method stub
	
		a = (a+b);
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+" b = "+b);
	}
	

		
	public static void main(String[] args) {
		int a, b ;
		System.out.println("Enter the two no to swapp ");
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a = "+a+" b = "+b);
		Swap(a,b);
		sc.close();
	}

	

}
