package in.string;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in);)
		{
		
			String  s = new String();
			String  s1 = new String();
			s1 =" ";
			System.out.println("Enter the string to be reversed");
			s = sc.nextLine();
			System.out.println(s);
			
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
			System.out.println("the reverse string is :"+s1);
		
		}
		}
		
		

	}

}
