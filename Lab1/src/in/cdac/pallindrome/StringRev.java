package in.cdac.pallindrome;

import java.util.Scanner;

public class StringRev {
	
	
	public static void acceptString(String s,String s1)
	{
		
		try(Scanner sc = new Scanner(System.in);)
		{
	System.out.println("Enter the string to be reversed");
	s = sc.nextLine();	
	for(int i =0 ;i<s.length();i++)
	{
		if((int)s.charAt(i)>64&&(int)s.charAt(i)<91||(int)s.charAt(i)>96&&(int)s.charAt(i)<123||(int)s.charAt(i)==32)
		{
		char ch;
		ch = s.charAt(i);
		s1 = ch+s1;
		}
		else
			System.out.println("invalid input");
		
	}
	System.out.println("reverse string is :"+s1);
	}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			
		String  s = new String();
		String  s1 = new String();
		s1 =" ";
	
		StringRev.acceptString(s,s1);
		
		if(s.equals(s1))
		{
			System.out.println("string is pallindrome");
		}
		else
			System.out.println("string is not pallindrome");

	}
	

	}

