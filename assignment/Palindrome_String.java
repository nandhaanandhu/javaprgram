package com.assignment;

import java.security.PublicKey;
import java.util.Scanner;

public class Palindrome_String {


	public static void main(String[] args) {
		String str;
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		
		int length= str.length();
		for(int i=length-1;i>=0;i--)
			 reverse=reverse+str.charAt(i);
		if(str.equals(reverse))
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
		
		
		
		
//		if (ispalindrome(str)) {
//			System.out.println("the string is palindrome");
//
//		} else {
//			System.out.println("the string is not palindrome");
//		}
//	}
//
//	public static boolean ispalindrome(String s) {
//		return s.equals(new StringBuilder(s).reverse().toString());

	}

}
