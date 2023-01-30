package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter First String:");
	        String s1=sc.nextLine();
	        
	        System.out.println("Enter Second String:");
	        String s2=sc.nextLine();

		if (s1.length() != s2.length()) {
	System.out.println("the two string is not anagram");
			return;
		}
		else {
			System.out.println("it is anagram");
		}
//		char[] a1 = s1.toCharArray();
//		char[] a2 = s2.toCharArray();
//		Arrays.sort(a1);
//		Arrays.sort(a2);
//		if (Arrays.equals(a1, a2)) {
//			System.out.println("two string are anagram");
//		} else {
//			System.out.println("two string not anagram");
//		}
	}

}
