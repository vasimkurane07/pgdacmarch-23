package in.cdac.lab;

import java.util.Scanner;

public class SpecialChar {
	
	private static String remove(String n) {
		String str = n.replaceAll("[$ %  @ # ! * &]", "  ");
		return str;
	}
	public static void main(String[] args) {
		
	
	try (Scanner sc = new Scanner(System.in)) {
System.out.println("enter the string");
String  s = SpecialChar.remove(sc.nextLine());
System.out.println(s);
	}

}
}
