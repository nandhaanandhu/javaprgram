package com.assignment;

public class FrequentChar {

	public static void main(String[] args) {
		String s="nandha panneerselvam";
		char c ='a';
		int arr=0;
		for(int i=0;i<s.length();i++){
		    if(c==s.charAt(i)){
		        arr++;
		    }
		}
		System.out.println("Frequent character in name  " + c + " = "+ arr);
		    
	}

}
