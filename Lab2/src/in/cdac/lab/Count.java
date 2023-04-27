package in.cdac.lab;

import java.util.Scanner;

public class Count {
	private static int fun(int num) {
int count=0;
	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    
		return count;
	}


	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
System.out.println("enter the no");
int count = Count.fun(sc.nextInt());
System.out.println(count);
		 

		  }
		}

	}
	


