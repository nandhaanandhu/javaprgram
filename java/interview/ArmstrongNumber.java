package com.java.interview;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int r ;
		int sum = 0;
		
		
		while(a>0) {
			r = a%10;
			sum = (r*r*r)+sum;
			a=a/10;
		}
		if (temp == sum) {
			System.out.println("The given number is Armstrong :"+ temp);
		} 
		else {
			System.out.println("The given number is not an Armstrong number :"+temp);
		}

	}
	}
	

