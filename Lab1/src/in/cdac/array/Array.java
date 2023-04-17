package in.cdac.array;

import java.util.Scanner;



public class Array {
	static Scanner sc = new Scanner(System.in);
	private static int sumArray(int[] arr) {
		// TODO Auto-generated method stub
		try {
			int sum = 0 ;
			System.out.println("Enter the elements");
			for(int index = 0 ; index<arr.length;index++)
				arr[index] = sc.nextInt();
			
			for(int index = 0 ; index<arr.length;index++)
				sum = sum + arr[index];
			
			return sum;
			
		} catch (Exception e) {
			
			System.out.println("invalid input");
			
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size");
		int [] arr = new int[sc.nextInt()];
		int sum=sumArray(arr);
		System.out.println("the sum is :"+sum);

	}


}

