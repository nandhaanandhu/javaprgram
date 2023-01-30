package com.java.interview;

import java.util.Scanner;

public class Factorial {
	private static void subMethod() {
//		int a = 8;
//		int fact = 1;
		int a,fact = 1;
		
		Scanner s= new Scanner(System.in);
		 a=s.nextInt();
		 
		for (int i = 1; i <=a; i++) {
			 fact = fact*i;
		}
		System.out.println("the factorial of "+a+ "=" +fact);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
