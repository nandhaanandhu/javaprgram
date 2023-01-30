package com.java.interview;

public class ReverseOfAString {

	private static void Reverse() {

		StringBuffer s = new StringBuffer("Mobile Programming");
		StringBuffer r = s.reverse();
		System.out.println(r);

	}
private static void withoutInBuilt() {
		String s = "java";
		System.out.println("Before Reverse "+s);
		System.out.print("After Reverse ");
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));

		}
	}

	public static void main(String[] args) {
		Reverse();

	

	

		withoutInBuilt();
}
}