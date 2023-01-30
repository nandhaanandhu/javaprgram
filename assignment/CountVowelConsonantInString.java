package com.assignment;

public class CountVowelConsonantInString {

	private static void subMethod() {
		
		String s = "mobileprogramming";
		int consonant = 0;
		int vowel = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		System.out.println("count of vowel :"+vowel);
		System.out.println("count of consonant :"+consonant);
	
	}
	public static void main(String[] args) {
		subMethod();
	}
}
